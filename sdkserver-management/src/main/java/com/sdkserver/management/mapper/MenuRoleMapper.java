package com.sdkserver.management.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * Created by management on 2018/1/2.
 */
public interface MenuRoleMapper {
    int deleteMenuByRid(@Param("rid") Long rid);

    int addMenu(@Param("rid") Long rid, @Param("mids") Long[] mids);
}
