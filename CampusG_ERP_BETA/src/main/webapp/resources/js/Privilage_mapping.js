$(document).ready(function(){
	
	//drop down department
	$.ajax({
	    type:"GET",
	    url:"get_user.html",
	    success:function(data)
	            {
	            console.log(data);
	           // alert(data);
	            var u=data.slice(1, -1);//data sliced to remove parenthesis
	           // alert(u);
	            var user=u.split(',');//data split on comma
	          //  alert(user);
	            $('#user').empty();//drop down made empty
	            //add default value to drop down
	            
	            //$('#program').empty(); //drop down made empty to fill in new data
	            //$('#department').empty();
	            //$('#course_name').empty();
	            
	            
	            $('#user').append($('<option>', { 
			        value: " ",
			        text : "Select User" 
			    }));
	          //add values to drop down fetched from data base
	            for(var r in user)
	            {
	            	$('#user').append($('<option>', { 
				        value: user[r],
				        text : user[r] 
				    }));
	            }
	            
	            
	            },

	    error:function(){
	            alert("failed");
	    },
	});//end of department
	
	
	//drop down course
	
	//called while drop down user_type changes
	$('#user').change(function(){
		//to get the selected value in the department drop down
		
		$.ajax({
	    type:"GET", 
	    url:"get_department.html",
	   
	    success:function(data)
	            {
	            console.log(data);
	          //  alert(data);
	            var r=data.slice(1, -1);//data sliced to remove parenthesis
	           // alert(u);
	            var dep=r.split(',');//data split on comma
	          //  alert(user);
	            $('#department').empty();//drop down made empty
	            $('#department').append($('<option>', { 
			        value: " ",
			        text : "Select Department" 
			    }));
	          //add values to drop down fetched from data base
	            for(var r in dep)
	            {
	            	$('#department').append($('<option>', { 
				        value: dep[r],
				        text : dep[r] 
				    }));
	            }
	            
	            
	            },
	    error:function(){
	            alert("failed");
	    },
	});//end of department
	
});
	
	//called while drop down user_type changes
	$('#department').change(function(){
		//to get the selected value in the department drop down
		
		$.ajax({
	    type:"GET", 
	    url:"get_role.html",
	   
	    success:function(data)
	            {
	            console.log(data);
	          //  alert(data);
	            var r=data.slice(1, -1);//data sliced to remove parenthesis
	           // alert(u);
	            var rol=r.split(',');//data split on comma
	          //  alert(user);
	            $('#role').empty();//drop down made empty
	            $('#role').append($('<option>', { 
			        value: " ",
			        text : "Select Role" 
			    }));
	          //add values to drop down fetched from data base
	            for(var r in rol)
	            {
	            	$('#role').append($('<option>', { 
				        value: rol[r],
				        text : rol[r] 
				    }));
	            }
	            
	            
	            },
	    error:function(){
	            alert("failed");
	    },
	});//end of department
	
});
	
	//called while drop down user_type changes
	$('#role').change(function(){
		//to get the selected value in the department drop down
		
		$.ajax({
	    type:"GET", 
	    url:"get_module.html",
	  
	    success:function(data)
	            {
	            console.log(data);
	          //  alert(data);
	            var r=data.slice(1, -1);//data sliced to remove parenthesis
	           // alert(u);
	            var rol=r.split(',');//data split on comma
	          //  alert(user);
	            $('#module').empty();//drop down made empty
	            $('#module').append($('<option>', { 
			        value: " ",
			        text : "Select Module" 
			    }));
	          //add values to drop down fetched from data base
	            for(var r in rol)
	            {
	            	$('#module').append($('<option>', { 
				        value: rol[r],
				        text : rol[r] 
				    }));
	            }
	            
	            
	            },
	    error:function(){
	            alert("failed");
	    },
	});//end of department
	
});
	


	
	
	//called while drop down user_type changes
	$('#module').change(function(){
		//to get the selected value in the department drop down
	
		$.ajax({
	    type:"GET", 
	    url:"get_privilage.html",
	  
	    success:function(data)
	            {
	            console.log(data);
	          //  alert(data);
	            var r=data.slice(1, -1);//data sliced to remove parenthesis
	           // alert(u);
	            var priv=r.split(',');//data split on comma
	          //  alert(user);
	            $('#privilage').empty();//drop down made empty
	            $('#privilage').append($('<option>', { 
			        value: " ",
			        text : "Select Privilage" 
			    }));
	          //add values to drop down fetched from data base
	            for(var r in priv)
	            {
	            	$('#privilage').append($('<option>', { 
				        value: priv[r],
				        text : priv[r] 
				    }));
	            }
	            
	            
	            },
	    error:function(){
	            alert("failed");
	    },
	});//end of department
	
	});
});