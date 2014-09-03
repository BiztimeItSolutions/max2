<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Biztime EduERP</title>
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,700,600" rel="stylesheet" type="text/css">
    <link href="http://netdna.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
    <link href="css/leftmenu.css" rel="stylesheet" type="text/css">   
    <link rel="stylesheet" href="css/header.css" type="text/css" media="screen" />
    <link rel="stylesheet" href="css/footer.css" type="text/css" media="screen" />
	    <link rel="stylesheet" type="text/css" href="css/form.css" media="all" />
	

	
	
    <script type="text/javascript" src="js/jquery.left.js" charset="utf-8"></script> 
    <!-- <script type="text/javascript" src="js/nagging-menu.js" charset="utf-8"></script> -->
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="js/jquery.ssd-left-navigation.min.js"></script>
    <script src="js/leftmain.js"></script>
	       <style type="text/css">
<!--
.style1 {color: #FF0000}
-->
    </style>

</head>

<body>

<div id="contentWrapper">
<!--app.css-->
    <div id="contentLeft">
      <div>
<img src="img/Biztime_Logo.png" width="250" height="80">
     </div> 
     <!-- <div>
<img src="images/bizedu.png" width="250" height="50">
     </div>-->
        <ul id="leftNavigation">
     
            <li class="active">
                <a href="#"><i class="fa fa-coffee leftNavIcon"></i> Masters</a>
                <ul>
                    <li>
                        <a href="ad_department.html"><i class="fa fa-angle-right leftNavIcon"></i> Department</a>
                    </li>
                    <li>
                        <a href="ad_course.html"><i class="fa fa-angle-right leftNavIcon"></i> Course </a>
                    </li>
                      <li>
                        <a href="ad_subject.html"><i class="fa fa-angle-right leftNavIcon"></i> Subjects</a>
                    </li>
                      <li>
                        <a href="ad_fees.html"><i class="fa fa-angle-right leftNavIcon"></i> Fees</a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="#"><i class="fa fa-flask leftNavIcon"></i> Products</a>
                <ul>
                    <li>
                        <a href="#"><i class="fa fa-angle-right leftNavIcon"></i> Garden</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-angle-right leftNavIcon"></i> Office</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-angle-right leftNavIcon"></i> Home</a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="#"><i class="fa fa-truck leftNavIcon"></i> Services</a>
                <ul>
                    <li>
                        <a href="#"><i class="fa fa-angle-right leftNavIcon"></i> Garden</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-angle-right leftNavIcon"></i> Office</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-angle-right leftNavIcon"></i> Home</a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="#"><i class="fa fa-envelope-o leftNavIcon"></i> Contact us</a>
                <ul>
                    <li>
                        <a href="#"><i class="fa fa-angle-right leftNavIcon"></i> Find Us</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-angle-right leftNavIcon"></i> Contact Details</a>
                    </li>
                </ul>
            </li>

        </ul>

    </div>
<!--    <div id="menu" class="default">

	 <div>
<img src="images/Biztime_Logo.png" width="250" height="72" align="left">
     </div> 
-->
	<div id="header" class="header">
<ul>
				<li><a href="#">Current Academic Year</a></li>
				<li><a href="#">About</a></li>
				<li><a href="#">Version </a></li>
				<li><a href="#">DashBroad</a></li>
				<li><a href="#">Options</a></li>
</ul>
</div>

    <div id="contentRight">

        <h1 id="heading">&nbsp;</h1>
        <h1>&nbsp;</h1>
        <h1>Update Department Details</h1>
        <p>&nbsp;</p>
	
				    
      <div  class="form">
      
      
<%-- <c:url var="reg" value="updatestud.html"/>
<form:form id="EditStud" modelAttribute="student" commandName="student" method="get" action="${reg}">
 --%>
      
 
			
			<%-- <form:form id="contactform" modelAttribute="department" commandName="department" method="get" action="editdept"> --%>
    		
<c:url var="reg" value="updatedept.html"/>
<form:form id="editdtud" modelAttribute="department" method="get" action="${reg}">

    		<p class="contact">
				  <label for="name">Department </label>
				<span class="style1">*</span></p> 
    			<form:input path="dept_id" value="${DEPT.dept_id}" id="name"  placeholder="" required="" tabindex="1" type="text"/>
    			
    		
				<p class="contact">
				  <label for="name">Department Name</label>
				<span class="style1">*</span></p> 
    			<form:input path="departmentt_name" value="${DEPT.departmentt_name}" id="name"  placeholder="" required="" tabindex="1" type="text"/>
    			
    			
    			 
    			<p class="contact">
    			  <label for="name">Building Name </label>
    			  <span class="style1">*</span></p> 
    			<form:input path="building_name" value="${DEPT.building_name}" id="email"  placeholder="" required="" type="text"/> 
                
                <p class="contact">
                  <label for="username">Location</label>
                  <span class="style1">*</span></p> 
    			<form:input path="location" value="${DEPT.location}" id="username"  placeholder="username" required="" tabindex="2" type="text"/> 
    			 
                              
              <input class="buttom" name="submit" id="submit" tabindex="5" value="Edit" type="submit"> 	 
            </p>
            <p>&nbsp;</p>
            <p>&nbsp;</p>
            <p>&nbsp;</p>
            <p>&nbsp;         </p>
    		</form:form>
  </div>       

	

</div>
<footer>
		<section id="footer">


					<aside class="footer-segment">
							<h4>Contact</h4>
                            <p>support@biztimeit.com</p>
								
					</aside><!-- end of #second footer segment -->

					<aside class="footer-segment">
							<h4>helpLine</h4>
								<p>080 - 41529697</p>
					</aside><!-- end of #third footer segment -->
					
					<aside class="footer-segment">
							<h4>blahblah</h4>
								<p>blahblahblah</p>
					</aside><!-- end of #fourth footer segment -->
                    
                    <aside class="footer-segment">
							<h4>CopyRight</h4>
							<p>2014-2018</p>
					</aside>

			</section><!-- end of footer-outer-block -->

		</section><!-- end of footer-area -->
	</footer>

</div>

</body>
</html>
