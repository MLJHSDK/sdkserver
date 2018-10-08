package com.sdkserver.common.exception;

import com.sdkserver.common.result.ErrCode;

/**
 * @ClassName NullObjectException
 * @Description
 * @Author ericchan
 * @Date 2018/8/31 下午5:46
 **/
public class NullObjectException extends  RuntimeException{

	/**
	 * 	状态码，一开始的代码没有使用内嵌状态码（该字段），所以为了防止出错，添加默认状态码
	 */
	private Integer code = ErrCode.ERROR.getCode();

    public NullObjectException() {
        super();
    }

    public NullObjectException(String message) {
        super(message);
    }

    public NullObjectException(Integer code, String message) {
    	super(message);
    	this.code = code;
    }

    public NullObjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullObjectException(Throwable cause) {
        super(cause);
    }

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
    
    
}
