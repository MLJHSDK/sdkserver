package com.sdkserver.channel.utils.query;


import com.sdkserver.common.exception.NullFindKindException;

/**
 * @Author Eric Chan
 * @Description 查询种类
 * @Date 2018/9/20 17:25
 * @CLASS ValidationConfig
 */
public enum ChannelMaterVerifyQuery {

    //渠道号
    MASTER_ID,

    //渠道名
    MASTER_NAME,

    //名称后缀
    NAME_SUFFIX,

    //类路径
    VERIFY_CLASS;


    ChannelMaterVerifyQuery() {


    }

    public static ChannelMaterVerifyQuery verify(String query){
        for (ChannelMaterVerifyQuery q : ChannelMaterVerifyQuery.values()) {
            if (q.name().equals(query))
                return q;
        }
        throw new NullFindKindException(query);
    }
}