package com.sdkserver.common.util;

import java.net.URLDecoder;
import java.util.Map;

/**
 * Created by CrazyJack on 2016/11/19.
 */
public class UHttpUrlUtils {

    /**
     * 把Map转换成url参数
     * @param map Map<String,String>
     * @return "key1=value1&key2=value2"
     */
    public static String mapTransformToUrlParam(Map<String,String> map){
        return mapTransformToUrlParam(map,false,false,null);
    }

    /**
     * 把Map转换成url参数
     * @param map Map<String,String>
     * @param forgetNonValue 忽略空值
     * @return "key1=value1&key2=value2"
     */
    public static String mapTransformToUrlParam(Map<String,String> map, boolean forgetNonValue){
        return mapTransformToUrlParam(map,forgetNonValue,false,null);
    }

    /**
     * 把Map转换成url参数
     * @param map Map<String,String>
     * @param forgetNonValue 忽略空值
     * @return "key1=value1&key2=value2"
     */
    public static String mapTransformToUrlParam(Map<String,String> map, boolean forgetNonValue,boolean urldecode){
        return mapTransformToUrlParam(map,forgetNonValue,urldecode,"UTF-8");
    }

    /**
     * 把Map转换成url参数
     * @param map Map<String,String>
     * @param forgetNonValue 忽略空值
     * @return "key1=value1&key2=value2"
     */
    public static String mapTransformToUrlParam(Map<String,String> map, boolean forgetNonValue,boolean urldecode,String urldecodeEnc){
        StringBuffer sb = new StringBuffer();

        try {

            for(Map.Entry<String,String> entry : map.entrySet()) {

                if (forgetNonValue && StringUtils.isEmpty(entry.getValue())) {
                    continue;
                }

                if (sb.length() > 0) {
                    sb.append("&");
                }

                sb.append(entry.getKey()).append("=");
                if (urldecode) {
                    sb.append(URLDecoder.decode(entry.getValue(),urldecodeEnc));
                } else{
                    sb.append(entry.getValue());
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return sb.toString();
    }

}
