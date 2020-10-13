package com.seeyon.orgcenter.manage.role.entity;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table org_permission_data_relation
 *
 * @mbg.generated do_not_delete_during_merge Wed Oct 14 00:13:41 CST 2020
 */
public class OrgPermissionDataRelation {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_permission_data_relation.ID
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_permission_data_relation.APP_ID
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    private Long appId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_permission_data_relation.NAME
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_permission_data_relation.ORG_ID
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    private Long orgId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_permission_data_relation.IS_AVAILABLE_CHILD
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    private Integer isAvailableChild;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_permission_data_relation.ROLE_ID
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    private Long roleId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_permission_data_relation.ID
     *
     * @return the value of org_permission_data_relation.ID
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_permission_data_relation.ID
     *
     * @param id the value for org_permission_data_relation.ID
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_permission_data_relation.APP_ID
     *
     * @return the value of org_permission_data_relation.APP_ID
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    public Long getAppId() {
        return appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_permission_data_relation.APP_ID
     *
     * @param appId the value for org_permission_data_relation.APP_ID
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    public void setAppId(Long appId) {
        this.appId = appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_permission_data_relation.NAME
     *
     * @return the value of org_permission_data_relation.NAME
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_permission_data_relation.NAME
     *
     * @param name the value for org_permission_data_relation.NAME
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_permission_data_relation.ORG_ID
     *
     * @return the value of org_permission_data_relation.ORG_ID
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_permission_data_relation.ORG_ID
     *
     * @param orgId the value for org_permission_data_relation.ORG_ID
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_permission_data_relation.IS_AVAILABLE_CHILD
     *
     * @return the value of org_permission_data_relation.IS_AVAILABLE_CHILD
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    public Integer getIsAvailableChild() {
        return isAvailableChild;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_permission_data_relation.IS_AVAILABLE_CHILD
     *
     * @param isAvailableChild the value for org_permission_data_relation.IS_AVAILABLE_CHILD
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    public void setIsAvailableChild(Integer isAvailableChild) {
        this.isAvailableChild = isAvailableChild;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_permission_data_relation.ROLE_ID
     *
     * @return the value of org_permission_data_relation.ROLE_ID
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_permission_data_relation.ROLE_ID
     *
     * @param roleId the value for org_permission_data_relation.ROLE_ID
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
