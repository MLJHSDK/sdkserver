package com.sdkserver.common.exception;

import com.sdkserver.common.result.ErrCode;

/**
 * @ClassName ExistObjectException
 * @Description
 * @Author ericchan
 * @Date 2018/8/31 下午5:46
 **/
public class ExistObjectException extends  RuntimeException{

	/**
	 * 	状态码，一开始的代码没有使用内嵌状态码（该字段），所以为了防止出错，添加默认状态码
	 */
	private Integer code = ErrCode.ERROR.getCode();

    public ExistObjectException() {
        super();
    }

    public ExistObjectException(String message) {
        super(message);
    }

    public ExistObjectException(Integer code, String message) {
    	super(message);
    	this.code = code;
    }

    public ExistObjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExistObjectException(Throwable cause) {
        super(cause);
    }

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
    
    
}
