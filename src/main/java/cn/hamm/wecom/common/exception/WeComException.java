package cn.hamm.wecom.common.exception;

/**
 * <h1>WeComException</h1>
 *
 * @author Hamm.cn
 */
public class WeComException extends Exception {
    /**
     * <h3>WeComException</h3>
     *
     * @param message 错误信息
     */
    public WeComException(String message) {
        super(message);
    }
}
