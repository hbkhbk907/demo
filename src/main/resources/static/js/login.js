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
			  alert(textStatus);
			  if(data["result"]=="0"){
				  alert("登录成功");
			  }else{
				  alert("登录失败");
			  }
		  }
		});
	return false;
}