package com.example.entity;

public class ResultVo {
	private String result;
	private String msg;
	
	public ResultVo(String result,String msg){
		this.result=result;
		this.msg=msg;
	}
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
