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

   $("#empcontactdetails").validate({
        rules : {
        	
        	
        	
        	mobile:"num",
        	officePhone1:"num",
        	email:"email",
        	presentAddressPincode:"pincode",
        	permanentAddressPincode:"pincode",
        	officeAddressPincode:"pincode",
        	
        	
        	presentAddressLine1 :{
                	
                	required : true
                
                },
                presentAddressCity :{
                	
                	required : true
                	
                },
                presentAddressPincode :{
                	
                	required : true,
                	pincode:true
                },
                presentAddressCountry :{
                	
                	required : true
                },
                presentAddressState :{
                	required : true
                },
                
                
                permanentAddressLine1 :
                	{
                	
                	required : true
                	
                	},
                	permanentAddressCity :{
                	
                	required :true
                	
                },
                permanentAddressPincode :
                	{
                	
                	required : true,
                	pincode:true
                	},
                	permanentAddressCountry :
                	{
                	
                	required : true
                	
                	},
           
                	permanentAddressState :
                		{
                		
                		required : true
                		
                		},
                	
                		               		
                		officeAddressLine1 :
                     	{
                     	
                     	required : true
                     	
                     	},
                     	officeAddressCity :{
                     	
                     	required :true
                     	
                     },
                     officeAddressPincode :
                     	{
                     	
                     	required : true,
                     	pincode:true
                     	},
                     	officeAddressCountry :
                     	{
                     	
                     	required : true
                     	
                     	},
                
                     	officeAddressState :
                     		{
                     		
                     		required : true
                     		
                     		},
                     		officePhone1 :
                     			{
                     			required:true,
                     			num:true
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
        	
        
        	presentAddressLine1 :{
                	
                	required : "Please enter a Address Line1",
                
                },

                presentAddressCity :{
                	
                	required : "Please enter a City",
                	
                },
                presentAddressPincode :{
                	
                	required : "Please enter a Pincode",
                },
                presentAddressCountry :{
                	required : "Please enter a Country",
                	
                },
                presentAddressState :{
                	required : "Please enter a State",
                },
                
                
                permanentAddressLine1 :
                	{
                	
                	required : "Please enter a Address Line1",
                	
                	},
                	permanentAddressCity :{
                	
                	required :"Please enter a City",
                	
                },
                permanentAddressPincode :
                	{
                	
                	required : "Please enter a Pincode",
                	
                	},
                	permanentAddressCountry :
                	{
                	
                	required : "Please enter a Country",
                	
                	},
           
                	permanentAddressState :
                		{
                		
                		required : "Please enter a State",
                		
                		},
                	
                		
                		officeAddressLine1 :
                     	{
                     	
                     	required : "Please enter a Address Line1",
                     	
                     	},
                     	officeAddressCity :{
                     	
                     	required :"Please enter a City",
                     	
                     },
                     officeAddressPincode :
                     	{
                     	
                     	required : "Please enter a Pincode",
                     	
                     	},
                    officeAddressCountry :
                     	{
                     	
                     	required : "Please enter a Country",
                     	
                     	},
                
                     	officeAddressState :
                     		{
                     		
                     		required : "Please enter a State",
                     		
                     		},
                     		officePhone1 :
                     		{
                     		
                     		required : "Please enter a phone number",
                     		
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
