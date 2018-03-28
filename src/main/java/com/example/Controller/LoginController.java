package com.example.Controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.ResultVo;
import com.example.entity.User;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	@ResponseBody
	public ResultVo login(User user){
		System.out.println(user.getAccount());
		System.out.println(user.getPassword());
		ResultVo result=new ResultVo("0");
		return result;
	}
	
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String mainPage(){
		return "login";
	}
}
