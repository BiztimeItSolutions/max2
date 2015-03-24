$(document).ready(function(){
//For quota
	$.ajax({
	    type:"GET",
	     
	    url:"get_quota.html",

	    success:function(data)
	            {
	            
	            console.log(data);
	            
	            //alert(data);
	            
	            var q=data.slice(1, -1);//data sliced to remove parenthesis
	           // alert(q);
	            
	            var quota=q.split(',');//data split on comma
	            //alert(cour);
	            $('#quota').empty();//drop down made empty
	            //add default value to drop down
	            
	            $('#quota').append($('<option>', { 
			        value: " ",
			        text : "Select Quota-- " 
			    }));
	          //add values to drop down fetched from data base
	            for(var p in quota)
	            {
	            	$('#quota').append($('<option>', { 
				        value: quota[p],
				        text : quota[p] 
				    }));
	            }
	            
	            
	            },

	    error:function(){
	            alert("failed");
	    },
	});//end of quota
}

);
