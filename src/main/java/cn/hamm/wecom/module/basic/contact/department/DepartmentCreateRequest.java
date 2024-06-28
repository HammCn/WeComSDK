package cn.hamm.wecom.module.basic.contact.department;

import cn.hamm.wecom.base.AbstractWeComRequest;
import cn.hamm.wecom.base.WeComResponse;
import cn.hamm.wecom.base.enums.ApiMethod;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <h1>DepartmentCreateRequest</h1>
 *
 * @author Hamm.cn
 * @see <a href="https://developer.work.weixin.qq.com/document/path/90205">创建部门</a>
 */
public class DepartmentCreateRequest extends AbstractWeComRequest<DepartmentCreateRequest.Response, DepartmentCreateRequest> {
    @Override
    public String apiUrl() {
        return String.format("department/create?access_token=%s", getAccessToken());
    }

    @Override
    public ApiMethod apiMethod() {
        return ApiMethod.POST;
    }

    private String name;

    public String getName() {
        return name;
    }

    public DepartmentCreateRequest setName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("name_en")
    private String nameEn;

    public String getNameEn() {
        return nameEn;
    }

    public DepartmentCreateRequest setNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    @JsonProperty("parentid")
    private Integer parentId;

    public Integer getParentId() {
        return parentId;
    }

    public DepartmentCreateRequest setParentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }

    private Integer order;

    public Integer getOrder() {
        return order;
    }

    public DepartmentCreateRequest setOrder(Integer order) {
        this.order = order;
        return this;
    }

    private Integer id;

    public Integer getId() {
        return id;
    }

    public DepartmentCreateRequest setId(Integer id) {
        this.id = id;
        return this;
    }

    public static class Response extends WeComResponse<Response> {
        private Integer id;
    }
}
