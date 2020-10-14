package com.seeyon.orgcenter.manage.account.entity;

import io.swagger.annotations.ApiModel;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table org_app_account_role_relation
 *
 * @mbg.generated do_not_delete_during_merge Wed Oct 14 00:13:41 CST 2020
 */
@ApiModel("账号角色关系")
public class OrgAppAccountRoleRelation {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_app_account_role_relation.ID
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_app_account_role_relation.ACCOUNT_ID
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    private Long accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_app_account_role_relation.ROLE_ID
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    private Long roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_app_account_role_relation.DOMAIN
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    private String domain;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_app_account_role_relation.APP_ID
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    private Long appId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_app_account_role_relation.ID
     *
     * @return the value of org_app_account_role_relation.ID
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_app_account_role_relation.ID
     *
     * @param id the value for org_app_account_role_relation.ID
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_app_account_role_relation.ACCOUNT_ID
     *
     * @return the value of org_app_account_role_relation.ACCOUNT_ID
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_app_account_role_relation.ACCOUNT_ID
     *
     * @param accountId the value for org_app_account_role_relation.ACCOUNT_ID
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_app_account_role_relation.ROLE_ID
     *
     * @return the value of org_app_account_role_relation.ROLE_ID
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_app_account_role_relation.ROLE_ID
     *
     * @param roleId the value for org_app_account_role_relation.ROLE_ID
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_app_account_role_relation.DOMAIN
     *
     * @return the value of org_app_account_role_relation.DOMAIN
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    public String getDomain() {
        return domain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_app_account_role_relation.DOMAIN
     *
     * @param domain the value for org_app_account_role_relation.DOMAIN
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_app_account_role_relation.APP_ID
     *
     * @return the value of org_app_account_role_relation.APP_ID
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    public Long getAppId() {
        return appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_app_account_role_relation.APP_ID
     *
     * @param appId the value for org_app_account_role_relation.APP_ID
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    public void setAppId(Long appId) {
        this.appId = appId;
    }
}
