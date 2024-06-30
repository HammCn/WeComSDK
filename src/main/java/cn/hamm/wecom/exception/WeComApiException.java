package cn.hamm.wecom.exception;

import cn.hamm.wecom.base.WeCom;

/**
 * <h1>WeComApiException</h1>
 *
 * @author Hamm.cn
 */
@SuppressWarnings("unused")
public class WeComApiException extends RuntimeException {
    /**
     * <h2>错误代码对应文档</h2>
     */
    private static final String DOCUMENT_URL = "https://developer.work.weixin.qq.com/document/path/90313#%E9%94%99%E8%AF%AF%E7%A0%81%EF%BC%9A";

    /**
     * <h2>错误代码</h2>
     */
    private final int code;

    public int getCode() {
        return code;
    }

    /**
     * <h2>响应包体</h2>
     */
    private final String response;

    public String getResponse() {
        return response;
    }

    /**
     * <h2>WeComApiException</h2>
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
}
