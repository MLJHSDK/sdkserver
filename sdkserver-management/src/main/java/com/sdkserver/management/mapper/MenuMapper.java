package com.sdkserver.management.mapper;

import com.sdkserver.management.bean.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by management on 2017/12/28.
 */
public interface MenuMapper {

    List<Menu> getAllMenu();

    List<Menu> getMenusByHrId(Long hrId);

    List<Menu> menuTree();

    List<Long> getMenusByRid(Long rid);
}
