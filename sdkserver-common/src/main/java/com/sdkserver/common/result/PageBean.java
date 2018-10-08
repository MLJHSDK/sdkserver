package com.sdkserver.common.result;

/**
 * @Author Eric Chan
 * @Description  分页Bean，对于分页插件的使用从97行开始
 * @Date 2018/9/12 21:37
 * @CLASS PageBean
 */
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
@NoArgsConstructor
@Data
@Accessors(chain = true)
@SuppressWarnings("all")
@ApiModel("分页数据")
public class PageBean<T> {
    // 当前页
    @ApiModelProperty(name = "当前页码", value = "当前页码",dataType = "Integer",example = "1")
    private Integer currentPage;
    // 每页显示的总条数
    @ApiModelProperty(name = "每页显示的总条数", value = "每页显示的总条数",dataType = "Integer",example = "10")
    private Integer pageSize;
    // 总条数
    @ApiModelProperty(name = "总条数", value = "总条数",dataType = "Integer")
    private Integer totalNum;
    // 是否有下一页
    @ApiModelProperty(name = "是否有下一页", value = "是否有下一页",dataType = "Integer")
    private Integer isMore;
    // 总页数
    @ApiModelProperty(name = "总页数", value = "总页数",dataType = "Integer")
    private Integer totalPage;
    // 开始索引
    @ApiModelProperty(name = "开始索引", value = "开始索引",dataType = "Integer")
    private Integer startIndex;
    // 分页结果
    @ApiModelProperty(name = "分页结果", value = "分页结果",dataType = "Object")
    private List<T> listObject;

    public PageBean(FindBean findBean, Integer totalNum, List<T> listObject) {
        super();
        this.currentPage = findBean.getCurrentPage();
        this.pageSize = findBean.getPageSize();
        this.totalNum = totalNum;
        this.totalPage = (this.totalNum+this.pageSize-1)/this.pageSize;
        this.startIndex = (this.currentPage-1)*this.pageSize;
        this.isMore = this.currentPage >= this.totalPage?0:1;
        this.listObject =  listObject;
    }

    public PageBean(Integer currentPage, Integer pageSize, Integer totalNum, List<T> listObject) {
        super();
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalNum = totalNum;
        this.totalPage = (this.totalNum+this.pageSize-1)/this.pageSize;
        this.startIndex = (this.currentPage-1)*this.pageSize;
        this.isMore = this.currentPage >= this.totalPage?0:1;
        this.listObject =  listObject;
    }
    /**
     * 下面为关于分页插件PageHelper的调用：
     * @Override
     *     public List<Item> findItemByPage(int currentPage,int pageSize) {
     *         //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
     *         PageHelper.startPage(currentPage, pageSize);
     *
     *         List<Item> allItems = itemMapper.findAll();        //全部商品
     *         int countNums = itemMapper.countItem();            //总记录数
     *         PageBean<Item> pageData = new PageBean<>(currentPage, pageSize, countNums);
     *         pageData.setItems(allItems);
     *         return pageData.getItems();
     *     }
     */
}