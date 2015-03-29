<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="true"%><html xmlns="http://www.w3.org/1999/xhtml">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>campus_G</title>
<!-- Core CSS - Include with every page -->

<!-- Core CSS - Include with every page -->
<link href="<c:url value="/resources/css/bootstrap.css"/>"	rel="stylesheet">
<link href="<c:url value="/resources/font-awesome/css/font-awesome.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/sb-admin.css"/>" rel="stylesheet">

<!-- Page-Level Plugin CSS - Tables -->
<link href="<c:url value="/resources/css//plugins/dataTables/dataTables.bootstrap.css"/>" rel="stylesheet">

</head>
<body>

<div id="wrapper">

<%@ include file="Header.jsp" %>
<%@ include file="Left_menu.jsp" %>

<!--Start of Main page-->
        <div id="page-wrapper">

            <div class="row">
                <div class="col-lg-12">
                  
				    <h4 class="page-header">Home</h4> 
				</div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
			
				
        </div>
        <!-- /#page-wrapper -->
<!--End of Main page-->
    </div>
    <!-- /#wrapper -->

  <!-- Core Scripts - Include with every page -->
	<script src="<c:url value="/resources/js/jquery-1.7.min.js" />"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	<script src="<c:url value="/resources/js/plugins/metisMenu/jquery.metisMenu.js" />"></script>
	<script src="<c:url value="/resources/js/sb-admin.js" />"></script>

     <!-- Page-Level Plugin Scripts - Tables -->
     <script src="<c:url value="/resources/js/plugins/dataTables/jquery.dataTables.js"/>"></script>
     <script src="<c:url value="/resources/js/plugins/dataTables/dataTables.bootstrap.js"/>"></script>
 	 <script src="<c:url value="/resources/js/Leftmenu_Generator.js" />"></script>  	 
   
   <input type="text" value="${privilege}" id="privText"/>
   <c:set var="privText" value="${privilege}" scope="session"></c:set>
  
  
</body>

</html>
