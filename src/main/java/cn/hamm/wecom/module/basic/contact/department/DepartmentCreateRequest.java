package cn.hamm.wecom.module.basic.contact.department;

import cn.hamm.wecom.common.AbstractWeComRequest;
import cn.hamm.wecom.common.WeComResponse;
import cn.hamm.wecom.common.constant.WeComAlias;
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

    /**
     * <h2>部门名称</h2>
     *
     * @apiNote 同一个层级的部门名称不能重复。长度限制为1~64个UTF-8字符，字符不能包括\:*?"<>｜
     */
    private String name;

    /**
     * <h2>英文名称</h2>
     *
     * @apiNote 同一个层级的部门名称不能重复。需要在管理后台开启多语言支持才能生效。长度限制为1~64个字符，字符不能包括\:*?"<>｜
     */
    @JsonProperty(WeComAlias.NAME_EN)
    private String nameEn;

    /**
     * <h2>父部门id</h2>
     */
    @JsonProperty(WeComAlias.PARENT_ID)
    private Integer parentId;

    /**
     * <h2>在父部门中的次序值</h2>
     *
     * @apiNote order值大的排序靠前。有效的值范围是[0, 2^32)
     */
    private Integer order;

    /**
     * <h2>部门id</h2>
     *
     * @apiNote 指定时必须大于1。若不填该参数，将自动生成id
     */
    private Integer id;

    @Override
    public String apiUrl() {
        return String.format("department/create?access_token=%s", getAccessToken());
    }

    @Override
    public WeComApiMethod apiMethod() {
        return WeComApiMethod.POST;
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

    public static class Response extends WeComResponse<Response> {
        /**
         * <h2>创建的部门id</h2>
         */
        private Integer id;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }
    }
}
