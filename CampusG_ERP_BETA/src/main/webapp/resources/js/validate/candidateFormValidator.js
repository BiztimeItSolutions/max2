$(document).ready(function(){
	
	$.validator.addMethod("nation", function(value, element) {
		 
	    return /^[A-Z]{4,15}$/i.test(value);
	}, "Nationality should contain 4 to 15 characters");

		 $.validator.addMethod("alphabetsonly", function(value, element) {
		        return /[A-Za-z]{1,}$/i.test(value);
		    },  "Please enter alphabets");
	
	
		 $.validator.addMethod("num", function(value, element) {
			    return /^[+]\d{12}$/i.test(value);
			}, "Field start with + and contain 12 digits");
		 $.validator.addMethod("email", function(value, element) {
		        return /^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,4}$/i.test(value);
		    }, "Email id should be in ex:john@gmail.com format");
		 $.validator.addMethod("pincode", function(value, element) {
		        return /^\d{6}$/i.test(value);
		    },  "Please Enter 6 digits");
		 
		 $("#admissionForm").validate({		
		 		rules:{
		 			mobile:"num",
		        	email:"email",
		        	presentaddresspincode:"pincode",
		        	permanentaddresspincode:"pincode",
		        	emergencyaddresspincode:"pincode",
		        	guardianfirstname:"alphabetsonly",
		        	guardianlastname:"alphabetsonly",
		        	motherfirstname:"alphabetsonly",
		        	fatherfirstname:"alphabetsonly",
		        	fatherlastname:"alphabetsonly",
		        	motherlastname:"alphabetsonly",
		        	nationality:"nation",
		        	firstname:"alphabetsonly",
		        	lastname:"alphabetsonly",
		        	
		        	
		        	firstname : 
					{
	                        required : true,
	                        alphabetsonly: true,
	                        maxlength: 50
	                },
	                middlename:
	                	{
	                	
                        alphabetsonly: true,
                        maxlength: 50
	                	
	                	},
	                lastname : 
					{
	                        required : true,
	                        alphabetsonly: true
	                },
	                dateofbirth : 
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
	                birthplace:{
	                	maxlength: 50
	                },
		        	
	                mothertongue:{
	                	maxlength: 50
	                },
	                religion:{
	                	maxlength: 50
	                },
		        	//end of personal
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
	                },
		        	//end of contact
	                guardianfirstname : 
					{
	                       // required : true,
	                        alphabetsonly: true,
	                        maxlength: 50
	                        
	                },
	                guardianlastname : 
					{
	                       // required : true,
	                        alphabetsonly: true,
	                        maxlength: 50
	                },
	                guardinrelation : 
					{
	                      //  required : true
	                        
	                },
	                guardian_mobile:{
	                	num : true
	                	
	                },
	                guardian_email:{
	                	email: true
	                },
	                fatherfirstname : 
					{
	                       // required : true,
	                        alphabetsonly: true,
	                        maxlength: 50
	                },
	                fathermiddlename:{
	                	 alphabetsonly: true,
	                        maxlength: 50
	                	
	                },
	                fatherlastname : 
					{
	                     //   required : true,
	                        alphabetsonly: true,
	                        maxlength: 50
	                },
	                father_mobile:{
	                	
	                	num : true
	                },
	                father_email:{
	                	email: true
	                },
	                motherfirstname : 
					{
	                      //  required : true,
	                        alphabetsonly: true,
	                        maxlength: 50
	                },
	                mother_middle_name:{
	                	alphabetsonly: true,
                        maxlength: 50
	                },
	                
	                motherlastname : 
					{
	                     //   required : true,
	                        alphabetsonly: true,
	                        maxlength: 50
	                },
	                mother_mobile:{
	                	num : true
	                },
	                mother_email:{
	                	email: true
	                }
		 		},
		 		 messages : {
		         	
		         	firstname : 
		 				{
		 					required : "Please enter a First Name",     
		                 },
		                 lastname : 
		 				{
		                 	required : "Please enter a Last Name", 
		                 },
		                 dateofbirth : 
		 				{
		                        required : "Please enter a Date of Birth ",   
		                 },
		                 gender :{
		                 	
		                 	required :"Please enter a Gender",
		                 },
		                 nationality :{
		                 	
		                 	required : "Please enter a Nationality",
		                 	
		                 },
		                 //end of personal
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
		                 },
		                 //end of contact
		                 guardianfirstname : 
		 				{
		 					required : "Please enter a First Name",     
		                 },
		                 guardianlastname : 
		 				{
		                 	required : "Please enter a Last Name", 
		                 },
		                 guardinrelation : 
		 				{
		                 	required : "Please enter a Relation", 
		                 },
		                 fatherfirstname : 
		 				{
		 					required : "Please enter a First Name",     
		                 },
		                 fatherlastname : 
		 				{
		 					required : "Please enter a Last Name",     
		                 },
		                 motherfirstname : 
		 				{
		 					required : "Please enter a Last Name",     
		                 },
		                 motherlastname : 
		 				{
		 					required : "Please enter a Last Name",     
		                 }
		         }
		 	});
				 
				//end of validation
	
	
});

