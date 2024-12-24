package cn.hamm.wecom.module.basic.contact.department;

import cn.hamm.wecom.common.AbstractWeComRequest;
import cn.hamm.wecom.common.WeComResponse;
import cn.hamm.wecom.module.basic.contact.department.vo.Department;

/**
 * <h1>获取单个部门详情</h1>
 *
 * @author Hamm.cn
 * @see <a href="https://developer.work.weixin.qq.com/document/path/96276">获取单个部门详情</a>
 */
@SuppressWarnings("unused")
public class DepartmentGetRequest extends AbstractWeComRequest<DepartmentGetRequest.Response, DepartmentGetRequest> {

    /**
     * <h3>部门id</h3>
     */
    private Integer id;

    @Override
    public String apiUrl() {
        return String.format("department/get?access_token=%s&id=%s", getAccessToken(), getId());
    }

    public Integer getId() {
        return id;
    }

    public DepartmentGetRequest setId(Integer id) {
        this.id = id;
        return this;
    }

    public static class Response extends WeComResponse<Response> {
        private Department department;

        public Department getDepartment() {
            return department;
        }

        public void setDepartment(Department department) {
            this.department = department;
        }
    }
}
