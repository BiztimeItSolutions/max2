<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

    <!-- Core CSS - Include with every page -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet">

    <!-- Page-Level Plugin CSS - Panels and Wells -->

    <!-- SB Admin CSS - Include with every page -->
    <link href="css/sb-admin.css" rel="stylesheet">


</head>
<body>
<div id="wrapper">
<div id="page-wrapper">
<div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Basic Tabs
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <!-- Nav tabs -->
                            <ul class="nav nav-tabs">
                                <li class="active"><a href="#sem-1" data-toggle="tab">Sem-1</a>
                                </li>
                                <li><a href="#sem-2" data-toggle="tab">Sem-2</a>
                                </li>
                                <li><a href="#sem-3" data-toggle="tab">Sem-3</a>
                                </li>
                                <li><a href="#sem-4" data-toggle="tab">Sem-4</a>
                                </li>
								<li><a href="#sem-5" data-toggle="tab">Sem-5</a>
                                </li>
								<li><a href="#sem-6" data-toggle="tab">Sem-6</a>
                                </li>
								<li><a href="#sem-7" data-toggle="tab">Sem-7</a>
                                </li>
								<li><a href="#sem-8" data-toggle="tab">Sem-8</a>
                                </li>

                            </ul>

                            <!-- Tab panes -->
                            <div class="tab-content">

                                <div class="tab-pane fade in active" id="sem-1">
                                   <h4>Sem-1</h4>
                                   <form name="a">

<table width="500" border="3" cellspacing="5" cellpadding="5">
  <tr>
    <td>Subject Code</td>
    <td>Subject Name</td>
  </tr>
  <tr>
  <c:forEach items="${first}" var="course">
    <td><c:out value="${course.subject_code}"/></td>
    <td><c:out value="${course.subject_name}"/></td>
    
  </tr>
  </c:forEach>
</table>


</form>
                                </div>


                                <div class="tab-pane fade" id="sem-2">
                                    <h4>sem-2</h4>
                                   <form name="a">

<table width="500" border="3" cellspacing="5" cellpadding="5">
  <tr>
    <td>Subject Code</td>
    <td>Subject Name</td>
  </tr>
  <tr>
  <c:forEach items="${first}" var="course">
    <td><c:out value="${course.subject_code}"/></td>
    <td><c:out value="${course.subject_name}"/></td>
    
  </tr>
  </c:forEach>
</table>


</form>
                                </div>


                                <div class="tab-pane fade" id="sem-3">
                                    <h4>sem-3</h4>
                                   <form name="a">

<table width="500" border="3" cellspacing="5" cellpadding="5">
  <tr>
    <td>Subject Code</td>
    <td>Subject Name</td>
  </tr>
  <tr>
  <c:forEach items="${first}" var="course">
    <td><c:out value="${course.subject_code}"/></td>
    <td><c:out value="${course.subject_name}"/></td>
    
  </tr>
  </c:forEach>
</table>


</form>                                </div>


                                <div class="tab-pane fade" id="sem-4">
                                    <h4>sem-4</h4>
<table width="300" border="3" cellspacing="5" cellpadding="5">
  <tr>
    <td>Subject Code</td>
    <td>Subject Name</td>
  </tr>
  <tr>
  
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
                                </div>


								<div class="tab-pane fade" id="sem-5">
                                    <h4>sem-5</h4>
<table width="300" border="3" cellspacing="5" cellpadding="5">
  <tr>
    <td>Subject Code</td>
    <td>Subject Name</td>
  </tr>
  <tr>
  
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
                                </div>


                                <div class="tab-pane fade" id="sem-6">
                                    <h4>sem-6</h4>
<table width="300" border="3" cellspacing="5" cellpadding="5">
  <tr>
    <td>Subject Code</td>
    <td>Subject Name</td>
  </tr>
  <tr>
  
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
                                </div>


			                   <div class="tab-pane fade" id="sem-7">
                                    <h4>sem-7</h4>
<table width="300" border="3" cellspacing="5" cellpadding="5">
  <tr>
    <td>Subject Code</td>
    <td>Subject Name</td>
  </tr>
  <tr>
  
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
                                </div>

                                <div class="tab-pane fade" id="sem-8">
                                    <h4>sem-8</h4>
<table width="300" border="3" cellspacing="5" cellpadding="5">
  <tr>
    <td>Subject Code</td>
    <td>Subject Name</td>
  </tr>
  <tr>
  
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
                                </div>



                            </div>
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-6 -->
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Pill Tabs
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <!-- Nav tabs -->
                            <ul class="nav nav-pills">
                                <li class="active"><a href="#home-pills" data-toggle="tab">Home</a>
                                </li>
                                <li><a href="#profile-pills" data-toggle="tab">Profile</a>
                                </li>
                                <li><a href="#messages-pills" data-toggle="tab">Messages</a>
                                </li>
                                <li><a href="#settings-pills" data-toggle="tab">Settings</a>
                                </li>
                            </ul>

                            <!-- Tab panes -->
                            <div class="tab-content">
                                <div class="tab-pane fade in active" id="home-pills">
                                    <h4>Home Tab</h4>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                                </div>
                                <div class="tab-pane fade" id="profile-pills">
                                    <h4>Profile Tab</h4>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                                </div>
                                <div class="tab-pane fade" id="messages-pills">
                                    <h4>Messages Tab</h4>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                                </div>
                                <div class="tab-pane fade" id="settings-pills">
                                    <h4>Settings Tab</h4>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                                </div>
                            </div>
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-6 -->
            </div>
            <!-- /.row -->
</div>

</div>

    <!-- Core Scripts - Include with every page -->
    <script src="js/jquery-1.10.2.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>

    <!-- Page-Level Plugin Scripts - Panels and Wells -->

    <!-- SB Admin Scripts - Include with every page -->
    <script src="js/sb-admin.js"></script>

    <!-- Page-Level Demo Scripts - Panels and Wells - Use for reference -->

</body>
</html>