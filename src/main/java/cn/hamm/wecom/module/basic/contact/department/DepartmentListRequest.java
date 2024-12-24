package cn.hamm.wecom.module.basic.contact.department;

import cn.hamm.wecom.common.AbstractWeComRequest;
import cn.hamm.wecom.common.WeComResponse;
import cn.hamm.wecom.module.basic.contact.department.vo.Department;

import java.util.List;

/**
 * <h1>获取部门列表</h1>
 *
 * @author Hamm.cn
 * @see <a href="https://developer.work.weixin.qq.com/document/path/90208">获取部门列表</a>
 */
public class DepartmentListRequest extends AbstractWeComRequest<DepartmentListRequest.Response, DepartmentListRequest> {

    @Override
    public String apiUrl() {
        return String.format("department/list?access_token=%s&id=%s", getAccessToken(), getId());
    }

    private Integer id = 1;

    public DepartmentListRequest setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public static class Response extends WeComResponse<DepartmentListRequest.Response> {
        List<Department> department;

        public void setDepartment(List<Department> department) {
            this.department = department;
        }

        public List<Department> getDepartment() {
            return department;
        }
    }
}
