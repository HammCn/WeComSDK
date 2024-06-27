package cn.hamm.wecom;

import cn.hamm.wecom.exception.WeComApiException;
import cn.hamm.wecom.exception.WeComException;
import cn.hamm.wecom.module.common.token.AccessTokenApi;
import cn.hamm.wecom.module.common.ip.DomainIpApi;

import java.util.List;

public class Test {

    public static void main(String... args) throws WeComException {
//        getAccessToken();
        final String accessToken = "eFfFWY2BOkJ_NUgtjR2uYndv6FlkDKXNfQUMUwhuOiuJzhsj_7G4EcnSpnMxDa4ZD5CbMwMKQC0unIpDB2bZN72pzOnF45D0OuN6tDWDjrSgOvfvEcJg6SAzg679vvbiHAyvjsL05kY6d6ezcZ2wbvAC3vO4NKQtdnc-3-6UwLE4WdYk3YTBfUN0nivcMA3gQKBbSkZ7RHC-CifBz9upsw";
        try {
            List<String> ipList = new DomainIpApi().setAccessToken(accessToken).request().getIpList();
        } catch (WeComApiException exception) {
            System.out.println(exception.getMessage());
            System.out.println(exception.getResponse());
            System.out.println(exception.getCode());
        }

    }

    private static String getAccessToken() throws WeComException {
        AccessTokenApi.Response response = new AccessTokenApi().setCorpId("wwe37b8a5da350cc40").setCorpSecret("uebS8PcO4AQ0DJQMFv_4LqWppnXoEBDVCTi7KTZXv3Y").request();
        return response.getAccessToken();
    }
}