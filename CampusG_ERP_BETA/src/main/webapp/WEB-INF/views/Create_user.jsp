<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>

<html>

<head>

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

</head>


<body>

    <div id="wrapper">

        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand1" href="index.html"><!--SB Admin v2.0--><img src="images/Biztime_Logo.png" width="250" height="60"></a>
            </div>
            <!-- /.navbar-header -->

            <ul class="nav navbar-top-links navbar-right">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-envelope fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-messages">
                        <li>
                            <a href="#">
                                <div>
                                    <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                </div>
                                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                </div>
                                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                </div>
                                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a class="text-center" href="#">
                                <strong>Read All Messages</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-messages -->
                </li>
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">

                        <i class="fa fa-tasks fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-tasks">
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>Task 1</strong>
                                        <span class="pull-right text-muted">40% Complete</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                            <span class="sr-only">40% Complete (success)</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>Task 2</strong>
                                        <span class="pull-right text-muted">20% Complete</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
                                            <span class="sr-only">20% Complete</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>Task 3</strong>
                                        <span class="pull-right text-muted">60% Complete</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                                            <span class="sr-only">60% Complete (warning)</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>Task 4</strong>
                                        <span class="pull-right text-muted">80% Complete</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
                                            <span class="sr-only">80% Complete (danger)</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a class="text-center" href="#">
                                <strong>See All Tasks</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-tasks -->
                </li>
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-bell fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-alerts">
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-comment fa-fw"></i> New Comment
                                    <span class="pull-right text-muted small">4 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-twitter fa-fw"></i> 3 New Followers
                                    <span class="pull-right text-muted small">12 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-envelope fa-fw"></i> Message Sent
                                    <span class="pull-right text-muted small">4 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-tasks fa-fw"></i> New Task
                                    <span class="pull-right text-muted small">4 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-upload fa-fw"></i> Server Rebooted
                                    <span class="pull-right text-muted small">4 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a class="text-center" href="#">
                                <strong>See All Alerts</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-alerts -->
                </li>
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
                        </li>
                        <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
            <!-- /.navbar-top-links -->

        </nav>
        <!-- /.navbar-static-top -->

        <nav class="navbar-default navbar-static-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="side-menu">
<!--                    <li class="sidebar-search">
                        <div class="input-group custom-search-form">
                            <input type="text" class="form-control" placeholder="Search...">
                            <span class="input-group-btn">
                                <button class="btn btn-default" type="button">
                                    <i class="fa fa-search"></i>
                                </button>
                            </span>
                        </div>

                    </li>-->   <!-- /input-group -->
                    <li  class="active">
                        <a href="#"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Administration<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">Flot Charts</a>
                            </li>
                            <li>
                                <a href="#">Morris.js Charts</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
					
					<li>
                        <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Academics <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">Flot Charts</a>
                            </li>
                            <li>
                                <a href="#">Morris.js Charts</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                   
                   
				   
				    <li>
                        <a href="#"><i class="fa fa-wrench fa-fw"></i> Data and Exports <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">Panels and Wells</a>
                            </li>
                            <li>
                                <a href="#">Buttons</a>
                            </li>
                            <li>
                                <a href="#">Notifications</a>
                            </li>
                            <li>
                                <a href="#">Typography</a>
                            </li>
                            <li>
                                <a href="#">Grid</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                    
					
					
					<li>
                        <a href="#"><i class="fa fa-sitemap fa-fw"></i> Collaborations <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">Second Level Item</a>
                            </li>
                            <li>
                                <a href="#">Second Level Item</a>
                            </li>
                            <li>
                                <a href="#">Third Level <span class="fa arrow"></span></a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a href="#">Third Level Item</a>
                                    </li>
                                    <li>
                                        <a href="#">Third Level Item</a>
                                    </li>
                                    <li>
                                        <a href="#">Third Level Item</a>
                                    </li>
                                    <li>
                                        <a href="#">Third Level Item</a>
                                    </li>
                                </ul>
                                <!-- /.nav-third-level -->
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
					


					<li>
                        <a href="#"><i class="fa fa-sitemap fa-fw"></i> Collaborations_1 <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">Second Level Item</a>
                            </li>
                            <li>
                                <a href="#">Second Level Item</a>
                            </li>
							<li>
                                <a href="#">Second Level Item</a>
                            </li>
                            <li>
                                <a href="#">Third Level <span class="fa arrow"></span></a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a href="#">Third Level Item</a>
                                    </li>
                                    <li>
                                        <a href="#">Third Level Item</a>
                                    </li>
                                    <li>
                                        <a href="#">Third Level Item</a>
                                    </li>
                                    <li>
                                        <a href="#">Fourth Level Item<span class="fa arrow"></span></a>
										<ul class="nav nav-fourth-level">
                                   		 	<li>
                                        		<a href="#">Fourth Level Item</a>
                                    		</li>
                                    		<li>
                                        		<a href="#">Fourth Level Item</a>
                                    		</li>
                                    		<li>
                                        		<a href="#">Fourth Level Item</a>
                                    		</li>
										</ul>
										<!-- /.nav-fourth-level -->										
                                    </li>
                                </ul>
                                <!-- /.nav-third-level -->
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>

					
					
					
					<li>
                    <!--<li class="active">-->
                        <a href="#"><i class="fa fa-files-o fa-fw"></i> Extra <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">Blank Page</a>
                            </li>
                            <li>
                                <a href="#">Login Page</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                </ul>
                <!-- /#side-menu -->
            </div>
            <!-- /.sidebar-collapse -->
        </nav>
        <!-- /.navbar-static-side -->

<!--Start of Main page-->
    <div id="page-wrapper">
		 
		 <div class="row">
                <div class="col-lg-12">
				    <h4 class="page-header">Admin | <span class="style2">Create User</span></h4> 
				</div><!-- /.col-lg-12 -->
         </div><!-- /.row -->
		 	
		 <div class="row">
               <div class="col-lg-6">
				    <h6>Home > <b>Create User</b></h6>
				</div>
                <!-- /.col-lg-6 -->
          </div>
            <!-- /.row -->
            <br>
            
              <form:form method="POST" commandName="user" id=""
						action="${pageContext.request.contextPath}/Create_User">
			
			 <div class="row">
                <div class="col-lg-5">
                
               <%--   <div class="form-group">
                    <label class="label1">User Type: </label><span class="style1"></span>
						<form:select class="form-control" path="user_type" id="user_type">
							<form:option value="none" label="Select User Type"/>
						</form:select>
                  </div> --%>
				  
				  <div class="form-group">
                    <label class="label1">Department: </label><span class="style1"></span>
						<form:select path="department" class="form-control" name="department" id="department">
							<form:option value="none" label="Select Department "/>
                        </form:select>
                  </div>
                  
                   <div class="form-group">
                    <label class="label1">User: </label><span class="style1"></span>
						<form:select path="user_name" class="form-control" name="user_name" id="user_name">
							<form:option value="none" label="Select User "/>
                        </form:select>
                  </div>
                  <%-- onChange="searchOnUser()" --%>
				
                  
                  <div class="form-group">
						<label class="label1">Password</label><span class="style1"></span>
						<form:input path="password" name="password" type="text" class="form-control" placeholder="First password" />
				</div>
				
				<div class="form-group">
									<label class="label1">User Status</label><span class="style1"></span>
									<%-- <form:input path="gender" type="text" class="form-control" name="gender" /> --%>
									<div class="form-control-gender">&nbsp;
	                                        <label class="label1" for="male">Active</label>     
	                                        	<form:radiobutton path="user_status" name="user_status" value="Active" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		      								 	
		      								<label class="label1" for="female">In Active</label> 
		      								 	<form:radiobutton path="user_status" name="user_status" value="InActive" />
                                   </div>
								</div>
					<br>
                  <button type="submit" class="btn btn-primary">Create</button>				

                  </div> <!-- /.col-lg-5 -->
                  
                  
                 <!--  <div class="col-lg-6">
					          <table class="table table-striped table-bordered table-hover" id="idTable" style="display:none;">
                                    <thead>
                                        <tr>
                                            <td>ID</td>
                                            <td>department</td>
                                            <td>Program</td>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                        
                                        </tr> 
                                    </tbody>
                                </table>
				</div>col-5 -->
                  
                  
			</div> <!-- /.row -->
			
		</form:form>
			
			
			

	
	</div><!-- /#page-wrapper -->
	<!--End of Main page-->

  </div>
    <!-- /#wrapper -->


   <!-- Core Scripts - Include with every page -->
	<%-- <script src="<c:url value="/resources/js/jquery-1.7.min.js" />"></script> --%>
	<script src="<c:url value="/resources/js/jquery-1.10.2.js" />"></script>
	
	
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	<script src="<c:url value="/resources/js/plugins/metisMenu/jquery.metisMenu.js" />"></script>
	<script src="<c:url value="/resources/js/sb-admin.js" />"></script>
	
<%-- 	<script src="<c:url value="/resources/js/User_create.js" />"></script>
	<script src="<c:url value="/resources/js/role.js" />"></script>
  --%>
<script src="<c:url value="/resources/js/Create_user.js" />"></script>
    
</body>

</html>
