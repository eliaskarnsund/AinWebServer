package gov.polisen.orm.maps;

import gov.polisen.orm.clients.PermissionsOnDeploymentSqlProvider;
import gov.polisen.orm.examples.PermissionsOnDeploymentExample;
import gov.polisen.orm.models.PermissionsOnDeployment;
import gov.polisen.orm.models.PermissionsOnDeploymentKey;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface PermissionsOnDeploymentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionsondeployments
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    @SelectProvider(type=PermissionsOnDeploymentSqlProvider.class, method="countByExample")
    int countByExample(PermissionsOnDeploymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionsondeployments
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    @DeleteProvider(type=PermissionsOnDeploymentSqlProvider.class, method="deleteByExample")
    int deleteByExample(PermissionsOnDeploymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionsondeployments
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    @Delete({
        "delete from permissionsondeployments",
        "where deploymentid = #{deploymentid,jdbcType=INTEGER}",
          "and userid = #{userid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(PermissionsOnDeploymentKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionsondeployments
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    @Insert({
        "insert into permissionsondeployments (deploymentid, userid, ",
        "read, adddata, modify, ",
        "changepermissions)",
        "values (#{deploymentid,jdbcType=INTEGER}, #{userid,jdbcType=INTEGER}, ",
        "#{read,jdbcType=BIT}, #{adddata,jdbcType=BIT}, #{modify,jdbcType=BIT}, ",
        "#{changepermissions,jdbcType=BIT})"
    })
    int insert(PermissionsOnDeployment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionsondeployments
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    @InsertProvider(type=PermissionsOnDeploymentSqlProvider.class, method="insertSelective")
    int insertSelective(PermissionsOnDeployment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionsondeployments
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    @SelectProvider(type=PermissionsOnDeploymentSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="deploymentid", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="userid", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="read", javaType=Boolean.class, jdbcType=JdbcType.BIT),
        @Arg(column="adddata", javaType=Boolean.class, jdbcType=JdbcType.BIT),
        @Arg(column="modify", javaType=Boolean.class, jdbcType=JdbcType.BIT),
        @Arg(column="changepermissions", javaType=Boolean.class, jdbcType=JdbcType.BIT)
    })
    List<PermissionsOnDeployment> selectByExample(PermissionsOnDeploymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionsondeployments
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    @Select({
        "select",
        "deploymentid, userid, read, adddata, modify, changepermissions",
        "from permissionsondeployments",
        "where deploymentid = #{deploymentid,jdbcType=INTEGER}",
          "and userid = #{userid,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="deploymentid", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="userid", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="read", javaType=Boolean.class, jdbcType=JdbcType.BIT),
        @Arg(column="adddata", javaType=Boolean.class, jdbcType=JdbcType.BIT),
        @Arg(column="modify", javaType=Boolean.class, jdbcType=JdbcType.BIT),
        @Arg(column="changepermissions", javaType=Boolean.class, jdbcType=JdbcType.BIT)
    })
    PermissionsOnDeployment selectByPrimaryKey(PermissionsOnDeploymentKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionsondeployments
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    @UpdateProvider(type=PermissionsOnDeploymentSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PermissionsOnDeployment record, @Param("example") PermissionsOnDeploymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionsondeployments
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    @UpdateProvider(type=PermissionsOnDeploymentSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") PermissionsOnDeployment record, @Param("example") PermissionsOnDeploymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionsondeployments
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    @UpdateProvider(type=PermissionsOnDeploymentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PermissionsOnDeployment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionsondeployments
     *
     * @mbggenerated Sat Apr 05 19:09:46 CEST 2014
     */
    @Update({
        "update permissionsondeployments",
        "set read = #{read,jdbcType=BIT},",
          "adddata = #{adddata,jdbcType=BIT},",
          "modify = #{modify,jdbcType=BIT},",
          "changepermissions = #{changepermissions,jdbcType=BIT}",
        "where deploymentid = #{deploymentid,jdbcType=INTEGER}",
          "and userid = #{userid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PermissionsOnDeployment record);
}