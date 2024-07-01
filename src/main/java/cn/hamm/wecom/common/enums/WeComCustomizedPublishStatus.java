package cn.hamm.wecom.common.enums;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * <h2>代开发发布状态</h2>
 *
 * @author Hamm.cn
 */
public enum WeComCustomizedPublishStatus{
    /**
     * <h2>待开发</h2>
     *
     * @apiNote 企业已授权，服务商未创建应用
     */
    PENDING(0),

    /**
     * <h2>开发中</h2>
     *
     * @apiNote 服务商已创建应用，未上线
     */
    DEVELOPING(1),

    /**
     * <h2>已上线</h2>
     *
     * @apiNote 服务商已上线应用且不存在未上线版本
     */
    ONLINE(2),

    /**
     * <h2>存在未上线版本</h2>
     *
     * @apiNote 服务商已上线应用但存在未上线版本
     */
    UNDER_REVIEW(3);

    final int value;

    WeComCustomizedPublishStatus(int value) {
        this.value = value;
    }
    @JsonValue
    public int getValue() {
        return value;
    }
}
