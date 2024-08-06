package org.demo.actions.beans;

import java.util.Date;

public class InvoiceBean {

    private String subject;
    private Date dateFrom;
    private Date dateTo;
    private Double amount;

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }


    public String getSubject() {
        return subject;
    }

    public Double getAmount() {
        return AddIVA(amount);
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public boolean checkDates(Date dateTo, Date dateFrom) {
        this.dateTo = dateTo;
        this.dateFrom = dateFrom;

        return dateTo.before(dateFrom);
    }

    private double AddIVA(double baseAmount){
        double IVA = 0.21;
        return  baseAmount * (1+IVA);
    }
}
