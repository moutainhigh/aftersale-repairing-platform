package com.ccbuluo.business.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * 仓库实体
 * @author liuduo
 * @date 2018-05-10 11:43:11
 * @version V1.0.0
 */
@ApiModel(value = "实体", description = "")
public class BizServiceStorehouse extends AftersaleCommonEntity{
    /**
     * 仓库编号
     */
    @ApiModelProperty(name = "storehouseCode", value = "仓库编号")
    private String storehouseCode;
    /**
     * 名称
     */
    @ApiModelProperty(name = "storehouseName", value = "名称")
    private String storehouseName;
    /**
     * 仓库面积单位平米
     */
    @ApiModelProperty(name = "storehouseAcreage", value = "仓库面积单位平米")
    private Double storehouseAcreage;
    /**
     * 所属服务中心code（组织结构code）
     */
    @ApiModelProperty(name = "servicecenterCode", value = "所属服务中心code（组织结构code）")
    private String servicecenterCode;
    /**
     * 启用、停用
     */
    @ApiModelProperty(name = "storehouseStatus", value = "启用、停用")
    private Long storehouseStatus;
    /**
     * 
     */
    @ApiModelProperty(name = "provinceCode", value = "省code")
    private String provinceCode;
    /**
     * 
     */
    @ApiModelProperty(name = "provinceName", value = "省名字")
    private String provinceName;
    /**
     * 
     */
    @ApiModelProperty(name = "cityCode", value = "市code")
    private String cityCode;
    /**
     * 
     */
    @ApiModelProperty(name = "cityName", value = "市名字")
    private String cityName;
    /**
     * 
     */
    @ApiModelProperty(name = "areaCode", value = "区code")
    private String areaCode;
    /**
     * 
     */
    @ApiModelProperty(name = "areaName", value = "区名字")
    private String areaName;


    public void setStorehouseCode(String storehouseCode) {
        this.storehouseCode = storehouseCode;
    }

    public String getStorehouseCode() {
        return this.storehouseCode;
    }

    public void setStorehouseName(String storehouseName) {
        this.storehouseName = storehouseName;
    }

    public String getStorehouseName() {
        return this.storehouseName;
    }

    public void setStorehouseAcreage(Double storehouseAcreage) {
        this.storehouseAcreage = storehouseAcreage;
    }

    public Double getStorehouseAcreage() {
        return this.storehouseAcreage;
    }

    public void setServicecenterCode(String servicecenterCode) {
        this.servicecenterCode = servicecenterCode;
    }

    public String getServicecenterCode() {
        return this.servicecenterCode;
    }

    public void setStorehouseStatus(Long storehouseStatus) {
        this.storehouseStatus = storehouseStatus;
    }

    public Long getStorehouseStatus() {
        return this.storehouseStatus;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceCode() {
        return this.provinceCode;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceName() {
        return this.provinceName;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaCode() {
        return this.areaCode;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getAreaName() {
        return this.areaName;
    }


}