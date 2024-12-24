package cn.hamm.wecom.module.basic.app;

import cn.hamm.wecom.common.AbstractWeComRequest;
import cn.hamm.wecom.common.WeComResponse;
import cn.hamm.wecom.common.constant.WeComAlias;
import cn.hamm.wecom.common.enums.WeComApiMethod;
import cn.hamm.wecom.common.enums.WeComCustomizedPublishStatus;
import cn.hamm.wecom.common.util.json.BooleanToZeroOne;
import cn.hamm.wecom.common.util.json.ZeroOneToBoolean;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;

/**
 * <h1>GetAppRequest</h1>
 *
 * @author Hamm.cn
 * @apiNote 企业仅可获取当前凭证对应的应用；第三方仅可获取被授权的应用。
 * @see <a href="https://developer.work.weixin.qq.com/document/path/90227#%E8%8E%B7%E5%8F%96%E6%8C%87%E5%AE%9A%E7%9A%84%E5%BA%94%E7%94%A8%E8%AF%A6%E6%83%85">获取指定的应用详情</a>
 */
public class GetAppRequest extends AbstractWeComRequest<GetAppRequest.Response, GetAppRequest> {
    /**
     * <h3>应用id</h3>
     */
    @JsonProperty(WeComAlias.AGENTID)
    private String agentId;

    @Override
    public String apiUrl() {
        return String.format("agent/get?access_token=%s&agentid=%s", getAccessToken(), getAgentId());
    }

    @Override
    public WeComApiMethod apiMethod() {
        return WeComApiMethod.POST;
    }

    public String getAgentId() {
        return agentId;
    }

    public GetAppRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    public static class Response extends WeComResponse<Response> {
        /**
         * <h3>企业应用id</h3>
         */
        @JsonProperty(WeComAlias.AGENTID)
        private Integer agentId;

        /**
         * <h3>企业应用名称</h3>
         */
        private String name;

        /**
         * <h3>企业应用方形头像</h3>
         */
        @JsonProperty(WeComAlias.SQUARE_LOGO_URL)
        private String squareLogoUrl;

        /**
         * <h3>企业应用详情</h3>
         */
        private String description;

        /**
         * <h3>应用可见范围（人员）</h3>
         */
        @JsonProperty(WeComAlias.ALLOW_USERINFO)
        private AllowUserInfo allowUserinfoList;

        /**
         * <h3>应用可见范围（部门）</h3>
         */
        @JsonProperty(WeComAlias.ALLOW_PARTY)
        private AllowParty allowParty;

        /**
         * <h3>应用可见范围（标签）</h3>
         */
        @JsonProperty(WeComAlias.ALLOW_TAG)
        private AllowTag allowTag;

        /**
         * <h3>应用是否被停用</h3>
         */
        @JsonSerialize(using = BooleanToZeroOne.class)
        @JsonDeserialize(using = ZeroOneToBoolean.class)
        private Boolean close;

        /**
         * <h3>应用可信域名</h3>
         */
        @JsonProperty(WeComAlias.REDIRECT_DOMAIN)
        private String redirectDomain;

        /**
         * <h3>是否打开地理位置上报</h3>
         */
        @JsonProperty(WeComAlias.REPORT_LOCATION_FLAG)
        @JsonSerialize(using = BooleanToZeroOne.class)
        @JsonDeserialize(using = ZeroOneToBoolean.class)
        private Boolean reportLocationFlag;

        /**
         * <h3>是否上报用户进入应用事件</h3>
         */
        @JsonSerialize(using = BooleanToZeroOne.class)
        @JsonDeserialize(using = ZeroOneToBoolean.class)
        @JsonProperty(WeComAlias.IS_REPORT_ENTER)
        private Boolean isReportEnter;

        /**
         * <h3>应用主页url</h3>
         */
        @JsonProperty(WeComAlias.HOME_URL)
        private String homeUrl;

        /**
         * <h3>代开发自建应用返回该字段</h3>
         *
         * @see WeComCustomizedPublishStatus
         */
        @JsonProperty(WeComAlias.CUSTOMIZED_PUBLISH_STATUS)
        private WeComCustomizedPublishStatus customizedPublishStatus;

        public Integer getAgentId() {
            return agentId;
        }

        public void setAgentId(Integer agentId) {
            this.agentId = agentId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSquareLogoUrl() {
            return squareLogoUrl;
        }

        public void setSquareLogoUrl(String squareLogoUrl) {
            this.squareLogoUrl = squareLogoUrl;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public AllowUserInfo getAllowUserinfoList() {
            return allowUserinfoList;
        }

        public void setAllowUserinfoList(AllowUserInfo allowUserinfoList) {
            this.allowUserinfoList = allowUserinfoList;
        }

        public AllowParty getAllowParty() {
            return allowParty;
        }

        public void setAllowParty(AllowParty allowParty) {
            this.allowParty = allowParty;
        }

        public AllowTag getAllowTag() {
            return allowTag;
        }

        public void setAllowTag(AllowTag allowTag) {
            this.allowTag = allowTag;
        }

        public Boolean getClose() {
            return close;
        }

        public void setClose(Boolean close) {
            this.close = close;
        }

        public String getRedirectDomain() {
            return redirectDomain;
        }

        public void setRedirectDomain(String redirectDomain) {
            this.redirectDomain = redirectDomain;
        }

        public Boolean getReportLocationFlag() {
            return reportLocationFlag;
        }

        public void setReportLocationFlag(Boolean reportLocationFlag) {
            this.reportLocationFlag = reportLocationFlag;
        }

        public Boolean getReportEnter() {
            return isReportEnter;
        }

        public void setReportEnter(Boolean reportEnter) {
            isReportEnter = reportEnter;
        }

        public String getHomeUrl() {
            return homeUrl;
        }

        public void setHomeUrl(String homeUrl) {
            this.homeUrl = homeUrl;
        }

        public WeComCustomizedPublishStatus getCustomizedPublishStatus() {
            return customizedPublishStatus;
        }

        public void setCustomizedPublishStatus(WeComCustomizedPublishStatus customizedPublishStatus) {
            this.customizedPublishStatus = customizedPublishStatus;
        }

        public static class AllowUserInfo {
            /**
             * <h3>成员id列表</h3>
             */
            @JsonProperty(WeComAlias.USER)
            private List<User> userList;

            public List<User> getUserList() {
                return userList;
            }

            public void setUserList(List<User> userList) {
                this.userList = userList;
            }

            public static class User {
                /**
                 * <h3>成员id</h3>
                 */
                @JsonProperty(WeComAlias.USER_ID)
                private String userId;

                public String getUserId() {
                    return userId;
                }

                public void setUserId(String userId) {
                    this.userId = userId;
                }
            }
        }

        public static class AllowParty {
            /**
             * <h3>部门id列表</h3>
             */
            @JsonProperty(WeComAlias.PARTY_ID)
            private List<Integer> partyIdList;

            public List<Integer> getPartyIdList() {
                return partyIdList;
            }

            public void setPartyIdList(List<Integer> partyIdList) {
                this.partyIdList = partyIdList;
            }
        }

        public static class AllowTag {
            /**
             * <h3>标签id列表</h3>
             */
            @JsonProperty(WeComAlias.TAG_ID)
            private List<Integer> tagIdList;

            public List<Integer> getTagIdList() {
                return tagIdList;
            }

            public void setTagIdList(List<Integer> tagIdList) {
                this.tagIdList = tagIdList;
            }
        }
    }
}
