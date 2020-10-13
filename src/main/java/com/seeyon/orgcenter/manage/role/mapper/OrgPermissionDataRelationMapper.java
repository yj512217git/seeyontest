package com.seeyon.orgcenter.manage.role.mapper;

import com.seeyon.orgcenter.manage.role.entity.OrgPermissionDataRelation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrgPermissionDataRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_permission_data_relation
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_permission_data_relation
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    int insert(OrgPermissionDataRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_permission_data_relation
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    int insertSelective(OrgPermissionDataRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_permission_data_relation
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    OrgPermissionDataRelation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_permission_data_relation
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    int updateByPrimaryKeySelective(OrgPermissionDataRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_permission_data_relation
     *
     * @mbg.generated Wed Oct 14 00:13:41 CST 2020
     */
    int updateByPrimaryKey(OrgPermissionDataRelation record);
}
