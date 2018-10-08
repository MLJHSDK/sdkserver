package com.sdkserver.common.result;

//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Author Eric Chan
 * @Description 自定义响应结构
 * @Date 2018/9/12 19:01
 * @CLASS Result
 */
@ApiModel(" 返回实体")
public class Result {

    // 定义jackson对象
 //   private static final ObjectMapper MAPPER = new ObjectMapper();

    // 响应业务状态
    @ApiModelProperty(name = "返回码",value = "返回码",dataType = "Integer",example = "10000")
    private Integer code;

    // 响应消息
    @ApiModelProperty(name = "响应消息",value = "响应消息",dataType = "String",example = "成功")
    private String msg;

    // 响应中的数据
    @ApiModelProperty(name = "响应中的数据",value = "响应中的数据",dataType = "Object")
    private Object data;


    //返回错误信息
    public static Result info(String info){

        return  JSONObject.parseObject(info,new TypeReference<Result>() {});

    }
    //参数校验出错信息，错误码为10006，错误信息根据实际返回
    public static Result binding(String msg){

        return new Result(ErrCode.VALIDATE_FAIL.getCode(),msg, null);

    }


    //返回自定义信息
    public static Result build(Integer code, String msg, Object data) {
        return new Result(code, msg, data);
    }

    //返回成功数据
    public static Result ok(Object... data) {
        return new Result(data);
    }

   //返回成功状态
    public static Result ok() {
        return new Result(null);
    }

    //返回服务异常错误
    public static Result error() {
        return info(ErrCode.ERROR.toJson());
    }

    public Result() {

    }

    public static Result build(Integer code, String msg) {
        return new Result(code, msg, null);
    }

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(Object data) {
        this.code = ErrCode.OK.getCode();
        this.msg = ErrCode.OK.getMsg();
        this.data = data;
    }

    public Boolean isStatus() {
        return this.code == ErrCode.OK.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 将json结果集转化为SDKServerResult对象
     *
     * @param jsonData json数据
     * @param clazz SDKServerResult中的object类型
     * @return
     */
//    public static Result formatToPojo(String jsonData, Class<?> clazz) {
//        try {
//            if (clazz == null) {
//                return MAPPER.readValue(jsonData, Result.class);
//            }
//            JsonNode jsonNode = MAPPER.readTree(jsonData);
//            JsonNode data = jsonNode.get("data");
//            Object obj = null;
//            if (clazz != null) {
//                if (data.isObject()) {
//                    obj = MAPPER.readValue(data.traverse(), clazz);
//                } else if (data.isTextual()) {
//                    obj = MAPPER.readValue(data.asText(), clazz);
//                }
//            }
//            return build(jsonNode.get("code").intValue(), jsonNode.get("msg").asText(), obj);
//        } catch (Exception e) {
//            return null;
//        }
//    }

    /**
     * 没有object对象的转化
     *
     * @param json
     * @return
     */
//    public static Result format(String json) {
//        try {
//            return MAPPER.readValue(json, Result.class);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    /**
     * Object是集合转化
     *
     * @param jsonData json数据
     * @param clazz 集合中的类型
     * @return
     */
//    public static Result formatToList(String jsonData, Class<?> clazz) {
//        try {
//            JsonNode jsonNode = MAPPER.readTree(jsonData);
//            JsonNode data = jsonNode.get("data");
//            Object obj = null;
//            if (data.isArray() && data.size() > 0) {
//                obj = MAPPER.readValue(data.traverse(),
//                        MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
//            }
//            return build(jsonNode.get("code").intValue(), jsonNode.get("msg").asText(), obj);
//        } catch (Exception e) {
//            return null;
//        }
//    }
    
}
