package com.sdkserver.management.mapper;

import com.sdkserver.management.bean.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by management on 2018/1/1.
 */
public interface RoleMapper {
    List<Role> roles();

    int addNewRole(@Param("role") String role, @Param("roleZh") String roleZh);

    int deleteRoleById(Long rid);
}
