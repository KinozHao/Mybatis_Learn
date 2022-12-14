package top.kinoz.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.kinoz.pojo.dept;
import top.kinoz.pojo.deptExample;

public interface deptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Thu Dec 29 20:31:39 CST 2022
     */
    int countByExample(deptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Thu Dec 29 20:31:39 CST 2022
     */
    int deleteByExample(deptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Thu Dec 29 20:31:39 CST 2022
     */
    int deleteByPrimaryKey(Integer dId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Thu Dec 29 20:31:39 CST 2022
     */
    int insert(dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Thu Dec 29 20:31:39 CST 2022
     */
    int insertSelective(dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Thu Dec 29 20:31:39 CST 2022
     */
    List<dept> selectByExample(deptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Thu Dec 29 20:31:39 CST 2022
     */
    dept selectByPrimaryKey(Integer dId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Thu Dec 29 20:31:39 CST 2022
     */
    int updateByExampleSelective(@Param("record") dept record, @Param("example") deptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Thu Dec 29 20:31:39 CST 2022
     */
    int updateByExample(@Param("record") dept record, @Param("example") deptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Thu Dec 29 20:31:39 CST 2022
     */
    int updateByPrimaryKeySelective(dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbggenerated Thu Dec 29 20:31:39 CST 2022
     */
    int updateByPrimaryKey(dept record);
}