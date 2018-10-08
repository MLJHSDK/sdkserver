package com.sdkserver.management.controller;

import com.sdkserver.management.bean.Administrator;
import com.sdkserver.management.bean.Menu;
import com.sdkserver.management.bean.RespBean;
import com.sdkserver.management.bean.Role;
import com.sdkserver.management.common.HrUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.sdkserver.management.service.AdministratorService;
import com.sdkserver.management.service.MenuRoleService;
import com.sdkserver.management.service.MenuService;
import com.sdkserver.management.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 权限控制类
 */
@RestController("authority")
@RequestMapping("")
@Api(description = "权限模块")
public class AuthorityController {

    @Autowired
    MenuService menuService;
    @Autowired
    RoleService roleService;
    @Autowired
    AdministratorService hrService;
    @Autowired
    MenuRoleService menuRoleService;

    @ApiOperation(value="获取菜单", notes="获取菜单")
    @GetMapping("/config/sysmenu")
    public List<Menu> sysmenu() {
        return menuService.getMenusByHrId();
    }

    @GetMapping("/config/hr")
    public Administrator currentUser() {
        return HrUtils.getCurrentHr();
    }


    @DeleteMapping(value = "/system/basic/role/{rid}")
    public RespBean deleteRole(@PathVariable Long rid) {
        if (roleService.deleteRoleById(rid) == 1) {
            return new RespBean("success", "删除成功!");
        }
        return new RespBean("error", "删除失败!");
    }

    @ApiOperation(value="添加角色", notes="添加角色")
    @PostMapping(value = "/system/basic/addRole")
    public RespBean addNewRole(String role, String roleZh) {
        if (roleService.addNewRole(role, roleZh) == 1) {
            return new RespBean("success", "添加成功!");
        }
        return new RespBean("error", "添加失败!");
    }

    @GetMapping(value = "/system/basic/menuTree/{rid}")
    public Map<String, Object> menuTree(@PathVariable Long rid) {
        Map<String, Object> map = new HashMap<>();
        List<Menu> menus = menuService.menuTree();
        map.put("menus", menus);
        List<Long> selMids = menuService.getMenusByRid(rid);
        map.put("mids", selMids);
        return map;
    }

    @PutMapping(value = "/system/basic/updateMenuRole")
    public RespBean updateMenuRole(Long rid, Long[] mids) {
        if (menuRoleService.updateMenuRole(rid, mids) == mids.length) {
            return new RespBean("success", "更新成功!");
        }
        return new RespBean("error", "更新失败!");
    }

    @GetMapping("/system/basic/roles")
    public List<Role> allRoles() {
        return roleService.roles();
    }

    @PutMapping("/system/hr/id/{hrId}")
    public Administrator getHrById(@PathVariable Long hrId) {
        return hrService.getHrById(hrId);
    }

    @DeleteMapping(value = "/system/hr/{hrId}")
    public RespBean deleteHr(@PathVariable Long hrId) {
        if (hrService.deleteHr(hrId) == 1) {
            return new RespBean("success", "删除成功!");
        }
        return new RespBean("error", "删除失败!");
    }

    @PutMapping(value = "/system/hr/")
    public RespBean updateHr(Administrator hr) {
        if (hrService.updateHr(hr) == 1) {
            return new RespBean("success", "更新成功!");
        }
        return new RespBean("error", "更新失败!");
    }

    @PutMapping(value = "/system/hr/roles")
    public RespBean updateHrRoles(Long hrId, Long[] rids) {
        if (hrService.updateHrRoles(hrId, rids) == rids.length) {
            return new RespBean("success", "更新成功!");
        }
        return new RespBean("error", "更新失败!");
    }

    @GetMapping("/system/hr/{keywords}")
    public List<Administrator> getHrsByKeywords(@PathVariable(required = false) String keywords) {
        List<Administrator> hrs = hrService.getHrsByKeywords(keywords);
        return hrs;
    }
    @PostMapping(value = "/system/hr/hr/reg")
    public RespBean hrReg(String username, String password) {
        int i = hrService.hrReg(username, password);
        if (i == 1) {
            return new RespBean("success", "注册成功!");
        } else if (i == -1) {
            return new RespBean("error", "用户名重复，注册失败!");
        }
        return new RespBean("error", "注册失败!");
    }


}
