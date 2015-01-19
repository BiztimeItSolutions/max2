var usertype_arr = new Array("Employee","Student","Parent");

var s_a = new Array();
s_a[0]="";
s_a[1]="Director|Principal|HOD|Professor|Assistant Professor|Accountant|Administrator|Librarian";
s_a[2]="Admin|General";
s_a[3]="Parent";

function print_usertype(usertype_id){
	// given the id of the <select> tag as function argument, it inserts <option> tags
	var option_str = document.getElementById(usertype_id);
	option_str.length=0;
	option_str.options[0] = new Option('Select User Type','');
	option_str.selectedIndex = 0;
	for (var i=0; i<usertype_arr.length; i++) {
		option_str.options[option_str.length] = new Option(usertype_arr[i],usertype_arr[i]);
	}
}

function print_role(role_id, role_index){
	var option_str = document.getElementById(role_id);
	option_str.length=0;	// Fixed by Julian Woods
	option_str.options[0] = new Option('Select Role','');
	option_str.selectedIndex = 0;
	var role_arr = s_a[role_index].split("|");
	for (var i=0; i<role_arr.length; i++) {
		option_str.options[option_str.length] = new Option(role_arr[i],role_arr[i]);
	}
}