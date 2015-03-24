$(document).ready(function(){
	
	//drop down department
	$.ajax({
	    type:"GET",
	    url:"get_department.html",
	    success:function(data)
	            {
	            console.log(data);
	           // alert(data);
	            var u=data.slice(1, -1);//data sliced to remove parenthesis
	           // alert(u);
	            var dept=u.split(',');//data split on comma
	          //  alert(user);
	            $('#department').empty();//drop down made empty
	            //add default value to drop down
	            
	            //$('#program').empty(); //drop down made empty to fill in new data
	            //$('#department').empty();
	            //$('#course_name').empty();
	            
	            
	            $('#department').append($('<option>', { 
			        value: " ",
			        text : "Select Department" 
			    }));
	          //add values to drop down fetched from data base
	            for(var r in dept)
	            {
	            	$('#department').append($('<option>', { 
				        value: dept[r],
				        text : dept[r] 
				    }));
	            }
	            
	            
	            },

	    error:function(){
	            alert("failed");
	    },
	});//end of department
	
	
	//drop down course
	
	//called while drop down user_type changes
	$('#department').change(function(){
		//to get the selected value in the department drop down
		var selecteditem = $("#department option:selected").text();
		//alert(selecteditem);
		console.log("selected item from department: " + selecteditem);
		$.ajax({
	    type:"GET", 
	    url:"get_users_f.html",
	    data : {
			"selecteditem" : selecteditem
		},
	    success:function(data)
	            {
	    		//alert(data);
	            var uu=data.slice(1, -1);//data sliced to remove parenthesis
	            var usr=uu.replace(/\s/g, "");
	            var usrs=usr.split(',');//data split to remove commas
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
	//drop down course
	
	//called while drop down user_type changes
	$('#user_name').change(function(){
		//to get the selected value in the department drop down
		var selecteditem = $("#user_type option:selected").text();
		//alert(selecteditem);
		console.log("selected item from user_name: " + selecteditem);
		$.ajax({
	    type:"GET", 
	    url:"get_role.html",
	    data : {
			"selecteditem" : selecteditem
		},
	    success:function(data)
	            {
	    		//alert(data);
	            var uu=data.slice(1, -1);//data sliced to remove parenthesis
	            
	            var role=uu.split(',');//data split to remove commas
	          //  alert(usrs);
	            $('#role_name').empty(); //drop down made empty to fill in new data
	           // $('#department').empty();
	           // $('#course_name').empty();
	            
	            //to add a default value in the dropdown fetched from data base
	            $('#role_name').append($('<option>', { 
			        value: " ",
			        text : "Select Role" 
			    }));
	            
	            // to add the values to the drop down
	            for(var s in role)
	            {
	            	$('#role_name').append($('<option>', { 
				        value: role[s],
				        text : role[s] 
				    }));
	            }	           
	            },

	    error:function(){
	            alert("failed");
	    },
	});	
	});	//end of drop down users
	
	
//to get modules on role name
	$("#role_name").change(function(){
		$(":checkbox").attr("class","checkModule");
		 var boxes=$(".checkModule");
		 $(boxes).each(function(){
 				$(this).prop('checked',false);	
 		
 		});
		var selectedRole = $("#role_name option:selected").text();
		//alert("selectedRole: "+selectedRole);
		$.ajax({
		    type:"GET",
		    url:"roleModule.html",
		    data:{
		    	"selectedRole":selectedRole
		    },
		    success:function(data)
		            {
		            console.log(data);
		            var moduleData=data.slice(1, -1);//data sliced to remove parenthesis
		            //alert("after slice: "+moduleData);
		            var module=moduleData.split(',');//data split on comma
		            //alert("after split:"+module);
		            var boxes=$(".checkModule");
		            $.each(module,function(i,value){
		            	//alert("value:"+value);
		            	$(boxes).each(function(){
		        			if($(this).val()==value.trim())
		        				$(this).prop('checked',true);	
		        		
		        		});
		            });	
		            },
	
		    error:function(){
		            alert("failed");
		    },
		});
	
	});	
	
//END: 	to get modules on role name
	
	
	
//end of ready	
});