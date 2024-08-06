package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.demo.actions.beans.InvoiceBean;

public class InvoiceAction extends ActionSupport  {

    InvoiceBean invoiceBean;

    @Override
    public String execute() throws Exception {
        System.out.println("execute!!");
        return SUCCESS;
    }

    public InvoiceBean getInvoiceBean() {
        return invoiceBean;
    }

    public void setInvoiceBean(InvoiceBean invoiceBean) {
        this.invoiceBean = invoiceBean;
    }
    @Override
    public void validate() {
        if (invoiceBean.getSubject().isEmpty()) {
            addFieldError("invoiceBean.subject", "El concepto es obligatorio.");
        }
        if (invoiceBean.getDateFrom() == null) {
            addFieldError("invoiceBean.subject", "Es obligatorio la fecha de inicio.");
        }
        if (invoiceBean.getDateTo() == null) {
            addFieldError("invoiceBean.subject", "Es obligatorio la fecha de fin.");
        }
        if (invoiceBean.checkDates(invoiceBean.getDateTo(),invoiceBean.getDateFrom())){
            addFieldError("invoiceBean.subject", "La fecha fin NO puede ser antes que la de inicio.");
        }
    }
}
