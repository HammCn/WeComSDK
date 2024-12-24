package cn.hamm.wecom;

import cn.hamm.wecom.common.WeCom;
import cn.hamm.wecom.common.exception.WeComException;
import cn.hamm.wecom.module.basic.contact.department.DepartmentGetRequest;
import cn.hamm.wecom.module.common.token.AccessTokenRequest;

public class Test {

    public static void main(String... args) throws WeComException {
        WeCom.isDebug = true;
        final String accessToken = getAccessToken();
        DepartmentGetRequest request = new DepartmentGetRequest().setAccessToken(accessToken).setId(20);
        DepartmentGetRequest.Response response = request.request();
        System.out.println(response);
    }

    private static String getAccessToken() throws WeComException {
        AccessTokenRequest.Response response = new AccessTokenRequest().setCorpId("").setCorpSecret("").request();
        return response.getAccessToken();
    }
}
