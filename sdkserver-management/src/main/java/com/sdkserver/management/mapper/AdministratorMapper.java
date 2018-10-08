package com.sdkserver.management.mapper;

import com.sdkserver.management.bean.Administrator;
import com.sdkserver.management.bean.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by management on 2017/12/28.
 */
public interface AdministratorMapper {
    Administrator loadUserByUsername(String username);

    List<Role> getRolesByHrId(Long id);

    int hrReg(@Param("username") String username, @Param("password") String password);

    List<Administrator> getHrsByKeywords(@Param("keywords") String keywords);

    int updateHr(Administrator hr);

    int deleteRoleByHrId(Long hrId);

    int addRolesForHr(@Param("hrId") Long hrId, @Param("rids") Long[] rids);

    Administrator getHrById(Long hrId);

    int deleteHr(Long hrId);

    List<Administrator> getAllHr(@Param("currentId") Long currentId);
}
