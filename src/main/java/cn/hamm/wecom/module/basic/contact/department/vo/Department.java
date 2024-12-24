package cn.hamm.wecom.module.basic.contact.department.vo;

import cn.hamm.wecom.common.constant.WeComAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * <h1>部门</h1>
 *
 * @author Hamm.cn
 */
public class Department {
    /**
     * <h3>部门id</h3>
     */
    private Integer id;

    /**
     * <h3>部门名称</h3>
     */
    private String name;

    /**
     * <h3>部门英文名称</h3>
     */
    @JsonProperty(WeComAlias.NAME_EN)
    private String nameEn;

    /**
     * <h3>部门负责人</h3>
     */
    @JsonProperty(WeComAlias.DEPARTMENT_LEADER)
    private List<String> departmentLeaders;

    /**
     * <h3>父部门ID</h3>
     */
    @JsonProperty(WeComAlias.PARENT_ID)
    private Integer parentId;

    /**
     * <h3>排序</h3>
     */
    private Integer order;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public List<String> getDepartmentLeaders() {
        return departmentLeaders;
    }

    public void setDepartmentLeaders(List<String> departmentLeaders) {
        this.departmentLeaders = departmentLeaders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }
}