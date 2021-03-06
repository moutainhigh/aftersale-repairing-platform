package com.ccbuluo.business.platform.servicecenter.service;

import com.ccbuluo.business.platform.servicecenter.dto.SaveServiceCenterDTO;
import com.ccbuluo.business.platform.servicecenter.dto.SearchListDTO;
import com.ccbuluo.business.platform.servicecenter.dto.SearchServiceCenterDTO;
import com.ccbuluo.http.StatusDto;
import com.ccbuluo.http.StatusDtoThriftBean;
import com.ccbuluo.http.StatusDtoThriftPage;
import com.ccbuluo.usercoreintf.dto.QueryServiceCenterDTO;
import com.ccbuluo.usercoreintf.dto.QueryServiceCenterListDTO;
import com.ccbuluo.usercoreintf.dto.ServiceCenterWorkplaceDTO;
import org.apache.thrift.TException;

import javax.validation.constraints.Null;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * 服务中心service
 * @author liuduo
 * @version v1.0.0
 * @date 2018-07-03 19:20:03
 */
public interface ServiceCenterService {
    /**
     * 保存服务中心
     * @param saveServiceCenterDTO 服务中心实体
     * @return 保存状态
     * @author liuduo
     * @date 2018-07-04 09:40:53
     */
    StatusDto<String> saveServiceCenter(SaveServiceCenterDTO saveServiceCenterDTO)  throws Exception;

    /**
     * 服务中心详情
     * @param serviceCenterCode 服务中心code
     * @return 服务中心详情
     * @author liuduo
     * @date 2018-07-05 09:15:47
     */
    SearchServiceCenterDTO getByCode(String serviceCenterCode);

    /**
     * 编辑服务中心
     * @param serviceCenterCode 服务中心code
     * @param serviceCenterName 服务中心名称
     * @param labelIds 标签ids
     * @return 编辑是否成功
     * @author liuduo
     * @date 2018-07-05 11:10:30
     */
    StatusDto<String> editServiceCenter(String serviceCenterCode, String serviceCenterName, String labelIds);

    /**
    * 根据服务中心code查询职场
    * @param serviceCenterCode 服务中心code
    * @return 职场信息
    * @author liuduo
    * @date 2018-07-05 13:49:42
    */
    StatusDtoThriftBean<ServiceCenterWorkplaceDTO> getWorkplaceByCode(String serviceCenterCode) ;

    /**
     * 编辑职场
     * @param serviceCenterWorkplaceDTO 职场实体
     * @return 编辑状态
     * @author liuduo
     * @date 2018-07-05 14:09:09
     */
    StatusDto<String> editWorkplace(ServiceCenterWorkplaceDTO serviceCenterWorkplaceDTO);

    /**
     * 查询服务中心列表
     * @param searchListDTO 查询服务中心列表参数
     * @return 服务中心列表
     * @author liuduo
     * @date 2018-07-03 14:27:11
     */
    StatusDtoThriftPage<QueryServiceCenterDTO> queryList(SearchListDTO searchListDTO) ;

    /**
     * 服务中心启停
     * @param serviceCenterCode 服务中心code
     * @param serviceCenterStatus 服务中心状态
     * @return 操作是否成功
     * @author liuduo
     * @date 2018-07-06 10:11:00
     */
    StatusDto<String> editOrgStatus(String serviceCenterCode, Integer serviceCenterStatus);

    /**
     * 查询可用的服务中心和平台
     * @param province 省
     * @param city 市
     * @param area 区
     * @param orgType 机构类型
     * @param name 服务中心名字
     * @return 可用的服务中心
     * @author liuduo
     * @date 2018-07-06 10:00:52
     */
    List<QueryServiceCenterListDTO> findUsableServiceCenterAndPlatform(String province, String city, String area, String orgType, String name);
}
