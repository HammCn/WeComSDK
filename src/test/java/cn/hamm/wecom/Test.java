package cn.hamm.wecom;

import cn.hamm.wecom.exception.WeComException;
import cn.hamm.wecom.module.basic.message.MessageSendRequest;
import cn.hamm.wecom.module.common.ip.CallbackIpRequest;
import cn.hamm.wecom.module.common.token.AccessTokenRequest;
import cn.hamm.wecom.module.common.ip.DomainIpRequest;

import java.util.List;

public class Test {

    public static void main(String... args) throws WeComException {
//        System.out.println(getAccessToken());
        final String accessToken = "K4pa4hQfJtN7NI9bsqvl54VFg8PmVZfiaftc1vUCtZGwoTn5kY0UJ7WMQjo9D-FFYTL8701XfK9c4j1gH6R8btrDBW8C9pJ6FB3hgCf6x1Toh-KKdbp7L48q5TvYKAma0fQNq4YGKFRO1JlIl51ZRA1eVxstkf5XLEe3_7MGoKBXug6Hkztqjnwffhwj4eYQ0z4CwYIxAO4gczP6n6AtgA";
        final String agentId = "1000003";


        MessageSendRequest.Response response = new MessageSendRequest().setAccessToken(accessToken).request();
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