package cn.hamm.wecom.common.enums;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * <h3>代开发发布状态</h3>
 *
 * @author Hamm.cn
 */
public enum WeComCustomizedPublishStatus {
    /**
     * <h3>待开发</h3>
     *
     * @apiNote 企业已授权，服务商未创建应用
     */
    PENDING(0),

    /**
     * <h3>开发中</h3>
     *
     * @apiNote 服务商已创建应用，未上线
     */
    DEVELOPING(1),

    /**
     * <h3>已上线</h3>
     *
     * @apiNote 服务商已上线应用且不存在未上线版本
     */
    ONLINE(2),

    /**
     * <h3>存在未上线版本</h3>
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
