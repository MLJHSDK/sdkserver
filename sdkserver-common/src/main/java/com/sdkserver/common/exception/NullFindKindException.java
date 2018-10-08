package com.sdkserver.common.exception;

import com.sdkserver.common.result.ErrCode;

/**
 * @ClassName NullFindKindException
 * @Description
 * @Author ericchan
 * @Date 2018/8/31 下午5:46
 **/
public class NullFindKindException extends  RuntimeException{

	/**
	 * 	状态码，一开始的代码没有使用内嵌状态码（该字段），所以为了防止出错，添加默认状态码
	 */
	private Integer code = ErrCode.ERROR.getCode();

    public NullFindKindException() {
        super();
    }

    public NullFindKindException(String message) {
        super(message);
    }

    public NullFindKindException(Integer code, String message) {
    	super(message);
    	this.code = code;
    }

    public NullFindKindException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullFindKindException(Throwable cause) {
        super(cause);
    }

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
    
    
}
