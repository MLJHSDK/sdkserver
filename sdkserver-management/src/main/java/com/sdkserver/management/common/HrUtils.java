package com.sdkserver.management.common;

import com.sdkserver.management.bean.Administrator;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by management on 2017/12/30.
 */
public class HrUtils {
    public static Administrator getCurrentHr() {
        return (Administrator) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
