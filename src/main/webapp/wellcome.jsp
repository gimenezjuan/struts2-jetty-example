<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<!DOCTYPE html>
<html>
<head>
  <title><s:text name="hello.message"/></title>
  <s:head/>
  <sx:head/>

</head>
<body>

    <h1>Resumen de factura:  </h1>
     <p>Asunto: <s:property value="invoiceBean.subject"/></p>
      <p>Desde: <s:property value="invoiceBean.dateFrom"/></p>
      <p>Hasta: <s:property value="invoiceBean.dateTo"/></p>
      <p>Monto: <s:property value="invoiceBean.amount"/></p>
</body>
</html>