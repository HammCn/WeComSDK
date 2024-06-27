package cn.hamm.wecom.exception;

/**
 * <h1>WeComApiException</h1>
 *
 * @author Hamm.cn
 */
public class WeComApiException extends RuntimeException {
    private final int code;

    public int getCode() {
        return code;
    }

    private final String response;

    public String getResponse() {
        return response;
    }

    public WeComApiException(int code, String message, String response) {
        super(message);
        this.code = code;
        this.response = response;
    }
}
