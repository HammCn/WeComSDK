package cn.hamm.wecom.common;

import cn.hamm.wecom.common.constant.WeComAlias;
import cn.hamm.wecom.common.constant.WeComConstant;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <h1>WeComResponse</h1>
 *
 * @author Hamm.cn
 */
@SuppressWarnings({"unchecked", "unused"})
public class WeComResponse<T extends WeComResponse<T>> {

    /**
     * <h2>错误代码</h2>
     */
    @JsonProperty(WeComAlias.ERROR_CODE)
    private Integer errorCode;

    /**
     * <h2>错误信息</h2>
     */
    @JsonProperty(WeComAlias.ERROR_MESSAGE)
    private String errorMessage;

    /**
     * <h2>是否成功</h2>
     *
     * @return boolean
     */
    @JsonIgnore
    public final boolean isSuccess() {
        return WeComConstant.SUCCESS_CODE == errorCode;
    }


    public Integer getErrorCode() {
        return errorCode;
    }

    public T setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return (T) this;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public T setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return (T) this;
    }
}
