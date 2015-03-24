

$(document).ready(function(){
	$.ajax({
	    type:"GET",
	    url:"get_department.html",
	    success:function(data)
	            {
	            console.log(data);
	          //  alert(data);
	            var r=data.slice(1, -1);//data sliced to remove parenthesis
	           // alert(u);
	            var dept=r.split(',');//data split on comma
	          //  alert(user);
	            $('#user_department').empty();//drop down made empty
	            $('#user_department').append($('<option>', { 
			        value: " ",
			        text : "Select department" 
			    }));
	          //add values to drop down fetched from data base
	            for(var r in dept)
	            {
	            	$('#user_department').append($('<option>', { 
				        value: dept[r],
				        text : dept[r] 
				    }));
	            }
	            
	            
	            },
	    error:function(){
	            alert("failed");
	    },
	});//end of department
	
	/*Second*/
});