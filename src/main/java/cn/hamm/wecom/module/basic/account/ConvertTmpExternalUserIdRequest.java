package cn.hamm.wecom.module.basic.account;

import cn.hamm.wecom.common.AbstractWeComRequest;
import cn.hamm.wecom.common.WeComResponse;
import cn.hamm.wecom.common.constant.WeComAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * <h1>ConvertTmpExternalUserIdRequest</h1>
 *
 * @author Hamm.cn
 * @apiNote 将应用获取的外部用户临时id <code>tmp_external_userid</code>，转换为 <code>external_userid</code>。
 * @see <a href="https://developer.work.weixin.qq.com/document/path/98729">tmp_external_userid的转换</a>
 */
@SuppressWarnings("unused")
public class ConvertTmpExternalUserIdRequest extends AbstractWeComRequest<ConvertTmpExternalUserIdRequest.Response, ConvertTmpExternalUserIdRequest> {

    /**
     * <h3>业务类型</h3>
     */
    @JsonProperty(WeComAlias.BUSINESS_TYPE)
    private BusinessType businessType;

    /**
     * <h3>用户类型</h3>
     */
    @JsonProperty(WeComAlias.USER_TYPE)
    private UserType userType;

    /**
     * <h3>外部用户临时id</h3>
     *
     * @apiNote 最多不超过100个
     */
    @JsonProperty(WeComAlias.TMP_EXTERNAL_USER_ID_LIST)
    private List<String> tmpExternalUserIdList;

    @Override
    public String apiUrl() {
        return String.format("idconvert/convert_tmp_external_userid?access_token=%s", getAccessToken());
    }

    public BusinessType getBusinessType() {
        return businessType;
    }

    public ConvertTmpExternalUserIdRequest setBusinessType(BusinessType businessType) {
        this.businessType = businessType;
        return this;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public List<String> getTmpExternalUserIdList() {
        return tmpExternalUserIdList;
    }

    public ConvertTmpExternalUserIdRequest setTmpExternalUserIdList(List<String> tmpExternalUserIdList) {
        this.tmpExternalUserIdList = tmpExternalUserIdList;
        return this;
    }

    public ConvertTmpExternalUserIdRequest addTmpExternalUserId(String tmpExternalUserId) {
        if (Objects.isNull(tmpExternalUserIdList)) {
            tmpExternalUserIdList = new ArrayList<>();
        }
        tmpExternalUserIdList.add(tmpExternalUserId);
        return this;
    }

    /**
     * <h3>业务类型</h3>
     */
    public enum BusinessType {
        /**
         * <h1>会议</h1>
         */
        MEETING(1),

        /**
         * <h3>收集表</h3>
         */
        COLLECTION_TABLE(2);

        private final int value;

        BusinessType(int value) {
            this.value = value;
        }

        @JsonValue
        public int getValue() {
            return value;
        }
    }

    /**
     * <h3>用户类型</h3>
     */
    public enum UserType {
        /**
         * <h3>客户</h3>
         */
        CUSTOMER(1),

        /**
         * <h3>企业互联</h3>
         */
        INTERNET_COMPANY(2),

        /**
         * <h3>上下游</h3>
         */
        UPSTREAM(3),

        /**
         * <h3>互联企业(圈子)</h3>
         */
        INTERNET_COMPANY_CIRCLE(4);

        private final int value;

        UserType(int value) {
            this.value = value;
        }

        @JsonValue
        public int getValue() {
            return value;
        }
    }

    public static class Response extends WeComResponse<Response> {
        /**
         * <h3>转换成功的结果列表</h3>
         */
        private List<Result> results;

        /**
         * <h3>无法转换的<code>tmp_external_userid</code></h3>
         *
         * @apiNote 可能非法或没有权限
         */
        @JsonProperty(WeComAlias.INVALID_TMP_EXTERNAL_USER_ID_LIST)
        private String invalidTmpExternalUserIdList;

        public List<Result> getResults() {
            return results;
        }

        public void setResults(List<Result> results) {
            this.results = results;
        }

        public static class Result {
            /**
             * <h3>输入的<code>tmp_external_userid</code></h3>
             */
            @JsonProperty(WeComAlias.TMP_EXTERNAL_USER_ID)
            private String tmpExternalUserid;

            /**
             * <h3>转换后的<code>userid</code></h3>
             *
             * @apiNote <code>user_type</code> 为 {@link UserType#CUSTOMER} 时返回
             */
            @JsonProperty(WeComAlias.EXTERNAL_USER_ID)
            private String externalUserid;

            /**
             * <h3><code>userid</code>对应的<code>corpid</code></h3>
             *
             * @apiNote <code>user_type</code> 为 {@link UserType#INTERNET_COMPANY},{@link UserType#UPSTREAM},{@link UserType#INTERNET_COMPANY_CIRCLE}, 时返回
             */
            @JsonProperty(WeComAlias.CORP_ID)
            private String corpId;

            /**
             * <h3>转换后的<code>userid</code></h3>
             *
             * @apiNote <code>user_type</code> 为 {@link UserType#INTERNET_COMPANY},{@link UserType#UPSTREAM},{@link UserType#INTERNET_COMPANY_CIRCLE}, 时返回
             */
            @JsonProperty(WeComAlias.USER_ID)
            private String userId;

            public String getTmpExternalUserid() {
                return tmpExternalUserid;
            }

            public void setTmpExternalUserid(String tmpExternalUserid) {
                this.tmpExternalUserid = tmpExternalUserid;
            }

            public String getExternalUserid() {
                return externalUserid;
            }

            public void setExternalUserid(String externalUserid) {
                this.externalUserid = externalUserid;
            }

            public String getCorpId() {
                return corpId;
            }

            public void setCorpId(String corpId) {
                this.corpId = corpId;
            }

            public String getUserId() {
                return userId;
            }

            public void setUserId(String userId) {
                this.userId = userId;
            }
        }
    }
}
