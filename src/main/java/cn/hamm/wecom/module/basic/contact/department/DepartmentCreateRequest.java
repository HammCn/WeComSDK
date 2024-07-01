package cn.hamm.wecom.module.basic.contact.department;

import cn.hamm.wecom.common.AbstractWeComRequest;
import cn.hamm.wecom.common.constant.WeComAlias;
import cn.hamm.wecom.common.WeComResponse;
import cn.hamm.wecom.common.enums.WeComApiMethod;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <h1>DepartmentCreateRequest</h1>
 *
 * @author Hamm.cn
 * @see <a href="https://developer.work.weixin.qq.com/document/path/90205">创建部门</a>
 */
@SuppressWarnings("unused")
public class DepartmentCreateRequest extends AbstractWeComRequest<DepartmentCreateRequest.Response, DepartmentCreateRequest> {

    @Override
    public String apiUrl() {
        return String.format("department/create?access_token=%s", getAccessToken());
    }

    @Override
    public WeComApiMethod apiMethod() {
        return WeComApiMethod.POST;
    }

    private String name;

    @JsonProperty(WeComAlias.NAME_EN)
    private String nameEn;

    @JsonProperty(WeComAlias.PARENT_ID)
    private Integer parentId;

    private Integer order;

    private Integer id;

    public static class Response extends WeComResponse<Response> {
        private Integer id;

        public Integer getId() {
            return id;
        }

        public Response setId(Integer id) {
            this.id = id;
            return this;
        }
    }

    public String getName() {
        return name;
    }

    public DepartmentCreateRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getNameEn() {
        return nameEn;
    }

    public DepartmentCreateRequest setNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    public Integer getParentId() {
        return parentId;
    }

    public DepartmentCreateRequest setParentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }

    public Integer getOrder() {
        return order;
    }

    public DepartmentCreateRequest setOrder(Integer order) {
        this.order = order;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public DepartmentCreateRequest setId(Integer id) {
        this.id = id;
        return this;
    }
}
