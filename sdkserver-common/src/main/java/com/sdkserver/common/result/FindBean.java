package com.sdkserver.common.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Accessors(chain = true)
@SuppressWarnings("all")
@ApiModel("封装了页面数据")
public class FindBean {

    // 当前页码
    @NotNull
    @Min(value = 1,message = "currentPage为大于0整数")
    @ApiModelProperty(name = "当前页码", value = "当前页码",dataType = "Integer",example = "1")
    private Integer currentPage;

    // 每页显示的总条数
    @NotNull
    @Min(value = 1,message = "pageSize为大于0整数")
    @ApiModelProperty(name = "每页显示的总条数", value = "每页显示的总条数",dataType = "Integer",example = "10")
    private Integer pageSize;

    //查询种类
    @ApiModelProperty(name = "查询种类", value = "查询种类",dataType = "String")
    private String kind;

    //查询关键字
    @ApiModelProperty(name = "查询关键字", value = "查询关键字",dataType = "String")
    private String keyword;
}
