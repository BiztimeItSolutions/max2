 $(document).ready(function(){

	 
	 
	 $.validator.addMethod("num", function(value, element) {
		    return /^[+]\d{12}$/i.test(value);
		}, "Field start with + and contain 12 digits");
	 $.validator.addMethod("email", function(value, element) {
	        return /^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,4}$/i.test(value);
	    }, "Email id should be in ex:john@gmail.com format");
	 $.validator.addMethod("pincode", function(value, element) {
	        return /^\d{6}$/i.test(value);
	    },  "Please Enter 6 digits");
	 
	 
$(function() {

   $("#admissioncontactdetails").validate({
        rules : {
        	
        	
        	
        	mobile:"num",
        	email:"email",
        	presentaddresspincode:"pincode",
        	permanentaddresspincode:"pincode",
        	emergencyaddresspincode:"pincode",
        	
        	
        	
        	presentaddressline1 :{
                	
                	required : true
                
                },
                presentaddresscity :{
                	
                	required : true
                	
                },
                presentaddresspincode :{
                	
                	required : true,
                	pincode:true
                },
                presentaddresscountry :{
                	
                	required : true
                },
                presentaddressstate :{
                	required : true
                },
                
                
                permanentaddressline1 :
                	{
                	
                	required : true
                	
                	},
                	permanentaddresscity :{
                	
                	required :true
                	
                },
                permanentaddresspincode :
                	{
                	
                	required : true,
                	pincode:true
                	},
                	permanentaddresscountry :
                	{
                	
                	required : true
                	
                	},
           
                	permanentaddressstate :
                		{
                		
                		required : true
                		
                		},
                	
                		               		
                		emergencyaddressline1 :
                     	{
                     	
                     	required : true
                     	
                     	},
                     	emergencyaddresscity :{
                     	
                     	required :true
                     	
                     },
                     emergencyaddresspincode :
                     	{
                     	
                     	required : true,
                     	pincode:true
                     	},
                     	emergencyaddresscountry :
                     	{
                     	
                     	required : true
                     	
                     	},
                
                     	emergencyaddressstate :
                     		{
                     		
                     		required : true
                     		
                     		},
                     	
                     		mobile : 
				{
                        required : true, 
                        num : true
                },
				
                email: 
                {
                	required: true,
                	email: true
                }
                
       
              
        		
				
        },
        messages : {
        	
        
        	presentaddressline1 :{
                	
                	required : "Please enter a Address Line1",
                
                },

                presentaddresscity :{
                	
                	required : "Please enter a City",
                	
                },
                presentaddresspincode :{
                	
                	required : "Please enter a Pincode",
                },
                presentaddresscountry :{
                	required : "Please enter a Country",
                	
                },
                presentaddressstate :{
                	required : "Please enter a State",
                },
                
                
                permanentaddressline1 :
                	{
                	
                	required : "Please enter a Address Line1",
                	
                	},
                	permanentaddresscity :{
                	
                	required :"Please enter a City",
                	
                },
                permanentaddresspincode :
                	{
                	
                	required : "Please enter a Pincode",
                	
                	},
                	permanentaddresscountry :
                	{
                	
                	required : "Please enter a Country",
                	
                	},
           
                	permanentaddressstate :
                		{
                		
                		required : "Please enter a State",
                		
                		},
                	
                		
                		emergencyaddressline1 :
                     	{
                     	
                     	required : "Please enter a Address Line1",
                     	
                     	},
                     	emergencyaddresscity :{
                     	
                     	required :"Please enter a City",
                     	
                     },
                     emergencyaddresspincode :
                     	{
                     	
                     	required : "Please enter a Pincode",
                     	
                     	},
                     	emergencyaddresscountry :
                     	{
                     	
                     	required : "Please enter a Country",
                     	
                     	},
                
                     	emergencyaddressstate :
                     		{
                     		
                     		required : "Please enter a State",
                     		
                     		},
                     	                		               		
                		              	               		
                		
                     		mobile : 
				{
                        required : "Please enter a Valid Mobile Number",     
                },
				
                email : 
				{
                        required : "Please enter a Valid Email ID",     
                }
                
    
                
			
        }
		
		
  });
});
});
