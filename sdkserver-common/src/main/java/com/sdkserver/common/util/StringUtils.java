package com.sdkserver.common.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ant on 2016/7/30.
 */
public class StringUtils {

    public static boolean isEmpty(String str){

        return str == null || str.trim().length() == 0;
    }

    public static List<String> split2list(String str, String regx){

        List<String> result = new ArrayList<String>();

        if(isEmpty(str)){
            return result;
        }

        String[] splits = str.split(regx);
        if(splits != null){
            for(String s : splits){
                if(!isEmpty(s)){
                    result.add(s);
                }
            }
        }

        return result;
    }
}
