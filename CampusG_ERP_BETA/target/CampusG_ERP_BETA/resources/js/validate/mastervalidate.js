 $(document).ready(function(){

	 
	 $.validator.addMethod("collegeId", function(value, element) {
		 return /[A-Za-z0-9]$/i.test(value);
	    },  "Please enter valid Id");
	 
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
	
	 $.validator.addMethod("permissionName", function(value, element) {
		 return /[A-Za-z+-]$/i.test(value);
	    },  "Please enter valid mode of permission");
	 
	 $.validator.addMethod("programName", function(value, element) {
		 return /[A-Za-z+-]$/i.test(value);
	    },  "Please enter valid  program");
	 
	 $.validator.addMethod("receiptName", function(value, element) {
		 return /[A-Za-z+-]$/i.test(value);
	    },  "Please enter valid  receipt");
	 
	 $.validator.addMethod("roleName", function(value, element) {
		 return /[A-Za-z+-]$/i.test(value);
	    },  "Please enter valid  role");

	 $.validator.addMethod("subjectName", function(value, element) {
		 return /[A-Za-z+-]$/i.test(value);
	    },  "Please enter valid  subject");

	 
	 $.validator.addMethod("usertypeName", function(value, element) {
		 return /[A-Za-z+-]$/i.test(value);
	    },  "Please enter valid  usertype");

	
	 $.validator.addMethod("moduleName", function(value, element) {
		 return /[A-Za-z+-]$/i.test(value);
	    },  "Please enter valid  module name");
	 
	 
	 
	 $.validator.addMethod("parentId", function(value, element) {
		 return /[0-9A-Za-z]$/i.test(value);
	    },  "Please enter valid  parent id");

	 

	 $.validator.addMethod("paymentMode", function(value, element) {
		 return /[0-9A-Za-z]$/i.test(value);
	    },  "Please enter valid  payment mode");
	
	
	 $.validator.addMethod("receiptName", function(value, element) {
		 return /[0-9A-Za-z]$/i.test(value);
	    },  "Please enter valid  receipt name");
	
	 $.validator.addMethod("subjectName", function(value, element) {
		 return /[0-9A-Za-z]$/i.test(value);
	    },  "Please enter valid  subject name");
	
	 
	 $.validator.addMethod("subjectCode", function(value, element) {
		 return /[0-9A-Za-z]$/i.test(value);
	    },  "Please enter valid  subject code");
	
	 $.validator.addMethod("programNamefk", function(value, element) {
		 return /[0-9A-Za-z]$/i.test(value);
	    },  "Please enter valid  program name");
	 
	 
	 
	 $.validator.addMethod("courselevelNamefk", function(value, element) {
		 return /[0-9A-Za-z]$/i.test(value);
	    },  "Please enter valid  course level");
	 
	 
	 
	 $.validator.addMethod("collegeNamefk", function(value, element) {
		 return /[0-9A-Za-z]$/i.test(value);
	    },  "Please enter valid  college name");


	 $.validator.addMethod("leaveName", function(value, element) {
		 return /[0-9A-Za-z]$/i.test(value);
	    },  "Please enter valid  leave type");


	 
	 $.validator.addMethod("leaveCount", function(value, element) {
		 return /[0-9]$/i.test(value);
	    },  "Please enter valid  leave count");


	 
	  
$.validator.addMethod("leaveCode", function(value, element) {
		 return /[0-9A-Za-z]$/i.test(value);
	    }, "Please enter valid  college name");

	 
	 $.validator.addMethod("resetDate", function(value, element) {
		 return /[0-9A-Za-z]$/i.test(value);
	    },  "Please enter valid  date");


	 
	 $.validator.addMethod("enableLeave", function(value, element) {
		 return /[0-9A-Za-z]$/i.test(value);
	    },  "Please enter leave forward");
	 
	 
	 
	 $.validator.addMethod("status", function(value, element) {
		 return /[A-Za-z]$/i.test(value);
	    },  "Please enter status");
	 
	 $.validator.addMethod("batchId", function(value, element) {
		 return /[A-Za-z]$/i.test(value);
	    },  "Please enter id");

	 
	 
	 $.validator.addMethod("batchName", function(value, element) {
		 return /[A-Za-z0-9]$/i.test(value);
	    },  "Please enter batch name");

	 $.validator.addMethod("courseId", function(value, element) {
		 return /[A-Za-z]$/i.test(value);
	    },  "Please enter course"); 
	 
	 $.validator.addMethod("startDate", function(value, element) {
		 return /[A-Za-z]$/i.test(value);
	    },  "Please enter start date");
	 
	 $.validator.addMethod("endDate", function(value, element) {
		 return /[A-Za-z]$/i.test(value);
	    },  "Please enter end date ");

	    $.validator.addMethod("groupId", function(value, element) {
			 return /[A-Za-z]$/i.test(value);
		    },  "Please enter group id ");
	    
	    $.validator.addMethod("categoryId", function(value, element) {
			 return /[A-Za-z]$/i.test(value);
		    },  "Please enter category id ");
	    
	    $.validator.addMethod("collegeId", function(value, element) {
			 return /[A-Za-z]$/i.test(value);
		    },  "Please enter college id ");
	    
	    $.validator.addMethod("courseId", function(value, element) {
			 return /[A-Za-z]$/i.test(value);
		    },  "Please enter course id ");
	    
	    $.validator.addMethod("courselevelId", function(value, element) {
			 return /[A-Za-z]$/i.test(value);
		    },  "Please enter course id ");
	    
	    $.validator.addMethod("departmentId", function(value, element) {
			 return /[A-Za-z]$/i.test(value);
		    },  "Please enter department id ");
	    
	    $.validator.addMethod("documentId", function(value, element) {
			 return /[A-Za-z]$/i.test(value);
		    },  "Please enter document id ");



	    $.validator.addMethod("leavetypeId", function(value, element) {
			 return /[A-Za-z]$/i.test(value);
		    },  "Please enter department id ");

	    $.validator.addMethod("moduleId", function(value, element) {
			 return /[A-Za-z]$/i.test(value);
		    },  "Please enter module id ");


	    $.validator.addMethod("optionalId", function(value, element) {
			 return /[A-Za-z]$/i.test(value);
		    },  "Please enter optional id ");


	    $.validator.addMethod("paymentmodeId", function(value, element) {
			 return /[A-Za-z]$/i.test(value);
		    },  "Please enter optional id ");
	    
	    

	    $.validator.addMethod("permissionId", function(value, element) {
			 return /[A-Za-z]$/i.test(value);
		    },  "Please enter permission id ");
	    
	    
	    $.validator.addMethod("programId", function(value, element) {
			 return /[A-Za-z]$/i.test(value);
		    },  "Please enter program id ");

	    
	    $.validator.addMethod("receiptId", function(value, element) {
			 return /[A-Za-z]$/i.test(value);
		    },  "Please enter receipt id ");
	    
	    
	    $.validator.addMethod("roleId", function(value, element) {
			 return /[A-Za-z]$/i.test(value);
		    },  "Please enter role id ");

	    
	    $.validator.addMethod("statusId", function(value, element) {
			 return /[A-Za-z]$/i.test(value);
		    },  "Please enter status id ");

	    $.validator.addMethod("code", function(value, element) {
			 return /[A-Za-z0-9]$/i.test(value);
		    },  "Please enter course code");
	    
	    
	    $.validator.addMethod("code", function(value, element) {
			 return /[A-Za-z]$/i.test(value);
		    },  "Please select grading system");
	    
	    
	    
	    $.validator.addMethod("elective", function(value, element) {
			 return /[A-Za-z]$/i.test(value);
		    },  "Please select elective ");
	    
	    
	    
	    
	    $(function() {

   $("#validate").validate({
        rules : {
        	elective:"elective",
        	code:"code",
        	statusId:"statusId",
        	roleId:"roleId",
        	permissionId:"permissonId",
        	paymentmodeId:"paymentmodeId",
        	moduleId:"moduleId",
        	leavetypeId:"leavetypeId",
        	documentId:"documentId",
        	courselevelId:"courselevelId",
        	courseId:"courseId",
        	collegeId:"collegeId",
        	groupId:"groupId",
        	endDate:"endDate",
        	startDate:"startDate",
        	courseId:"courseId",
        	batchName:"batchName",
        	batchId:"batchId",
        	collegeCode:"collegeCode",
        	leaveName:"leavename",
        	leaveCode:"leaveCode",
        	leaveCount:"leaveCount",
        	resetDate:"resetDate",
        	enableLeave:"enableLeave",
        	status:"status",
        	collegeNamefk:"collegeNamefk",
        	programNamefk:"programNamefk",
        	subjectName:"subjectName",
        	subjectCode:"subjectCode",
        	receiptName:"receiptName",
        	paymentMode:"paymentMode",
        	academicYear:"academicYear",
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
        	
        	permissionName:"permissionName",
        	programName:"programName",
        	receiptName:"receiptName",
        	roleName:"roleName",
        	subjectName:"subjectName",
        	usertypeName:"usertypeName",
        	universityId:"universityId",
        	courselevelNamefk:"courselevelNamefk",
        	categoryId:"categoryId",
        	departmentId:"departmentId",
        	documentId:"documentId",
        	optionalId:"optionalId",
        	programId:"programId",
        	receipId:"receiptId",
        	subjectId:"subjectId",
        	usertypeId:"usertypeId",
        	grading:"grading",
        	
        	elective:{
        		
        		required : true,
             	usertypeId:true,
             	maxlength:20
        		
        	},
        	code:{
        		
        		required : true,
             	usertypeId:true,
             	maxlength:20
        		
        	},
        	usertypeId:{
        		
        		required : true,
             	usertypeId:true,
             	maxlength:20
        		
        	},
        	subjectId:{
        		
        		required : true,
             	statusId:true,
             	maxlength:20
        		
        	},
        	
        	statusId:{
             	
             	required : true,
             	statusId:true,
             	maxlength:20
             },
        	
             roleId:{
             	
             	required : true,
             	receiptId:true,
             	maxlength:20
             },
        	receiptId:{
             	
             	required : true,
             	receiptId:true,
             	maxlength:20
             },
        	
        	
        	permissionId:{
             	
             	required : true,
             	permissionId:true,
             	maxlength:20
             },
        	paymentmodeId:{
             	
             	required : true,
             	paymentmodeId:true,
             	maxlength:20
             },
        	moduleId:{
             	
             	required : true,
             	moduleId:true,
             	maxlength:20
             },
        	
        	leavetypeId:{
             	
             	required : true,
             	leavetypeId:true,
             	maxlength:20
             },
        	documentId:{
             	
             	required : true,
             	documentId:true,
             	maxlength:20
             },
        	departmentId:{
             	
             	required : true,
             	departmentId:true,
             	maxlength:20
             },
        	courselevelId:{
             	
             	required : true,
             	courselevelId:true,
             	maxlength:20
             },
        	collegeId:{
             	
             	required : true,
             	collegeId:true,
             	maxlength:20
             },
        	categoryId:{
             	
             	required : true,
             	categoryId:true,
             	maxlength:20
             },
        	groupId:{
             	
             	required : true,
             	groupId:true,
             	maxlength:20
             },
        	
             endDate:{
             	
             	required : true,
             	endDate:true,
             	maxlength:20
             },

        	startDate:{
             	
             	required : true,
             	startdate:true,
             	maxlength:20
             },
        	batchName:{
             	
             	required : true,
             	batchName:true,
             	maxlength:20
             },
             
             courseId:{
              	
              	required : true,
              	courseId:true,
              	maxlength:20
              },
        	
        	batchId:{
             	
             	required : true,
             	collegeId:true,
             	maxlength:20
             },
             
        	collegeId:{
             	
             	required : true,
             	collegeId:true,
             	maxlength:20
             },
             

        	leaveName:{
             	
             	required : true,
             	leaveName:true,
             	maxlength:50
             },
             
             leaveCode:{
              	
              	required : true,
              	leaveCode:true,
              	maxlength:20
              },
              
              leaveCount:{
               	
               	required : true,
               	leaveCount:true,
               	maxlength:20
               },
               
               resetDate:{
                	
                	required : true,
                	resetDate:true
                },
                
                enableLeave:{
                 	
                 	required : true,
                 	enableLeave:true,
                 	maxlength:20
                 	
                 },
                 
                 status:{
                  	
                  	required : true,
                  	status:true,
                  	maxlength:20
                  },
                  



             
             collegeNamefk:{
             	
             	required : true,
             	collegeNamefk:true,
             },
        	programNamefk:{
             	
             	required : true,
             	programNamefk:true
             },
subjectName:{
             	
             	required : true,
             	subjectName:true,
             	maxlength:50
             },
        	
        	
subjectCode:{
             	
             	required : true,
             	subjectCode:true,
             	maxlength:50
             },
        	
        	receiptName:{
             	
             	required : true,
             	receiptName:true,
             	maxlength:50
             },
        	
        	paymentMode:{
             	
             	required : true,
             	paymentMode:true,
             	maxlength:20
             },
        	academicYear:{
             	
             	required : true,
             	academicYear:true,
             	maxlength:20
             	
             },
            
            parentId:{
            	
            	required : true,
            	parentId:true,
            	maxlength:20
            },
            
        	moduleName:{
            	
            	required : true,
            	moduleName:true,
            	maxlength:50
            },
            
            
            departmentName:{
            	
            	required : true,
            	departmentName:true,
            	maxlength:50
            },
        	
        	courselevelName:{
            	
            	required : true,
            	courselevelName:true,
            	maxlength:50
            },
            
            
            courselevelNamefk:{
            	
            	required : true,
            	courselevelNamefk:true,
            	maxlength:50
            },
        	
        	
        	collegeName :{
                	
                	required : true,
                	collegeName:true,
                	maxlength:50
                },
                collegeCode :{
                	
                	required : true,
                	collegeCode:true,
                	maxlength:50
                	
                },
                collegeEmail :{
                	
                	required : true,
                	collegeEmail:true,
                	maxlength:100
                },
                collegeAddress :{
                	
                	required : true,
                	collegeAddress:true,
                	maxlength:150
                },
                collegePhone :{
                	required : true,
                	collegePhone:true,
                	maxlength:20
                },
                
                categoryName:{
                	
                	required : true,
                	categoryName:true,
                	maxlength:50
                },
            	
            	groupName:{
                	
                	required : true,
                	groupName:true,
                	maxlength:6
                },
            	
            	statusName :{
                	
                	required : true,
                	statusName:true,
                	maxlength:20
                },
                
                courseName:{
                	required : true,
                	courseName:true
                },
                
                documentName:{
                	required : true,
                	documentName:true,
                	maxlength:50
                },
                
                optionalName:{
                	required : true,
                	optionalName:true,
                	maxlength:50
                },
                
                
                permissionName:{
                	required : true,
                	permissionName:true,
                	maxlength:50
                },
                
                programName:{
                	required : true,
                	programName:true,
                	maxlength:50
                },
                
                receiptName:{
                	required : true,
                	receiptName:true,
                	maxlength:50
                },
                
                roleName:{
                	required : true,
                	roleName:true,
                	maxlength:50
                },
                
                subjectName :{
                	required : true,
                	subjectName:true,
                	maxlength:50
                },
                
                usertypeName :{
                	required : true,
                	usertypeName:true,maxlength:50
                },
                
                universityId:{
                	required : true,
                	universityId:true,
                	maxlength:20
                },
                departmentId:{
                	required : true,
                	departmentId:true,
                	maxlength:20
                },
                
                optionalId:{
                	required : true,
                	optionalId:true,
                	maxlength:20
                },
                
                programid:{
                	required : true,
                	programId:true,
                	maxlength:20
                },
                
                grading:{
                	required : true,
                	programId:true,
                	maxlength:20
                },
                
               
                
        },
        messages:
        	{
        	
        	
        	elective:{
        		
        		required : "Please select elective option",
        		
        	},
        	
        	grading:{
        		
        		required : "Please select grading system",
        		
        	},
        	code:{
        		
        		required : "Please enter corse code",
        		
        	},
        	usertypeId:{
        		
        		required : "Please enter usertype Id",
        		
        	},
        	subjectId:{
        		
        		required : "Please enter subject Id",
        		
        	},
        	
        	roleId:{
        		
        		required : "Please enter receipt Id",
        		
        	},
        	
        	
        	receiptId:{
        		
        		required : "Please enter receipt Id",
        		
        	},
        	
        	programId:{
        		
        		required : "Please enter program Id",
        		
        	},
        	
        	permissionId:{
        		
        		required : "Please enter permission Id",
        		
        	},
        	
        	paymentmodeId:{
        		
        		required : "Please enter payment mode Id",
        		
        	},
        	
        	
        	optionalId:{
        		
        		required : "Please enter optional Id",
        		
        	},
        	

        	
        	
        	moduleId:{
        		
        		required : "Please enter module Id",
        		
        	},
        	
        	leavetypeId:{
        		
        		required : "Please enter leave type Id",
        		
        	},
        	
        	documentId:{
        		
        		required : "Please enter department Id",
        		
        	},
        	
        	departmentId:{
        		
        		required : "Please enter department Id",
        		
        	},
        	
        	courselevelId:{
        		
        		required : "Please enter course level Id",
        		
        	},
        	
        	collegeId:{
        		
        		required : "Please enter college Id",
        		
        	},
        	categoryId:{
            	
            	required : "Please enter category Id",
            
            },
        	batchName:{
            	
            	required : "Please enter batch name",
            
            },
             
            
            courseCodefk:{
            	
            	required : "Please enter course name",
            
            },
            
            
            
            startDate:{
            	
            	required : "Please enter start date ",
            
            },
            
            
            endDate:{
            	
            	required : "Please enter end date",
            
            },
            batchId:{
            	
            	required : "Please enter batch Id",
            
            },
 
leaveName:{
            	
            	required : "Please enter leave type",
            
            },
            
leaveCode:{
            	
            	required : "Please enter leave code",
            
            },
            
leaveCount:{
            	
            	required : "Please enter leave count",
            
            },
            
            enableLeave:{
            	
            	required : "Please enter leave forward",
            
            },
            
resetDate:{
            	
            	required : "Please enter reset date",
            
            },
            
            
status:{
            	
            	required : "Please enter status",
            	maxlength : "exceeded field length",
            
            },

        	parentId:{
            	
            	required : "Please enter parent module",
            
            },
        	

            collegeNamefk:{
            	
            	required : "Please enter college name",
            
            },
        	courselevelNamefk:{
            	
            	required : "Please enter course level name",
            
            },
        	
        	programNamefk:{
            	
            	required : "Please enter program name",
            
            },

        	
        	
        	subjectName:{
            	
            	required : "Please enter subject name",
            
            },
        	
        
         subjectCode:{
            	
            	required : "Please enter receipt name",
            
            },
        	
receiptName:{
            	
            	required : "Please enter receiptname",
            
            },
        	
        	
          academicYear:{
            	
            	required : "Please enter year",
            	maxlength:"exceeded field length",
            
            },
        
        	
        
        	moduleName:{
            	
            	required : "Please enter module name",
            
            },
        
        	groupName :{
            	
            	required : "Please enter Blood group",
            	maxlength : "Exceeded field length",
            
            },
        
        	collegePhone :{
                	
                	required : "Please enter Phone number",
                	maxlength : "exceeded field limit",
                
                },
                
                universityId:{
                	
                	required : "Please enter university ID",
                	maxlength : "exceeded field limit",
                
                },

                collegeAddress :{
                	
                	required : "Please enter address",
                	maxlength : "exceeded field limit",
                	
                },
                collegeEmail :{
                	
                	required : "Please enter a Email",
                	maxlength : "exceeded field limit",
                },
                
                collegeName :{
                	required : "Please enter a Name",
                	maxlength : "exceeded field limit",
                },
                
                
                collegeCode :{
                	required : "Please enter college code",
                	maxlength : "exceeded field limit",
                	
                },
                
                statusName :{
                	required : "Please enter status",
                	maxlength : "exceeded field length",
                	
                },
                
                categoryName :{
                	required : "Please enter category",
                	maxlength : "exceeded field length",
                	
                },
                
                courseName :{
                	required : "Please enter course",
                	
                },
                
                
                courselevelName:{
                	required : "Please enter course level",
                	
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
                
                paymentMode:{
                	required : "Please enter  payment mode",
                	
                },
        }
		
		
  });
});
});
