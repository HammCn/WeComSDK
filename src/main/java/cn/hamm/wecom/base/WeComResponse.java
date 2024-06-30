package cn.hamm.wecom.base;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <h1>WeComResponse</h1>
 *
 * @author Hamm.cn
 */
@SuppressWarnings("unchecked")
public class WeComResponse<T extends WeComResponse<T>> {
    /**
     * <h2>错误码</h2>
     */
    public static final String ERROR_CODE = "errcode";

    /**
     * <h2>错误信息</h2>
     */
    public static final String ERROR_MESSAGE = "errmsg";

    /**
     * <h2>错误代码</h2>
     */
    @JsonProperty(ERROR_CODE)
    private int errorCode;

    public int getErrorCode() {
        return errorCode;
    }

    public T setErrorCode(int errorCode) {
        this.errorCode = errorCode;
        return (T) this;
    }

    /**
     * <h2>错误信息</h2>
     */
    @JsonProperty(ERROR_MESSAGE)
    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public T setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return (T) this;
    }

    /**
     * <h2>是否成功</h2>
     *
     * @return boolean
     */
    public final boolean isSuccess() {
        return WeCom.SUCCESS_CODE == errorCode;
    }
}
