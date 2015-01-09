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
	 $.validator.addMethod("fld1", function(value, element) {
	        return /[A-Za-z]{1,}$/i.test(value);
	    },  "Please enter alphabets");
	 
	 
$(function() {

   $("#admissionstudentdetails").validate({
        rules : {
        	
        	
        	nationality:"nation",
        	mobile:"num",
        	email:"email",
        	present_pincode:"fld2",
        	permanent_pincode:"fld2",
        	first_name:"fld1",
        	last_name:"fld1",
        	
        	admission_no : 
			{
                    required : true     
            },
            admission_date:
            	{
            	
            	   required :true
            	
            	},
                first_name : 
				{
                        required : true,
                        fld1: true
                },
                last_name : 
				{
                        required : true,
                        fld1: true
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
                place :
        		{
        		
        		required : true
        		
        		},
        		date :
        		{
        		
        		required : true
        		
        		},
        		
				
        },
        messages : {
        	admission_no : 
			{
			required : "Please enter an Admission Number", 
			},
			admission_date :
				{
				required : "Please enter an Admission Date",
				},
				first_name : 
				{
					required : "Please enter a First Name",     
                },
                last_name : 
				{
                	required : "Please enter a Last Name", 
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
                	
                mobile : 
				{
                        required : "Please enter a Valid Mobile Number",     
                },
				
                place : 
				{
                        required : "Please enter a Place",     
                },
                date : 
				{
                        required : "Please enter a Date",     
                },
               
				
				
				
				
				
				
				
				
               
						 
				
        }
		
		
  });
});
});
