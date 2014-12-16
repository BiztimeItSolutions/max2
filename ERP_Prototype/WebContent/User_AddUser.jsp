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
                  
				    <h4 class="page-header">Create User | <span class="style2">Make new admin user</span></h4> 
				</div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
			
			<div class="row">
                <div class="col-lg-6">
                  
				    <h6>Home > User > <b>Add User</b></h6>
					
				</div>
                <!-- /.col-lg-6 -->
            </div>
            <!-- /.row -->
			
			</br>

	
	
			<div class="row">
				<div class="col-lg-4"></div>
                <div class="col-lg-4">
				
					<div><b>Fields marked with <span class="style1">*</span> must be filled</b></div>				
					<br>
					<div class="form-group">
						<label class="label1">UserName: </label><span class="style1">*</span>
                    	<input class="form-control" name="#" placeholder="Enter User Name">    
                    </div>
					
					<div class="form-group">
						<label class="label1">First Name: </label><span class="style1">*</span>
                    	<input class="form-control" name="#" placeholder="Enter User Name">    
                    </div>
					
					<div class="form-group">
						<label class="label1">Last Name: </label><span class="style1">*</span>
                    	<input class="form-control" name="#" placeholder="Enter User Name">    
                    </div>
					
					<div class="form-group">
						<label class="label1">Password: </label><span class="style1">*</span>
                    	<input class="form-control" type="password" name="#" placeholder="Enter User Name">    
                    </div>
					
					<div class="form-group">
						<label class="label1">Email: </label><span class="style1">*</span>
                    	<input class="form-control" type="email" name="#" placeholder="Enter User Name">    
                    </div>
					
					<div class="form-group">
                    <label class="label1">User Type: </label><span class="style1">*</span>
						<select class="form-control" name="department_name">
							<option>--Select User Type--</option>
                            <option>Admin</option>
							<option>HOD</option>
							<option>Faculty Member</option>
							<option>Student</option>
                        </select>
                    </div>
					
					
					<div class="form-group">
                    <label class="label1">Department: </label><span class="style1">*</span>
						<select class="form-control" name="department_name">
							<option>--Select Depatment--</option>
                            <option>CS</option>
							<option>IS</option>
							<option>Civil</option>
							<option>Mechanical</option>
                        </select>
                  </div>
				  
				  <br>
				  
				  <button type="button" class="btn btn-default">Default</button>
                  <button type="button" class="btn btn-primary">Primary</button>
                  <button type="button" class="btn btn-outline btn-primary">Primary</button>              
				
				
				
				</div>
                <!-- /.col-lg-6 -->
				<div class="col-lg-4"></div>
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

    <!-- Page-Level Plugin Scripts - Blank -->

    <!-- SB Admin Scripts - Include with every page -->
    <script src="js/sb-admin.js"></script>

    <!-- Page-Level Demo Scripts - Blank - Use for reference -->

</body>

</html>
