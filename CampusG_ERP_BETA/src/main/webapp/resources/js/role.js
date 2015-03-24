$(document).ready(function(){
	
	//drop down department
	$.ajax({
	    type:"GET",
	    url:"get_role.html",
	    success:function(data)
	            {
	            console.log(data);
	           // alert(data);
	            var u=data.slice(1, -1);//data sliced to remove parenthesis
	           // alert(u);
	            var user=u.split(',');//data split on comma
	          //  alert(user);
	            $('#role_name').empty();//drop down made empty
	            //add default value to drop down
	            
	            //$('#program').empty(); //drop down made empty to fill in new data
	            //$('#department').empty();
	            //$('#course_name').empty();
	            
	            
	            $('#role_name').append($('<option>', { 
			        value: " ",
			        text : "Select User Type  " 
			    }));
	          //add values to drop down fetched from data base
	            for(var r in user)
	            {
	            	$('#role_name').append($('<option>', { 
				        value: user[r],
				        text : user[r] 
				    }));
	            }
	            
	            
	            },

	    error:function(){
	            alert("failed");
	    },
	});//end of department
	
	/*
	//drop down course
	
	//called while drop down user_type changes
	$('#user_type').change(function(){
		//to get the selected value in the department drop down
		var selecteditem = $("#user_type option:selected").text();
		//alert(selecteditem);
		console.log("selected item from user_type: " + selecteditem);
		$.ajax({
	    type:"GET", 
	    url:"get_role_type.html",
	    data : {
			"selecteditem" : selecteditem
		},
	    success:function(data)
	            {
	            console.log(data);
	          //  alert(data);
	            var r=data.slice(1, -1);//data sliced to remove parenthesis
	           // alert(u);
	            var role=r.split(',');//data split on comma
	          //  alert(user);
	            $('#user_role').empty();//drop down made empty
	            $('#user_role').append($('<option>', { 
			        value: " ",
			        text : "Select Role" 
			    }));
	          //add values to drop down fetched from data base
	            for(var r in role)
	            {
	            	$('#user_role').append($('<option>', { 
				        value: role[r],
				        text : role[r] 
				    }));
	            }
	            
	            
	            },
	    error:function(){
	            alert("failed");
	    },
	});//end of department
	
	Second
});
	   
	    
	  */  
	    
	    
	    
	    
	    
	    
	/*    
	    
	    url:"get_users.html",
	    data : {
			"selecteditem" : selecteditem
		},
	    success:function(data)
	            {
	    		//alert(data);
	            var uu=data.slice(1, -1);//data sliced to remove parenthesis
	            
	            var usrs=uu.split(',');//data split to remove commas
	          //  alert(usrs);
	            $('#user_name').empty(); //drop down made empty to fill in new data
	           // $('#department').empty();
	           // $('#course_name').empty();
	            
	            //to add a default value in the dropdown fetched from data base
	            $('#user_name').append($('<option>', { 
			        value: " ",
			        text : "Select User" 
			    }));
	            
	            // to add the values to the drop down
	            for(var s in usrs)
	            {
	            	$('#user_name').append($('<option>', { 
				        value: usrs[s],
				        text : usrs[s] 
				    }));
	            }	           
	            },

	    error:function(){
	            alert("failed");
	    },
	});	
	});	//end of drop down users
		
//end of ready	
});


$(document).ready(function(){
	$.ajax({
	    type:"GET",
	    url:"get_role_type.html",
	    success:function(data)
	            {
	            console.log(data);
	          //  alert(data);
	            var r=data.slice(1, -1);//data sliced to remove parenthesis
	           // alert(u);
	            var role=r.split(',');//data split on comma
	          //  alert(user);
	            $('#user_role').empty();//drop down made empty
	            $('#user_role').append($('<option>', { 
			        value: " ",
			        text : "Select Role" 
			    }));
	          //add values to drop down fetched from data base
	            for(var r in role)
	            {
	            	$('#user_role').append($('<option>', { 
				        value: role[r],
				        text : role[r] 
				    }));
	            }
	            
	            
	            },
	    error:function(){
	            alert("failed");
	    },
	});//end of department
	
	/*Second*/
});