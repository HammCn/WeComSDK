package cn.hamm.wecom.base;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <h1>WeComResponse</h1>
 *
 * @author Hamm.cn
 */
@SuppressWarnings("unchecked")
public class WeComResponse<T extends WeComResponse<T>> {
    @JsonProperty("errcode")
    private int errorCode;

    public int getErrorCode() {
        return errorCode;
    }

    public T setErrorCode(int errorCode) {
        this.errorCode = errorCode;
        return (T) this;
    }

    @JsonProperty("errmsg")
    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public T setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return (T) this;
    }

    public final boolean isSuccess() {
        return WeCom.SUCCESS_CODE == errorCode;
    }
}
