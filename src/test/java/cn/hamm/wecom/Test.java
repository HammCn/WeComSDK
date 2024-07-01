package cn.hamm.wecom;

import cn.hamm.wecom.common.WeCom;
import cn.hamm.wecom.common.exception.WeComException;
import cn.hamm.wecom.module.basic.contact.department.DepartmentCreateRequest;
import cn.hamm.wecom.module.basic.message.MessageSendRequest;
import cn.hamm.wecom.module.common.ip.CallbackIpRequest;
import cn.hamm.wecom.module.common.token.AccessTokenRequest;
import cn.hamm.wecom.module.common.ip.DomainIpRequest;

import java.util.List;

public class Test {

    public static void main(String... args) throws WeComException {
        WeCom.isDebug = true;
//        System.out.println(getAccessToken());
        final String accessToken = "6_jS74pUah708xe5Wso9dLDjeu8aFAyWXcE0LMDb-BT6a3hrhj315geoB43UttxKcBa_n8-ES0oIcIp9mekPFSJxWAP3lYkkhPo7aT7TcTgtKDxLqKu3Z4AOxKKKPKBHc2_2Z0q8CN-K36RP_MDCrbH3CEuOkV3_FixPuDmPP15c_-KEak09KBVD3wgy98_FTTDikFtdLL7CnDAfN6mIig";
        final String agentId = "1000003";


        DepartmentCreateRequest.Response response = new DepartmentCreateRequest().setAccessToken(accessToken).setName("测试").setParentId(0).request();
        System.out.println(response);

    }

    private static List<String> getDomainIp(String accessToken) throws WeComException {
        return new DomainIpRequest().setAccessToken(accessToken).request().getIpList();
    }

    private static List<String> getCallbackIp(String accessToken) throws WeComException {
        return new CallbackIpRequest().setAccessToken(accessToken).request().getIpList();
    }

    private static String getAccessToken() throws WeComException {
        AccessTokenRequest.Response response = new AccessTokenRequest().setCorpId("wwe37b8a5da350cc40").setCorpSecret("uebS8PcO4AQ0DJQMFv_4LqWppnXoEBDVCTi7KTZXv3Y").request();
        return response.getAccessToken();
    }
}