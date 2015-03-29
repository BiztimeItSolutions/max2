 $(document).ready(function(){

	 

	 
	 $.validator.addMethod("collegeName", function(value, element) {
		 return /[A-Za-z0-9]$/i.test(value);
	    },  "Please enter valid address");
	 
	 $.validator.addMethod("universityId", function(value, element) {
		 return /[A-Za-z0-9]$/i.test(value);
	    },  "Please enter valid university ID");
	 
	 $.validator.addMethod("collegeCode", function(value, element) {
		 return /[A-Za-z0-9]$/i.test(value);
	    },  "Please enter valid college code");
	 
	 $.validator.addMethod("collegeEmail", function(value, element) {
	        return /^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,4}$/i.test(value);
	    }, "Email id should be in ex:john@gmail.com format");
	
	 $.validator.addMethod("collegeAddress", function(value, element) {
		 return /[A-Za-z0-9]$/i.test(value);
	    },  "Please enter valid address");
	 
	 $.validator.addMethod("collegePhone", function(value, element) {
		    return /^[+]\d{12}$/i.test(value);
		}, "Field start with + and contain 12 digits");
	 
	 $.validator.addMethod("statusName", function(value, element) {
		 return /[A-Za-z]$/i.test(value);
	    },  "Please enter valid status");
	 
	 $.validator.addMethod("groupName", function(value, element) {
		 return /[A-Za-z+-]$/i.test(value);
	    },  "Please enter valid blood group");
	 
	 $.validator.addMethod("categoryName", function(value, element) {
		 return /[A-Za-z+-]$/i.test(value);
	    },  "Please enter valid Category");
	 
	 $.validator.addMethod("courseName", function(value, element) {
		 return /[A-Za-z+-]$/i.test(value);
	    },  "Please enter valid Course");
	 
	 
	 $.validator.addMethod("courselevelName", function(value, element) {
		 return /[A-Za-z+-]$/i.test(value);
	    },  "Please enter valid Courselevel");
	 
	 
	 $.validator.addMethod("departmentName", function(value, element) {
		 return /[A-Za-z+-]$/i.test(value);
	    },  "Please enter valid Department");
	 
	 
	 $.validator.addMethod("documentName", function(value, element) {
		 return /[A-Za-z+-]$/i.test(value);
	    },  "Please enter valid Document");
	 
	 
	 $.validator.addMethod("optionalName", function(value, element) {
		 return /[A-Za-z+-]$/i.test(value);
	    },  "Please enter valid Optional subject");
	 
	 $.validator.addMethod("modePayment", function(value, element) {
		 return /[A-Za-z+-]$/i.test(value);
	    },  "Please enter valid mode of payment");
	 
	 $.validator.addMethod("permissionName", function(value, element) {
		 return /[A-Za-z+-]$/i.test(value);
	    },  "Please enter valid mode of permission");
	 
	 $.validator.addMethod("programName", function(value, element) {
		 return /[A-Za-z+-]$/i.test(value);
	    },  "Please enter valid mode of program");
	 
	 $.validator.addMethod("receiptName", function(value, element) {
		 return /[A-Za-z+-]$/i.test(value);
	    },  "Please enter valid mode of receipt");
	 
	 $.validator.addMethod("roleName", function(value, element) {
		 return /[A-Za-z+-]$/i.test(value);
	    },  "Please enter valid mode of role");

	 $.validator.addMethod("subjectName", function(value, element) {
		 return /[A-Za-z+-]$/i.test(value);
	    },  "Please enter valid mode of subject");

	 
	 $.validator.addMethod("usertypeName", function(value, element) {
		 return /[A-Za-z+-]$/i.test(value);
	    },  "Please enter valid mode of usertype");

	
	 $.validator.addMethod("moduleName", function(value, element) {
		 return /[A-Za-z+-]$/i.test(value);
	    },  "Please enter valid mode of module name");
	 
	 
	 
	 $.validator.addMethod("parentId", function(value, element) {
		 return /[A-Za-z+-]$/i.test(value);
	    },  "Please enter valid mode of parent id");

	
	 $.validator.addMethod("collegeNamefk", function(value, element) {
		 return /[A-Za-z+-]$/i.test(value);
	    },  "Please enter valid mode of college name");

	
	 
$(function() {

   $("#validate").validate({
        rules : {
        	
        	parentId:"parentId",
        	moduleName:"moduleName",
        	collegeName:"collegeName",
        	collegeCode:"collegeCode",
        	collegeEmail:"collegeEmail",
        	collegeAddress:"collegeAddress",
        	collegePhone:"collegePhone",
        	categoryName:"categoryName",
        	groupName:"groupName",
        	statusName:"statusName",
        	courseName:"courseName",
        	courselevelName:"courselevelName",
        	departmentName:"departmentName",
        	documentName:"documentName",
        	optionalName:"optionalName",
        	modePayment:"modePayment",
        	permissionName:"permissionName",
        	programName:"programName",
        	receiptName:"receiptName",
        	roleName:"roleName",
        	subjectName:"subjectName",
        	usertypeName:"usertypeName",
        	universityId:"universityId",
        	collegeNamefk:"collegeNamefk",
        	
        	collegeNamefk:{
            	
            	required : true,
            	collegeNamefk:true
            },
        	
            
            parentId:{
            	
            	required : true,
            	parentId:true
            },
            
        	moduleName:{
            	
            	required : true,
            	moduleName:true
            },
            
            
            departmentName:{
            	
            	required : true,
            	departmentName:true
            },
        	
        	courselevelName:{
            	
            	required : true,
            	courselevelName:true
            },
        	
        	
        	collegeName :{
                	
                	required : true,
                	collegeName:true
                },
                collegeCode :{
                	
                	required : true,
                	collegeCode:true
                	
                },
                collegeEmail :{
                	
                	required : true,
                	collegeEmail:true
                },
                collegeAddress :{
                	
                	required : true,
                	collegeAddress:true
                },
                collegePhone :{
                	required : true,
                	collegePhone:true
                },
                
                categoryName:{
                	
                	required : true,
                	categoryName:true
                },
            	
            	groupName:{
                	
                	required : true,
                	groupName:true
                },
            	
            	statusName :{
                	
                	required : true,
                	statusName:true
                },
                
                courseName:{
                	required : true,
                	courseName:true
                },
                
                documentName:{
                	required : true,
                	documentName:true
                },
                
                optionalName:{
                	required : true,
                	optionalName:true
                },
                
                modePayment:{
                	required : true,
                	modePayment:true
                },
                
                permissionName:{
                	required : true,
                	permissionName:true
                },
                
                programName:{
                	required : true,
                	programName:true
                },
                
                receiptName:{
                	required : true,
                	receiptName:true
                },
                
                roleName:{
                	required : true,
                	roleName:true
                },
                
                subjectName :{
                	required : true,
                	subjectName:true
                },
                
                usertypeName :{
                	required : true,
                	usertypeName:true
                },
                
                universityId:{
                	required : true,
                	universityId:true
                },
               
                
        },
        messages : {
        	
        	
        	collegeNamefk:{
            	
            	required : "Please enter college name",
            
            },
        
        	moduleName:{
            	
            	required : "Please enter module name",
            
            },
        
        	groupName :{
            	
            	required : "Please enter Blood group",
            
            },
        
        	collegePhone :{
                	
                	required : "Please enter Phone number",
                
                },
                
                universityId:{
                	
                	required : "Please enter university ID",
                
                },

                collegeAddress :{
                	
                	required : "Please enter address",
                	
                },
                collegeEmail :{
                	
                	required : "Please enter a Email",
                },
                
                collegeName :{
                	required : "Please enter a Name",
                	
                },
                
                
                collegeCode :{
                	required : "Please enter college code",
                	
                },
                
                statusName :{
                	required : "Please enter status",
                	
                },
                
                categoryName :{
                	required : "Please enter category",
                	
                },
                
                courseName :{
                	required : "Please enter course",
                	
                },
                
                
                courselevelName:{
                	required : "Please enter courselevel",
                	
                },
                
                
                departmentName:{
                	required : "Please enter department",
                	
                },
               
                documentName:{
                	required : "Please enter document",
                	
                },
                
                optionalName:{
                	required : "Please enter optional subject",
                	
                },
                
                modePayment:{
                	required : "Please enter mode of payment",
                	
                },
                
                permissionName:{
                	required : "Please enter  permission",
                	
                },
                
                programName:{
                	required : "Please enter  program",
                	
                },
                
                receiptName:{
                	required : "Please enter  receipt",
                	
                },
                
                roleName:{
                	required : "Please enter role",
                	
                },
                
                subjectName:{
                	required : "Please enter subject",
                	
                },
                
                usertypeName:{
                	required : "Please enter  usertype",
                	
                },
                
               
        }
		
		
  });
});
});
