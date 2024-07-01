package cn.hamm.wecom.module.common.ip;

import cn.hamm.wecom.common.AbstractWeComRequest;
import cn.hamm.wecom.common.constant.WeComAlias;
import cn.hamm.wecom.common.WeComResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * <h1>CallbackIpRequest</h1>
 *
 * @author Hamm.cn
 * @see <a href="https://developer.work.weixin.qq.com/document/path/90239">获取企业微信回调IP段</a>
 */
@SuppressWarnings("unused")
public class CallbackIpRequest extends AbstractWeComRequest<CallbackIpRequest.Response, CallbackIpRequest> {
    @Override
    public String apiUrl() {
        return String.format("get_api_domain_ip?access_token=%s", getAccessToken());
    }

    public static class Response extends WeComResponse<Response> {
        @JsonProperty(WeComAlias.IP_LIST)
        private List<String> ipList;

        public List<String> getIpList() {
            return ipList;
        }

        public Response setIpList(List<String> ipList) {
            this.ipList = ipList;
            return this;
        }
    }
}
