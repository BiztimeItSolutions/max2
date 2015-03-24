<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title></title>
</head>
<body>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
    <link href="http://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.0.3/css/bootstrap.min.css"
        rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.0.3/js/bootstrap.min.js"></script>
    <link href="http://cdn.rawgit.com/davidstutz/bootstrap-multiselect/master/dist/css/bootstrap-multiselect.css"
        rel="stylesheet" type="text/css" />
    <script src="http://cdn.rawgit.com/davidstutz/bootstrap-multiselect/master/dist/js/bootstrap-multiselect.js"
        type="text/javascript"></script>
        
        <input type="text" value="<%=request.getContextPath()%>" id="loc"/>
    <script type="text/javascript">
      $(function () {
            $('#lstFruits').multiselect({
                includeSelectAllOption: true
            });
			$('#vegetables').multiselect({
                includeSelectAllOption: true
            });
    	  $('#btnSelected').click(function () {
                var selected = $("#lstFruits option:selected");
				var selected1 = $("#vegetables option:selected");
				//var selected[] = $( "select[name='sel']option:selected" ).text();
				alert(selected);
				
				$.ajax({
					type:"GET", 
					url:"fruits.htm",
					data : {	"one" : selected,
								 "two" : selected1 },
					success:function(data) { alert("Success");	},	           
					error:function(){ alert("failed"); },
					});
        	});		
       });
               /*  var message = "";
                selected.each(function () {
                    message += $(this).val() + " " + $(this).text() + "\n";
                });
				selected1.each(function () {
                    message += $(this).val() + " " + $(this).text() + "\n";
                });
                alert(message); 
           });
        }); */
    </script>
    <select id="lstFruits" multiple="multiple" name="sel">
        <option value="1">Mango</option>
        <option value="2">Apple</option>
        <option value="3">Banana</option>
        <option value="4">Guava</option>
        <option value="5">Orange</option>
    </select>
	
	<select id="vegetables" multiple="multiple" name="sel">
        <option value="1">A</option>
        <option value="2">B</option>
        <option value="3">C</option>
        <option value="4">D</option>
        <option value="5">E</option>
    </select>
    <input type="button" id="btnSelected" value="Get Selected" />
</body>
</html>