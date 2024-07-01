package cn.hamm.wecom.common;

/**
 * <h1>企业微信SDK</h1>
 *
 * @author Hamm.cn
 */
@SuppressWarnings("unused")
public class WeCom {
    /**
     * <h2>是否开启DEBUG模式</h2>
     */
    public static boolean isDebug = false;

    /**
     * <h2>调试输出错误信息</h2>
     *
     * @param title   标题
     * @param message 内容
     */
    public static void debug(String title, Object message) {
        debug(title, message, false);
    }

    /**
     * <h2>调试输出错误信息</h2>
     *
     * @param title   标题
     * @param message 内容
     * @param force   是否强制输出
     */
    public static void debug(String title, Object message, boolean force) {
        if (!isDebug && !force) {
            return;
        }
        System.out.println("\n" + title);
        System.out.println(message);
    }

}
