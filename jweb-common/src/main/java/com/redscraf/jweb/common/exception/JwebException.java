package com.redscraf.jweb.common.exception;

/**
 * 自定义异常
 * 
 * @author LeeJohn
 * @date 2018-11-23 18:13
 */
public class JwebException extends RuntimeException {
	private static final long serialVersionUID = 1L;

    private String msg;
    private int code = 500;

    public JwebException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public JwebException(String msg, Throwable e) {
		super(msg, e);
		this.msg = msg;
	}

	public JwebException(String msg, int code) {
		super(msg);
		this.msg = msg;
		this.code = code;
	}

	public JwebException(String msg, int code, Throwable e) {
		super(msg, e);
		this.msg = msg;
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	
}
