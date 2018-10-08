package com.sdkserver.common.result;

import com.alibaba.fastjson.JSON;

/**
 * @Author Eric Chan
 * @Description 错误码
 * @Date 2018/9/12 18:55
 * @CLASS ErrCode
 */
public enum ErrCode {

    OK("成功", 10000),
    EXIST_OBJECT("数据已经存在", 10001),
    EMPTY_OBJECT("数据不存在", 10002),
    NO_FIND_KIND("查找类型不存在", 10003),
    ERROR("服务器异常", 10005),
    BUILDING_NOT_FOUND("楼栋信息不存在", 10005),
    VALIDATE_FAIL("参数校验失败", 10006),
    ROOM_NOT_FOUND("房间信息不存在", 7),
    NO_NEXT_ONE("已经是最后一项了", 8),
    LOGIN_VALID_FAIL("账号或密码错误", 10009),
    LOGIN_FAIL("登录失败", 10010),
    AREA_NOT_EXIST("所属区域不存在", 11),
    BUILDING_NAME_EXIST("楼栋名称已存在", 12),
    BUILDING_NUMBER_EXIST("楼栋编号已存在", 13),
    BUILDING_INFO_BLANK("区域、名称不能为空", 14),
    ROOM_NUMBER_EXISTS("房间号已存在", 15),
    NAME_IS_BLANK("名称不能为空", 16),
    NAME_EXISTS("该名称已存在", 17),
    GROUP_NOT_FOUND("用户组不存在", 18),
    GROUP_HAS_USERS("用户组内还有用户，不能删除", 19),
    ACCOUNT_EXISTS("账号已存在", 20),
    USER_INFO_BLANK("账号、用户名或密码不能为空", 21),
    USER_NOT_FOUND("用户不存在", 22),
    WRONG_ACOUNT_PASSWORD("账号或密码错误", 23),
    BLANK_PASSWORD("密码不能为空", 24),
    WRONG_OLD_PASSWORD("修改失败，原密码错误", 25),
    ONLY_ONE_SORT_REQUIRED("不能同时选择两种排序规则", 26),
    ROOMS_COUNTS_NOT_MATCHED("房间数量与实际不匹配", 27),
    INVALID_PARAM("非法参数", 28),
    HAS_PAID("该月份账单已结算，不可修改", 29),
    INVALID_VALUE("异常数据，请检查", 30),
    INVALID_PARAM_WATER("异常水量数据，请检查", 31),
    INVALID_PARAM_ELECTRICITY("异常电量数据，请检查", 31),
    TYPE_NAME_EXISTS("类别名称已存在", 32),
    TYPE_AREA_EXISTS("该收费区域已有相关设置，请检查", 33),
    TYPE_NOT_FOUND("收费类别不存在", 34),
    INVALID_RATE("无效的比例", 35),
    HAS_NOT_PAID("请先完成缴费", 36),
    PRICE_NOT_FOUND("该区域尚未设置收费类别，请先完成设置", 37),
    OVERTIME("录入失败，不在规定的时段内", 38),
    DEFAULT_GROUP("该身份为系统默认身份，不允许修改和删除", 39),
    INVALID_TIME_RANGE("元首的时间区间", 40),
    ABNORMAL_ELECTRICITY("电表读数比上月多出#ABNORMAL#千瓦时", 41),
    ABNORMAL_WATER("水表读数比上月多出#ABNORMAL#吨", 42),
    LESS_THAN_BASE_WATER_VALUE("水表读数异常，小于基准读数", 43),
    LESS_THAN_BASE_ELECTRICITY_VALUE("电表读数异常，小于基准读数", 44),
    INVALID_PASSWORD("密码应至少包含字母、数字和特殊符号中的两种，且长度必须大于等于8", 45),
    LOGIN_FAIL_TOO_MANY_TIMES("连续登录失败超过5次，请10分钟后重试", 46),
    DISTRIBUT_ERROR("“账号管理”不能与其它菜单同时勾选", 47),
    DEFAULT_PERMISSION("系统默认权限不可修改", 48),
    CHANNEL_EXISTS("渠道已存在", 49),
    CHANNEL_NOT_EXISTS("渠道不存在", 50),
    HAS_CHANNEL_EXISTS("请先删除该游戏下面的所有渠道数据", 51);

    private String msg;
    private int code;

    ErrCode(String msg, int code) {
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "ErrCode{" +
                "msg='" + msg + '\'' +
                ", code=" + code +
                '}';
    }

    public String toJson(){
        Result result = new Result(this.code,this.getMsg(),null);
        return JSON.toJSONString(result);
    }
}
