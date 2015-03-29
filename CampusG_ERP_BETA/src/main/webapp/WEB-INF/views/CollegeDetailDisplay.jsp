<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%><html xmlns="http://www.w3.org/1999/xhtml">
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

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

    <!-- Header--><%@ include file="Header.jsp" %>
 <!-- Left Menu --><%@ include file="LeftMenu.jsp" %> 

<div id="page-wrapper">
	
	
	<div style="float:left;width:50%;height:20%" id="messageDiv">
		<c:set var="success" value="${success}"/>
	    <c:if test="${success >= 1}">
		
				<div class="alert alert-success" id="successDiv">
					<button class="close" aria-hidden="true" data-dismiss="alert" type="button">×</button>
     				Data saved successfully!
     			</div>
     	
	</c:if>	
	<c:if test="${success==0}">
				<div class="alert alert-danger">
				<button class="close" aria-hidden="true" data-dismiss="alert" type="button">×</button>
                  Data not saved. Please, try again with right information.
        	    </div>
	</c:if>	
		
</div><!-- row -->	


	<h4>View College Details
	<p align="right"><a href="masterpage"><img src="resources/images/add.png" width="16" height="16"><strong>Add</strong></a></p></h4> 
			<div class="row">
                <div class="col-lg-12">
				
					<div class="panel panel-default">
                        <div class="panel-heading">
                             <!-- <p align=""><a href="masterpage"><img src="images/add.png" width="16" height="16"><strong>Add</strong></a></p> -->
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="table-responsive">
                            
                          
                          
                               
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                   
                                   <tr>
                                           
                                            <th>College ID</th>
                                            <th>College Name</th>
                                            <!-- <th>College Code</th>
                                             <th>University Id</th>
                                            <th>College Address</th> -->
                                            <th>College Phone Number</th>
                                            <th>College Email</th>
                                            
                                            <th>Action</th>
                                           
                                             
                                          <!--   <th>Status</th> -->
                                            
                                            
                                        </tr>
                                    </thead>
                                    <tbody>
                   
					           
                                    <c:forEach items="${p}" var="c">
                           

                                        <tr class="odd gradeX">
                                           <td><c:out value="${c.collegeId}"/></td> 
                                            <td><c:out value="${c.collegeName}"/>
                                           
                                            <td><c:out value="${c.collegePhone}"/></td>
                                            <td><c:out value="${c.collegeEmail}"/></td>
                                             
                                            
                                        <td>    
                                               <a href="toviewcompletecollegeDetail?collegeId=${c.collegeId}">View</a> / 
										    	<a href="toeditcollegeDetail?collegeId=${c.collegeId}"><img src="resources/images/edit.png" width="16" height="16"></a> /
										    	<a href="todeletecollegeDetail?collegeId=${c.collegeId}" class="deleteconfirmation" ><img src="resources/images/delete16.png" width="16" height="16"></a>
										    	
										</td>
										
								
									

                                        </tr> 
                                        </c:forEach>
                                
                                
                        
                                        </tbody>
                                </table>
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
				
				
				</div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
	
        	</div><!-- /#page-wrapper -->
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
    

    <!-- Page-Level Demo Scripts - Tables - Use for reference -->
    <script>
    $(document).ready(function() {
        $('#dataTables-example').dataTable();
    });
    </script>
 
 <!-- 
     if($('#ad_checkbox').is(':checked')){
    	alert("check box checked"+this.id);
    	$( "#x" ).prop( "checked", false );  -->
       
    <script>
     $("#ad_checkbox").click(function() {  
    var $checkbox = jQuery(this);
    var checkboxData = $checkbox.val();
    var cid=$("#cid").val();
    jQuery.ajax({
       url: "approve_checkbox.html",
       type: "POST",
       data: {checkboxData,cid},
       cache: false,
       dataType: "json",
       success: function(data) {
           alert('saved')
      }
   });
});
    
    </script>
    
<script type="text/javascript">
var elems = document.getElementsByClassName('deleteconfirmation');
    var confirmIt = function (e) {
        if (!confirm('Are you sure?')) e.preventDefault();
    };
    for (var i = 0, l = elems.length; i < l; i++) {
        elems[i].addEventListener('click', confirmIt, false);
    }
</script>
    


    
</body>

</html>
