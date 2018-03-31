package com.example.controller;

import static com.example.util.Util.*;
import javax.annotation.Resource;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.ResultVo;
import com.example.entity.User;
import com.example.repository.entity.UserDo;
import com.example.service.LoginService;

@Controller
public class LoginController {
	
	@Resource(name="LoginService")
	private LoginService loginService;
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	@ResponseBody
	public ResultVo login(@RequestBody User user){
		String account=getString(user.getAccount());
		String password=getString(user.getPassword());
		UserDo userDo=loginService.findByUser(account);
		ResultVo result=null;
		if(userDo==null){
			result=new ResultVo("1","账号不存在");
		}else{
			if(password.equals(userDo.getPassword())){
				result=new ResultVo("0","登录成功");
			}else{
				result=new ResultVo("2","账号或者密码错误");
			}
		}
		return result;
	}
	
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String mainPage(){
		return "login";
	}
}
