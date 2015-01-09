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

   $("#admissionstudentdetails").validate({
        rules : {
        	
        	
        	Nationality:"nation",
        	Mobile:"num",
        	Email:"email",
        	PresentPincode:"fld2",
        	PermanentPincode:"fld2",
        	EmergencyPincode:"fld2",
        	FirstName:"alphabetsonly",
        	LastName:"alphabetsonly",
        	GuardianFirstName:"alphabetsonly",
        	GuardianLastName:"alphabetsonly",
        	MotherFirstName:"alphabetsonly",
        	
        	
        	
            	FirstName : 
				{
                        required : true,
                        alphabetsonly: true
                },
                LastName : 
				{
                        required : true,
                        alphabetsonly: true
                },
                DateOFBirth : 
				{
                        required : true     
                },
                Gender :{
                	
                	required : true
                },
                Nationality :{
                	
                	required : true,
                	nation: true
                },
                PresentAddressLine1 :{
                	
                	required : true
                
                },
                PresentCity :{
                	
                	required : true
                	
                },
                PresentPincode :{
                	
                	required : true,
                	fld2:true
                },
                PresentCountry :{
                	
                	required : true
                },
                PresentState :{
                	required : true
                },
                
                
                PermanentAddressLine1 :
                	{
                	
                	required : true
                	
                	},
                	PermanentCity :{
                	
                	required :true
                	
                },
                PermanentPincode :
                	{
                	
                	required : true,
                	fld2:true
                	},
                	PermanentCountry :
                	{
                	
                	required : true
                	
                	},
           
                	PermanentState :
                		{
                		
                		required : true
                		
                		},
                	
                		               		
                   		EmergencyAddressLine1 :
                     	{
                     	
                     	required : true
                     	
                     	},
                     	EmergencyCity :{
                     	
                     	required :true
                     	
                     },
                     EmergencyPincode :
                     	{
                     	
                     	required : true,
                     	fld2:true
                     	},
                     	EmergencyCountry :
                     	{
                     	
                     	required : true
                     	
                     	},
                
                     	EmergencyState :
                     		{
                     		
                     		required : true
                     		
                     		},
                     	
                     		Mobile : 
				{
                        required : true, 
                        num : true
                },
				
                Email: 
                {
                	required: true,
                	email: true
                },
                
                GuardianFirstName : 
				{
                        required : true,
                        alphabetsonly: true
                },
                GuardianLastName : 
				{
                        required : true,
                        alphabetsonly: true
                },
                Relation : 
				{
                        required : true
                        
                },
                MotherFirstName : 
				{
                        required : true,
                        alphabetsonly: true
                },
                ParentOccupation : 
				{
                        required : true
                        
                },
                ParentAnnualIncome : 
				{
                        required : true
                        
                },
                
                
                
                
                
              
        		
				
        },
        messages : {
        	
				FirstName : 
				{
					required : "Please enter a First Name",     
                },
                LastName : 
				{
                	required : "Please enter a Last Name", 
                },
                DateOFBirth : 
				{
                        required : "Please enter a Date of Birth ",   
                },
                Gender :{
                	
                	required :"Please enter a Gender",
                },
                Nationality :{
                	
                	required : "Please enter a Nationality",
                	
                },
                PresentAddressLine1 :{
                	
                	required : "Please enter a Address Line1",
                
                },

                PresentCity :{
                	
                	required : "Please enter a City",
                	
                },
                PresentPincode :{
                	
                	required : "Please enter a Pincode",
                },
                PresentCountry :{
                	
                	required : "Please enter a Country",
                },
                PresentState :{
                	required : "Please enter a State",
                },
                
                
                PermanentAddressLine1 :
                	{
                	
                	required : "Please enter a Address Line1",
                	
                	},
                	PermanentCity :{
                	
                	required :"Please enter a City",
                	
                },
                PermanentPincode :
                	{
                	
                	required : "Please enter a Pincode",
                	
                	},
                	PermanentCountry :
                	{
                	
                	required : "Please enter a Country",
                	
                	},
           
                	PermanentState :
                		{
                		
                		required : "Please enter a State",
                		
                		},
                	
                		
                		EmergencyAddressLine1 :
                     	{
                     	
                     	required : "Please enter a Address Line1",
                     	
                     	},
                     	EmergencyCity :{
                     	
                     	required :"Please enter a City",
                     	
                     },
                     EmergencyPincode :
                     	{
                     	
                     	required : "Please enter a Pincode",
                     	
                     	},
                     	EmergencyCountry :
                     	{
                     	
                     	required : "Please enter a Country",
                     	
                     	},
                
                     	EmergencyState :
                     		{
                     		
                     		required : "Please enter a State",
                     		
                     		},
                     	                		               		
                		              	               		
                		
                     		Mobile : 
				{
                        required : "Please enter a Valid Mobile Number",     
                },
				
                Email : 
				{
                        required : "Please enter a Valid Email ID",     
                },
                
                GuardianFirstName : 
				{
					required : "Please enter a First Name",     
                },
                GuardianLastName : 
				{
                	required : "Please enter a Last Name", 
                },
                Relation : 
				{
                	required : "Please enter a Relation", 
                },
                MotherFirstName : 
				{
					required : "Please enter a First Name",     
                },
                ParentOccupation : 
				{
                	required : "Please enter a ParentOccupation", 
                },
                ParentAnnualIncome : 
				{
                	required : "Please enter a Parent Annual Income", 
                },
                
                
                
               
               
				
				
				
				
				
				
				
				
               
						 
				
        }
		
		
  });
});
});
