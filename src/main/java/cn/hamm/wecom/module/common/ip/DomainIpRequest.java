package cn.hamm.wecom.module.common.ip;

import cn.hamm.wecom.common.AbstractWeComRequest;
import cn.hamm.wecom.common.WeComResponse;
import cn.hamm.wecom.common.constant.WeComAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * <h1>DomainIpRequest</h1>
 *
 * @author Hamm.cn
 * @see <a href="https://developer.work.weixin.qq.com/document/path/92521">获取企业微信接口IP段</a>
 */
@SuppressWarnings("unused")
public class DomainIpRequest extends AbstractWeComRequest<DomainIpRequest.Response, DomainIpRequest> {
    @Override
    public String apiUrl() {
        return String.format("getcallbackip?access_token=%s", getAccessToken());
    }

    public static class Response extends WeComResponse<Response> {
        @JsonProperty(WeComAlias.IP_LIST)
        private List<String> ipList;

        public List<String> getIpList() {
            return ipList;
        }

        public void setIpList(List<String> ipList) {
            this.ipList = ipList;
        }
    }
}
