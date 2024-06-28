package cn.hamm.wecom;

import cn.hamm.wecom.exception.WeComException;
import cn.hamm.wecom.module.basic.app.GetAppRequest;
import cn.hamm.wecom.module.common.ip.CallbackIpRequest;
import cn.hamm.wecom.module.common.token.AccessTokenRequest;
import cn.hamm.wecom.module.common.ip.DomainIpRequest;

import java.util.List;

public class Test {

    public static void main(String... args) throws WeComException {
//        System.out.println(getAccessToken());
        final String accessToken = "nY1susZyQ2DwhyZHllMXLhPZcu8M4-I12UeoZFwDzvFUaXZNthgClem8VF0I8XDjmq2UUl9FF2866fi1x2TSmmYRPkzlUih4zxnSCRpZicObi1Om2r4SFzIyHScBiQErJxeCMoHRLJfUVJpx7Gt2ERnWCfjhrjmdsO13muAm0YdzUKBx2jWmL6iPBkwhBB6wd48f-xfCttbfQZtb1cOTHg";


        GetAppRequest.Response response = new GetAppRequest().setAccessToken(accessToken).setAgentId("ww6e2676bed57406d2").request();
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