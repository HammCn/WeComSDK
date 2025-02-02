package cn.hamm.wecom.common.exception;

import cn.hamm.wecom.common.WeCom;

/**
 * <h1>WeComApiException</h1>
 *
 * @author Hamm.cn
 */
@SuppressWarnings("unused")
public class WeComApiException extends RuntimeException {
    /**
     * <h3>错误代码对应文档</h3>
     */
    private static final String DOCUMENT_URL = "https://developer.work.weixin.qq.com/document/path/90313#%E9%94%99%E8%AF%AF%E7%A0%81%EF%BC%9A";

    /**
     * <h3>错误代码</h3>
     */
    private final int code;

    /**
     * <h3>响应包体</h3>
     */
    private final String response;

    /**
     * <h3>WeComApiException</h3>
     *
     * @param code     错误代码
     * @param message  错误信息
     * @param response 响应包体
     */
    public WeComApiException(int code, String message, String response) {
        super(message);
        this.code = code;
        this.response = response;
        WeCom.debug("查看错误说明文档", DOCUMENT_URL + code, true);
    }

    public int getCode() {
        return code;
    }

    public String getResponse() {
        return response;
    }
}
