package com.github.jamsa.rap.mapper;

import com.github.jamsa.rap.core.mapper.BaseMapper;
import com.github.jamsa.rap.model.DictType;
import java.util.List;

public interface DictTypeMapper extends BaseMapper<DictType, Integer> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RAP_DICT_TYPE
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    int deleteByPrimaryKey(Integer dictTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RAP_DICT_TYPE
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    int insert(DictType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RAP_DICT_TYPE
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    int insertSelective(DictType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RAP_DICT_TYPE
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    DictType selectByPrimaryKey(Integer dictTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RAP_DICT_TYPE
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    int updateByPrimaryKeySelective(DictType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RAP_DICT_TYPE
     *
     * @mbggenerated Thu Aug 25 14:35:40 CST 2016
     */
    int updateByPrimaryKey(DictType record);

    /** @mbggenerated */
    List<DictType> selectByCondition(DictType condition);
}