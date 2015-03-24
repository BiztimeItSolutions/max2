<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>campus_G</title>

<!-- Core CSS - Include with every page -->

<!-- Core CSS - Include with every page -->
<link href="<c:url value="/resources/css/bootstrap.css"/>"
	rel="stylesheet">

<link
	href="<c:url value="/resources/font-awesome/css/font-awesome.css"/>"
	rel="stylesheet">
<link href="<c:url value="/resources/css/sb-admin.css"/>"
	rel="stylesheet">

<script src="<c:url value="/resources/js/validate/countries.js" />"></script>
<link href="<c:url value="/resources/css/jquery-ui.css"/>" rel="stylesheet">


</head>


<body>

    
<!--Start of Main page-->


 <!-- Header--><%@ include file="Header.jsp" %>
 <!-- Left Menu --><%@ include file="LeftMenu.jsp" %> 

<div id="page-wrapper">

		<div class="row">
			<div class="col-lg-12">

				<h4 class="page-header">
					Account | <span class="style2"> Account Details</span>
				</h4>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		
		<div class="row">
			<div class="col-lg-6">
				<h6>
			        Home > Student Admission > <b>Document</b>
				</h6>

			</div>
			<!--col 6 -->
		</div>
		<!--row -->
		
		<br />
		<div class="row">
			<div class="col-lg-12">

				<div class="form-group">
					<label>Fields Marked with <span class="style1">*</span>
						must be filled
					</label>
				</div>
</div></div>
<br/>
<div class="row">
<form:form method="POST" commandName="feeCommand" id=""
						action="${pageContext.request.contextPath}/saveDocument">
						
					<div class="col-lg-5">
					
                                <div class="form-group">
									<label class="label1">Student ID</label> <span class="style1"></span>
									<form:input path="candidate.candidate_id" name="candidate_id" type="text" class="form-control" value="${p.candidate_id}"/>
								</div>  
								<br/>
								  <div class="table-responsive">
								  <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th>chk</th>
                                            <th>Document</th>
                                       </tr>
                                    </thead>
                                    <tbody>
                                    
                                    <c:forEach items="${d}" var="DOCUMENT">

                          <tr class="odd gradeX">
                         <td align="center">
                         <form:checkbox path="studentFee.documentName"  value="${DOCUMENT.documentName}"/>
                   </td>
                          <td><c:out value="${DOCUMENT.documentName}"/></td>
                          </tr> 
                                        </c:forEach>
                                        </tbody>
                                </table>
					              </div> 
                	     <br>
                	 

					<button type="submit" class="btn btn-primary"> Submit</button>
					</div>
					</form:form>
				</div>

</div>
<!--End of Main page-->


<!-- Core Scripts - Include with every page -->
	<script src="<c:url value="/resources/js/jquery-1.7.min.js" />"></script>
	<script src ="<c:url value="/resources/js/jquery-ui.js"/>"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	<script src="<c:url value="/resources/js/plugins/metisMenu/jquery.metisMenu.js" />"></script>
	<script src="<c:url value="/resources/js/sb-admin.js" />"></script>
 
<!-- TODO

 <script type="text/javascript" src="http://code.jquery.com/jquery-1.7.1.js"></script> -->
 
	   <script type="text/javascript">
        function updateTextArea() {

            var allVals = [];
            $('#mydiv :checked').each(function () {
                allVals.push($(this).val());
            });
            $('#txtValue').val(allVals)
        }
        $(function () {
            $('#mydiv input').click(updateTextArea);
            updateTextArea();
        });

    </script>

</body>

</html>


