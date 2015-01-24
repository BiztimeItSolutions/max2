 $(document).ready(function(){
	 $.validator.addMethod("nation", function(value, element) {
 
    return /^[A-Z]{4,15}$/i.test(value);
}, "Nationality should contain 4 to 15 characters");
	 
	 
	 $.validator.addMethod("num", function(value, element) {
		    return /^[+]\d{12}$/i.test(value);
		}, "Field start with + and contain 12 digits");
	 $.validator.addMethod("email", function(value, element) {
	        return /^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,4}$/i.test(value);
	    }, "Email id should be in ex:john@gmail.com format");
	 $.validator.addMethod("fld2", function(value, element) {
	        return /^\d{6}$/i.test(value);
	    },  "Please Enter 6 digits");
	 $.validator.addMethod("alphabetsonly", function(value, element) {
	        return /[A-Za-z]{1,}$/i.test(value);
	    },  "Please enter alphabets");
	 
	 
$(function() {

   $("#employeedetails").validate({
        rules : {
        	
        	
        	nationality:"nation",
        	mobile:"num",
        	email:"email",
        	present_pincode:"fld2",
        	permanent_pincode:"fld2",
        	office_pincode:"fld2",
        	first_name:"alphabetsonly",
        	last_name:"alphabetsonly",
        	
        	
            	first_name : 
				{
                        required : true,
                        alphabetsonly: true
                },
                last_name : 
				{
                        required : true,
                        alphabetsonly: true
                },
                government_id_number : 
				{
                        required : true,
                        alphabetsonly: true
                },
                date_of_birth : 
				{
                        required : true     
                },
                gender :{
                	
                	required : true
                },
                nationality :{
                	
                	required : true,
                	nation: true
                },
                present_address_line1 :{
                	
                	required : true
                
                },
                present_city :{
                	
                	required : true
                	
                },
                present_pincode :{
                	
                	required : true,
                	fld2:true
                },
                present_country :{
                	
                	required : true
                },
                present_state :{
                	required : true
                },
                
                
                permanent_address_line1 :
                	{
                	
                	required : true
                	
                	},
                	permanent_city :{
                	
                	required :true
                	
                },
                permanent_pincode :
                	{
                	
                	required : true,
                	fld2:true
                	},
                	permanent_country :
                	{
                	
                	required : true
                	
                	},
           
                	permanent_state :
                		{
                		
                		required : true
                		
                		},
                	
                		               		
                   		office_address_line1 :
                     	{
                     	
                     	required : true
                     	
                     	},
                     	 office_phone1 : 
         				{
                                 required : true
                              
                         },
                     	office_city :{
                     	
                     	required :true
                     	
                     },
                    office_pincode :
                     	{
                     	
                     	required : true,
                     	fld2:true
                     	},
                     	office_country :
                     	{
                     	
                     	required : true
                     	
                     	},
                
                     office_state :
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
                },
                
                organization_name : 
				{
                        required : true
                },
                designation : 
				{
                        required : true,
                        alphabetsonly: true
                },
                years_of_experience : 
				{
                        required : true
                        
                },
                department : 
				{
                        required : true
                      
                },
                
                
                
               date_of_joining :{
                	
                	required : true
                
                },
                account_type :{
                	
                	required : true
                	
                },
                account_number :{
                	
                	required : true
                },
               bank_name :{
                	
                	required : true
                },
                branch_name :{
                	required : true
                },
                
                
                ifsc_code :{
                	
                	required : true
                
                },
              
				
        },
        messages : {
        	
				first_name : 
				{
					required : "Please enter a First Name",     
                },
                last_name : 
				{
                	required : "Please enter a Last Name", 
                },
                government_id : 
				{
                	required : "Please enter a Government ID", 
                },
                date_of_birth : 
				{
                        required : "Please enter a Date of Birth ",   
                },
                gender :{
                	
                	required :"Please enter a Gender",
                },
                nationality :{
                	
                	required : "Please enter a Nationality",
                	
                },
                present_address_line1 :{
                	
                	required : "Please enter a Address Line1",
                
                },

                present_city :{
                	
                	required : "Please enter a City",
                	
                },
                present_pincode :{
                	
                	required : "Please enter a Pincode",
                },
                present_country :{
                	
                	required : "Please enter a Country",
                },
                present_state :{
                	required : "Please enter a State",
                },
                
                
                permanent_address_line1 :
                	{
                	
                	required : "Please enter a Address Line1",
                	
                	},
                	permanent_city :{
                	
                	required :"Please enter a City",
                	
                },
                permanent_pincode :
                	{
                	
                	required : "Please enter a Pincode",
                	
                	},
                	permanent_country :
                	{
                	
                	required : "Please enter a Country",
                	
                	},
           
                	permanent_state :
                		{
                		
                		required : "Please enter a State",
                		
                		},
                	office_phone1 :
                		{
                		
                		required : "Please enter a Phone Number",
                		
                		},
                	
                		
                		office_address_line1 :
                     	{
                     	
                     	required : "Please enter a Address Line1",
                     	
                     	},
                     	office_city :{
                     	
                     	required :"Please enter a City",
                     	
                     },
                    office_pincode :
                     	{
                     	
                     	required : "Please enter a Pincode",
                     	
                     	},
                     office_country :
                     	{
                     	
                     	required : "Please enter a Country",
                     	
                     	},
                
                     office_state :
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
                },
                date_of_joining : 
				{
                        required : "Please enter a Joining Date",     
                },
                department : 
				{
                        required : "Please enter a Department  ",     
                },
                years_of_experience : 
				{
                        required : "Please enter a Years of experienc",     
                },
                designation : 
				{
                        required : "Please enter a Designation",     
                },
                organization_name : 
				{
                        required : "Please enter a Organization name",     
                },
                account_type :{
                	
                	required : "Please enter a Account Type",
                },
               
                account_number :{
                	
                	required : "Please enter a Account Number",
                },
                branch_name :{
                	required : "Please enter a Branch Name",
                },
                
                bank_name : 
				{
                	required : "Please enter a Bank Name", 
                },
                ifsc_code : 
				{
                	required : "Please enter a Ifsc code ", 
                },
                					 
				
        }
		
		
  });
});
});
