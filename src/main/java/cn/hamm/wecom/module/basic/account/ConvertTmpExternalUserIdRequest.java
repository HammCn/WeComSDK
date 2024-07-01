package cn.hamm.wecom.module.basic.account;

import cn.hamm.wecom.common.AbstractWeComRequest;
import cn.hamm.wecom.common.WeComResponse;
import cn.hamm.wecom.common.constant.WeComAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * <h1>ConvertTmpExternalUserIdRequest</h1>
 *
 * @author Hamm.cn
 * @see <a href="https://developer.work.weixin.qq.com/document/path/98729">tmp_external_userid的转换</a>
 */
@SuppressWarnings("unused")
public class ConvertTmpExternalUserIdRequest extends AbstractWeComRequest<ConvertTmpExternalUserIdRequest.Response, ConvertTmpExternalUserIdRequest> {

    @Override
    public String apiUrl() {
        return String.format("idconvert/convert_tmp_external_userid?access_token=%s", getAccessToken());
    }

    @JsonProperty(WeComAlias.BUSINESS_TYPE)
    private Integer businessType;

    @JsonProperty(WeComAlias.USER_TYPE)
    private Integer userType;

    @JsonProperty(WeComAlias.TMP_EXTERNAL_USER_ID_LIST)
    private List<String> tmpExternalUserIdList;

    public static class Response extends WeComResponse<Response> {
        private List<Result> results;

        @JsonProperty(WeComAlias.INVALID_TMP_EXTERNAL_USER_ID_LIST)
        private String invalidTmpExternalUserIdList;

        public static class Result {
            @JsonProperty(WeComAlias.TMP_EXTERNAL_USER_ID)
            private String tmpExternalUserid;

            @JsonProperty(WeComAlias.EXTERNAL_USER_ID)
            private String externalUserid;

            @JsonProperty(WeComAlias.CORP_ID)
            private String corpId;

            @JsonProperty(WeComAlias.USER_ID)
            private String userId;

            public String getTmpExternalUserid() {
                return tmpExternalUserid;
            }

            public Result setTmpExternalUserid(String tmpExternalUserid) {
                this.tmpExternalUserid = tmpExternalUserid;
                return this;
            }

            public String getExternalUserid() {
                return externalUserid;
            }

            public Result setExternalUserid(String externalUserid) {
                this.externalUserid = externalUserid;
                return this;
            }

            public String getCorpId() {
                return corpId;
            }

            public Result setCorpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            public String getUserId() {
                return userId;
            }

            public Result setUserId(String userId) {
                this.userId = userId;
                return this;
            }
        }

        public List<Result> getResults() {
            return results;
        }

        public Response setResults(List<Result> results) {
            this.results = results;
            return this;
        }
    }

    public enum BusinessType {
        /**
         * <h1>会议</h1>
         */
        MEETING(1),

        /**
         * <h2>收集表</h2>
         */
        COLLECTION_TABLE(2);

        private final int value;

        BusinessType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public enum UserType {
        // 1. 客户 2. 企业互联 3. 上下游 4. 互联企业(圈子)

        /**
         * <h2>客户</h2>
         */
        CUSTOMER(1),

        /**
         * <h2>企业互联</h2>
         */
        INTERNET_COMPANY(2),

        /**
         * <h2>上下游</h2>
         */
        UPSTREAM(3),

        /**
         * <h2>互联企业(圈子)</h2>
         */
        INTERNET_COMPANY_CIRCLE(4);

        private final int value;

        UserType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }


    public Integer getBusinessType() {
        return businessType;
    }

    public ConvertTmpExternalUserIdRequest setBusinessType(Integer businessType) {
        this.businessType = businessType;
        return this;
    }

    public ConvertTmpExternalUserIdRequest setBusinessType(BusinessType businessType) {
        return setBusinessType(businessType.getValue());
    }

    public Integer getUserType() {
        return userType;
    }

    public ConvertTmpExternalUserIdRequest setUserType(Integer userType) {
        this.userType = userType;
        return this;
    }

    public ConvertTmpExternalUserIdRequest setUserType(UserType userType) {
        return setUserType(userType.getValue());
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
}
