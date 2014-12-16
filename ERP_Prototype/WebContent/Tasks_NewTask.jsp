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
<!-- Page-Level Plugin CSS - Tables -->
    <link href="css/plugins/dataTables/dataTables.bootstrap.css" rel="stylesheet">

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
                  
				    <h4 class="page-header">Task | <span class="style2">Create New Task</span></h4> 
				</div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
			
			
			<div class="row">
                <div class="col-lg-12">
                  
				    <h6>Home > All Task > <b>New Task</b></h6>
				<br>					
				</div>
                <!-- /.col-lg-12 -->

					<div class="col-lg-4">

					<div><b>Fields marked with <span class="style1">*</span> must be filled</b></div>				
					<br>
					
						<div class="form-group">
							<label class="label1">Title: </label><span class="style1">*</span>
                    		<input class="form-control" name="#" placeholder="Enter User Name">    
                    	</div>
						
						<div class="form-group">
                             <label class="label1">Text area</label></label><span class="style1">*</span>
                             <textarea class="form-control" rows="3"></textarea>
                        </div>
						
						<div class="form-group">
                            <label class="label1">Attach a file(500KB max)</label>
                            <input type="file">
                        </div>
				
					<div class="form-group">
                    <label class="label1">Department: </label>
						<select class="form-control" name="department_name">
							<option>Select Department</option>
                            <option>BE-CSE</option>
							<option>BE-ISE</option>
							<option>BE-CIVIL</option>
							<option>BE-MECHANICAL</option>
                        </select>
                    </div>
					
					<!--<div class="form-group">
                    <label class="label1">Select Members: </label>
						<div class="boxarea">
							<P>Select All</P>
							<p class="style2">jamaluddin</p>

						</div>
					</div>
					-->
					<div class="form-group">
                    <label class="label1">Course: </label>
						<select class="form-control" name="department_name">
							<option>Select Course</option>
                            <option>BE-CSE-BE-CSE-2014-18</option>
							<option>BE-ISE-BE-ISE-2014018</option>
                        </select>
                    </div>
					
					<!--<div class="form-group">
                    <label class="label1">Select Members: </label>
						<div class="boxarea">
							<P>Select All</P>
							<p class="style2">jamaluddin</p>

						</div>
					</div>
					-->
					
						<div class="form-group">
							<label class="label1">Start Date: </label>
                    		<input class="form-control" type="date" name="#">    
                    	</div>
						
						
						<div class="form-group">
							<label class="label1">End Date: </label>
                    		<input class="form-control" type="date" name="#">    
                    	</div>
					
				</div>
                <!-- /.col-lg-4 -->
				
				<div class="col-lg-1"></div>
				
				<div class="col-lg-4">
					<div class="form-group">
                    <label class="label1">Members: </label>
						<div class="boxarea">
							<p class="style2">Admin User:</p>
							
						</div>
					</div>
				
				</div>
                
                <!-- /.col-lg-6 -->
				
								  <button type="button" class="btn btn-default">Save</button>
           </div>
            <!-- /.row -->
			<br>
			
        </div>
        <!-- /#page-wrapper -->

<!--End of Main page-->


    </div>
    <!-- /#wrapper -->

    <!-- Core Scripts - Include with every page -->
    <script src="js/jquery-1.10.2.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>

    <!-- Page-Level Plugin Scripts - Blank -->

    <!-- SB Admin Scripts - Include with every page -->
    <script src="js/sb-admin.js"></script>

    <!-- Page-Level Demo Scripts - Blank - Use for reference -->

</body>

</html>
