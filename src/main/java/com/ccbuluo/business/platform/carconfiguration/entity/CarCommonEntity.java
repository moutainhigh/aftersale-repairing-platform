package com.ccbuluo.business.platform.carconfiguration.entity;

import com.ccbuluo.business.constants.Constants;
import com.ccbuluo.business.entity.IdEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author: guotao
 * @date: 2018/5/17 18:33.
 */
@ApiModel(value = "公共字段", description = "公共字段")
public class CarCommonEntity extends IdEntity {

    @ApiModelProperty(name = "createTime", value = "创建时间")
    protected LocalDateTime createTime;
    @ApiModelProperty(name = "creator", value = "创建人")
    protected String creator;
    @ApiModelProperty(name = "operateTime", value = "操作时间")
    protected LocalDateTime operateTime;
    @ApiModelProperty(name = "operator", value = "操作人")
    protected String operator;
    @ApiModelProperty(name = "deleteFlag", value = "删除标识")
    protected Integer deleteFlag;

    public void preInsert(String userId){
        if (StringUtils.isNotBlank(userId)){
            this.creator = userId;
            this.operator = userId;
        }
        this.operateTime = LocalDateTime.now();
        this.createTime = this.operateTime;
        this.deleteFlag = Constants.DELETE_FLAG_NORMAL;
    }

    public void preUpdate(String userId){
        if (StringUtils.isNotBlank(userId)){
            this.operator = userId;
        }
        this.operateTime = LocalDateTime.now();
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public LocalDateTime getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(LocalDateTime operateTime) {
        this.operateTime = operateTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

}
