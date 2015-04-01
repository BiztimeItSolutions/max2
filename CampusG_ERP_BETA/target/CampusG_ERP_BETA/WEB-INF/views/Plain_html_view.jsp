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
<h3>Basic Info</h3>
<table width="500" cellspacing="3" cellpadding="3">
  <tr>
    <td>Candidate ID</td>
    <td><c:out value="${p.candidate_id}"/></td>
  </tr>
  <tr>
    <td>course_level</td>
    <td><c:out value="${p.course_level}"/></td>
  </tr>
  <tr>
    <td>program</td>
    <td><c:out value="${p.program}"/></td>
  </tr>
  <tr>
    <td>department</td>
    <td><c:out value="${p.department}"/></td>
  </tr>
  <tr>
    <td>course_name</td>
    <td><c:out value="${p.course_name}"/></td>
  </tr>
</table>

</div>

<div>
<h3>Personal</h3>
<table width="500" cellspacing="3" cellpadding="3">
  <tr>
    <td>Full Name</td>
    <td><c:out value="${p.firstname}"/><c:out value="${p.middlename}"/> <c:out value="${p.lastname}"/></td>
    
  </tr>
  <tr>
    <td>Date Of Birth</td>
    <td><c:out value="${p.dateofbirth}"/></td>
  </tr>
  <tr>
    <td>Gender</td>
    <td><c:out value="${p.gender}"/></td>
  </tr>
  <tr>
    <td>Blood Group</td>
    <td><c:out value="${p.bloodgroup}"/></td>
  </tr>
  <tr>
    <td>Nationality</td>
    <td><c:out value="${p.birthplace}"/></td>
  </tr>
  <tr>
    <td>Birth Place</td>
    <td><c:out value="${p.nationality}"/></td>
  </tr>
  <tr>
    <td>Mother tounge</td>
    <td><c:out value="${p.mothertongue}"/></td>
  </tr>
  <tr>
    <td>category</td>
    <td><c:out value="${p.category}"/></td>
  </tr>
  <tr>
    <td>religion</td>
    <td><c:out value="${p.religion}"/></td>
  </tr>
  <tr>
    <td>caste</td>
    <td><c:out value="${p.caste}"/></td>
  </tr>
  <tr>
    <td>extracurricular</td>
    <td><c:out value="${p.extracurricular}"/></td>
  </tr>
</table>
</div>

<div>
<h3>Contact Details</h3>
<table width="500" cellspacing="5" cellpadding="5">
  <tr>
    <td colspan="2"><b>Present Address</b></td>
  </tr>
  <tr>
    <td>Address Line1</td>
    <td><c:out value="${p.presentaddressline1}"/></td>
  </tr>
  <tr>
    <td>Address Line2</td>
    <td><c:out value="${p.presentaddressline2}"/></td>
  </tr>
  <tr>
    <td>presentaddresscity</td>
    <td><c:out value="${p.presentaddresscity}"/></td>
  </tr>
  
  <tr>
    <td>presentaddresspincode</td>
    <td><c:out value="${p.presentaddresspincode}"/></td>
  </tr>
  
  <tr>
    <td>presentaddresscountry</td>
    <td><c:out value="${p.presentaddresscountry}"/></td>
  </tr>
  
  <tr>
    <td>presentaddressstate</td>
    <td><c:out value="${p.presentaddressstate}"/></td>
  </tr>
  
  <tr>
    <td colspan="2"><b>Permanenet Address</b></td>
  </tr>
  <tr>
    <td>Address Line1</td>
    <td><c:out value="${p.permanentaddressline1}"/></td>
  </tr>
  <tr>
    <td>Address Line2</td>
    <td><c:out value="${p.permanentaddressline2}"/></td>
  </tr>
  <tr>
    <td>presentaddresscity</td>
    <td><c:out value="${p.permanentaddresscity}"/></td>
  </tr>
  
  <tr>
    <td>presentaddresspincode</td>
    <td><c:out value="${p.permanentaddresspincode}"/></td>
  </tr>
  
  <tr>
    <td>presentaddresscountry</td>
    <td><c:out value="${p.permanentaddresscountry}"/></td>
  </tr>
  
  <tr>
    <td>presentaddressstate</td>
    <td><c:out value="${p.permanentaddressstate}"/></td>
  </tr>
  <tr>
    <td colspan="2"><b>Emergency Address</b></td>
  </tr>
  <tr>
    <td>Address Line1</td>
    <td><c:out value="${p.emergencyaddressline1}"/></td>
  </tr>
  <tr>
    <td>Address Line2</td>
    <td><c:out value="${p.emergencyaddressline2}"/></td>
  </tr>
  <tr>
    <td>presentaddresscity</td>
    <td><c:out value="${p.emergencyaddresscity}"/></td>
  </tr>
  
  <tr>
    <td>presentaddresspincode</td>
    <td><c:out value="${p.emergencyaddresspincode}"/></td>
  </tr>
  
  <tr>
    <td>presentaddresscountry</td>
    <td><c:out value="${p.emergencyaddresscountry}"/></td>
  </tr>
  
  <tr>
    <td>presentaddressstate</td>
    <td><c:out value="${p.emergencyaddressstate}"/></td>
  </tr>
  <tr>
    <td colspan="2"><b>Comman Details</b></td>
  </tr>
  <tr>
    <td>phone</td>
    <td><c:out value="${p.phone}"/></td>
  </tr>
  <tr>
    <td>Mobile</td>
    <td><c:out value="${p.mobile}"/></td>
  </tr>
  <tr>
    <td>email</td>
    <td><c:out value="${p.email}"/></td>
  </tr>
  
  </table>
</div>

<div>
<h3>Parent details</h3>
<table width="500" cellspacing="3" cellpadding="3">
  <tr>
    <td rowspan="3">Guardian Information</td>
    <td><c:out value="${p.guardianfirstname}"/></td>
    <td><c:out value="${p.guardianmiddlename}"/></td>
    <td><c:out value="${p.guardianlastname}"/></td>
  </tr>
  <tr>
    <td><c:out value="${p.guardinrelation}"/></td>
    <td><c:out value="${p.guardinoccupation}"/></td>
    <td><c:out value="${p.guardintelres}"/></td>
  </tr>
  <tr>
    <td><c:out value="${p.guardinteloff}"/></td>
    <td><c:out value="${p.guardinmobile}"/></td>
    <td><c:out value="${p.guardinemail}"/></td>
    <td><c:out value="${p.guardinanualincome}"/></td>
  </tr>
  <tr>
    <td rowspan="3">Father Information</td>
    <td><c:out value="${p.fatherfirstname}"/></td>
    <td><c:out value="${p.fathermiddlename}"/></td>
    <td><c:out value="${p.fatherlastname}"/></td>
  </tr>
  <tr>
    <td><c:out value="${p.fatheranualincome}"/></td>
    <td><c:out value="${p.fatheroccupation}"/></td>
    <td><c:out value="${p.fathertelres}"/></td>
  </tr>
  <tr>
    <td><c:out value="${p.fatherteloff}"/></td>
    <td><c:out value="${p.fathermobile}"/></td>
    <td><c:out value="${p.fatheremail}"/></td>
    
  </tr>
  <tr>
    <td rowspan="3">Mother Information</td>
    <td><c:out value="${p.motherfirstname}"/></td>
    <td><c:out value="${p.mothermiddlename}"/></td>
    <td><c:out value="${p.motherlastname}"/></td>
  </tr>
  <tr>
    <td><c:out value="${p.motheranualincome}"/></td>
    <td><c:out value="${p.motheroccupation}"/></td>
    <td><c:out value="${p.mothertelres}"/></td>
  </tr>
  <tr>
    <td><c:out value="${p.motherteloff}"/></td>
    <td><c:out value="${p.mothermobile}"/></td>
    <td><c:out value="${p.motheremail}"/></td>
    
  </tr>
  </table>
</div>

<div>
<h3>Educational Details</h3>
<table width="500" cellspacing="5" cellpadding="5">
  <tr>
    <td>College/School</td>
    <td><c:out value="${p.collegename}"/></td>
  </tr>
  <tr>
    <td>Date of Entry</td>
    <td><c:out value="${p.dateofentry}"/></td>
  </tr>
  <tr>
    <td>Date of Leaving</td>
    <td><c:out value="${p.dateofleaving}"/></td>
  </tr>
  <tr>
    <td>University</td>
    <td><c:out value="${p.university}"/></td>
  </tr>
  <tr>
    <td>Date of Entry University</td>
    <td><c:out value="${p.dateofentryuniversity}"/></td>
  </tr>
  <tr>
    <td>Date of lLaving University</td>
    <td><c:out value="${p.dateofleavinguniversity}"/></td>
  </tr>
  <tr>
    <td>Qualifying Examination</td>
    <td><c:out value="${p.qualifyingexamination}"/></td>
  </tr>
  <tr>
    <td>Number Of Attempts</td>
    <td><c:out value="${p.numberofattempts}"/></td>
  </tr>
  <tr>
    <td>Year of Passing</td>
    <td><c:out value="${p.yop}"/></td>
  </tr>
  <tr>
    <td>registernumber</td>
    <td><c:out value="${p.registernumber}"/></td>
  </tr>
  <tr>
    <td>Physics</td>
    <td><c:out value="${p.optionalsubjectphysicsavgmarks}"/></td>
  </tr>
  <tr>
    <td>Maths</td>
    <td><c:out value="${p.optionalsubjectmathsavgmarks}"/></td>
  </tr>
  <tr>
    <td><c:out value="${p.optionalsubjectopt}"/></td>
    <td><c:out value="${p.optionalsubjectoptavgmarks}"/></td>
  </tr>
  <tr>
    <td>Avg Percentage</td>
    <td><c:out value="${p.avgpercentage}"/></td>
  </tr>
  </table>
</div>

<div>
<h4><a href="downloadPDF?id=${p.candidate_id}" target="_blank">Download PDF Document</a></h4>
</div>


</body>
</html>