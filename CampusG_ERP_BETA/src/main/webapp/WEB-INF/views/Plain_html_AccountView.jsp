<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Form Details</h2>
<div>
<h3>Account Detail</h3>
    <c:forEach items="${p}" var="f">
<table width="500" cellspacing="3" cellpadding="3">
 

  <tr>
    <td>Candidate ID</td>
    <td><c:out value="${f.candidate_id}"/></td>
  </tr> 
    <tr>
    <td>Student Fee</td>
    <td><c:out value="${f.studentFeeId}"/></td>
  </tr>  
  <tr>
    <td>Fee </td>
    <td><c:out value="${f.feeName}"/></td>
  </tr>
   <tr>
    <td>Mode Of Payment</td>
    <td><c:out value="${f.paymentName}"/></td>
  </tr>
  <tr>
    <td>Receipt Book</td>
    <td><c:out value="${f.receiptName}"/></td>
  </tr>
  
   <tr>
    <td>Date </td>
    <td><c:out value="${f.date}"/></td>
  </tr>
  
  <tr>
    <td>Amount </td>
    <td><c:out value="${f.amount}"/></td>
  </tr> 
</table>

<div>
<h4><a href="downloadAccount?id=${f.studentFeeId}" target="_blank">Print</a></h4> 
</div>
</c:forEach>
</div>

</body>
</html>