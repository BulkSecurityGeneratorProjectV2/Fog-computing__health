package cn.ac.sec.dao;

import cn.ac.sec.entity.SysArticleType;
import cn.ac.sec.entity.SysArticleTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface SysArticleTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_article_type
     *
     * @mbggenerated
     */
    int countByExample(SysArticleTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_article_type
     *
     * @mbggenerated
     */
    int deleteByExample(SysArticleTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_article_type
     *
     * @mbggenerated
     */
    @Delete({
        "delete from sys_article_type",
        "where id_ = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_article_type
     *
     * @mbggenerated
     */
    @Insert({
        "insert into sys_article_type (id_, type_code, ",
        "type_name, create_by)",
        "values (#{id,jdbcType=INTEGER}, #{typeCode,jdbcType=VARCHAR}, ",
        "#{typeName,jdbcType=VARCHAR}, #{createBy,jdbcType=BIGINT})"
    })
    int insert(SysArticleType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_article_type
     *
     * @mbggenerated
     */
    int insertSelective(SysArticleType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_article_type
     *
     * @mbggenerated
     */
    List<SysArticleType> selectByExample(SysArticleTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_article_type
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id_, type_code, type_name, create_by",
        "from sys_article_type",
        "where id_ = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    SysArticleType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_article_type
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SysArticleType record, @Param("example") SysArticleTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_article_type
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SysArticleType record, @Param("example") SysArticleTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_article_type
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SysArticleType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_article_type
     *
     * @mbggenerated
     */
    @Update({
        "update sys_article_type",
        "set type_code = #{typeCode,jdbcType=VARCHAR},",
          "type_name = #{typeName,jdbcType=VARCHAR},",
          "create_by = #{createBy,jdbcType=BIGINT}",
        "where id_ = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SysArticleType record);
}