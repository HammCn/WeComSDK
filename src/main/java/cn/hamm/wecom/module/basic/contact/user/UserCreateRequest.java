package cn.hamm.wecom.module.basic.contact.user;

import cn.hamm.wecom.base.AbstractWeComRequest;
import cn.hamm.wecom.base.WeComResponse;
import cn.hamm.wecom.base.enums.ApiMethod;

/**
 * <h1>UserCreateRequest</h1>
 *
 * @author Hamm.cn
 * @apiNote 仅通讯录同步助手或第三方通讯录应用可调用。注意，每个部门下的部门、成员总数不能超过3万个。建议保证创建department对应的部门和创建成员是串行化处理。
 * @see <a href="https://developer.work.weixin.qq.com/document/path/90195">创建成员</a>
 */
@SuppressWarnings("unused")
public class UserCreateRequest extends AbstractWeComRequest<UserCreateRequest.Response, UserCreateRequest> {
    @Override
    public String apiUrl() {
        return String.format("user/create?access_token=%s", getAccessToken());
    }

    @Override
    public ApiMethod apiMethod() {
        return ApiMethod.POST;
    }

    public static class Response extends WeComResponse<Response> {

    }
}
