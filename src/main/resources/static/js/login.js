function User(account,password){
	this.account=account;
	this.password=password;
	this.getAccount=function(){
		return this.account;
	}
	this.getPassword=function(){
		return this.password;
	}
}

function login(){
	var acc=$("#account").val();
	var psd=$("#password").val();
	alert(psd);
	var user=new User(account,password);
	$.ajax({
		  type: "POST",
		  url: "127.0.0.1:8000/login",
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