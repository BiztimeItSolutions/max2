<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>campus_G</title>

    <!-- Core CSS - Include with every page -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet">

    <!-- Page-Level Plugin CSS - Blank -->

    <!-- SB Admin CSS - Include with every page -->
    <link href="css/sb-admin.css" rel="stylesheet">

    <style type="text/css">
<!--

.style1 {color: #FF0000}
.style2 {font-size: 12px}
-->
    </style>
	
</head>
<body>
    <div id="wrapper">

<!-- Header--><%@ include file="Header.jsp" %>
<!-- Left Menu --><%@ include file="LeftMenu.jsp" %>

<!--Start of Main page-->

        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                  
				    <h4 class="page-header">CSV Data Export | <span class="style2">General CSV Format</span></h4> 
				</div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
			
			<div class="row">
			
                <div class="col-lg-12">
                  
				    <h6>Home > All Export > <b>New Export</b></h6>
					<br>
				</div>
                <!-- /.col-lg-12 -->
				
				<div class="col-lg-4">
				
					<div class="form-group">
						<label class="label1">Name: </label><span class="style1">*</span>
                    	<input class="form-control" name="#" placeholder="Enter Name">    
                    </div>
				
				
					<div class="form-group">
                    <label class="label1">Model: </label><span class="style1">*</span>
						<select class="form-control" name="department_name">
							<option>Select Model</option>
                            <option>Employee Admission</option>
							<option>Student Admission</option>
							<option>Guardian Addition</option>
							<option>Student Attanance</option>
							<option>Library Book</option>
                        </select>
                    </div>
					
					
	                    <div class="form-group">
    	                    <label class="label1">Associated Data:</label><span class="style1">*</span>
                	        <div class="boxarea">
							       <label class="checkbox-inline">
        		                     <input type="checkbox">Book Additional Details
                    	         </label>
                            	 <label class="checkbox-inline">
                                      <input type="checkbox">Tags
                             	 </label>
							 </div>
							 <br>
                      </div>
					  
					  
				
				</div>
                <!-- /.col-lg-4 -->
				

				
				<div class="col-lg-4">
					<div class="form-group">
                    <label class="label1">Select Batch: </label><span class="style1">*</span>
						<div class="boxarea"><p>Select: <a href="#">All,</a> <a href="#">None</a></p>
						<p><a href="#">Book Additional Details</a></p>
						<div class="dividerall1"></div>
						<label class="checkbox-inline">
                                      <input type="checkbox"><span class="style2">Name</span>
                        </label>
						<div class="dividerall1"></div>
						<p><a href="#">Tags</a></p>
						<label class="checkbox-inline">
                                      <input type="checkbox"><span class="style2">Reference Book</span>
                        </label>
						
						</div>
					</div>
				
				</div>
                <!-- /.col-lg-6 -->
				<br>
				<div class="col-lg-12">
				<br>
					<button type="button" class="btn btn-default">Save</button>
				</div>
           </div>
            <!-- /.row -->


				
        </div>
        <!-- /#page-wrapper -->

<!--End of Main page-->


    </div>
    <!-- /#wrapper -->


    <!-- Core Scripts - Include with every page -->
    <script src="js/jquery-1.10.2.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>

    <!-- Page-Level Plugin Scripts - Tables -->
    <script src="js/plugins/dataTables/jquery.dataTables.js"></script>
    <script src="js/plugins/dataTables/dataTables.bootstrap.js"></script>

    <!-- SB Admin Scripts - Include with every page -->
    <script src="js/sb-admin.js"></script>

    <!-- Page-Level Demo Scripts - Tables - Use for reference -->
    <script>
    $(document).ready(function() {
        $('#dataTables-example').dataTable();
    });
    </script>

</body>

</html>
