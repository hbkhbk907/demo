function login(){
	var user={};
	user["account"]=$("#account").val();
	user["password"]=$("#password").val();
	$.ajax({
		  type: "POST",
		  url: "/login",
		  data: JSON.stringify(user),
		  dataType: "json",
		  contentType: "application/json",
		  success: function(data,textStatus){
			  if(data["result"]=="0"){
				  alert("登录成功");
			  }else{
				  alert(data["msg"]);
			  }
		  }
		});
	return false;
}