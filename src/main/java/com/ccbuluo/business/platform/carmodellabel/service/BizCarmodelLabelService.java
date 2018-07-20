package com.ccbuluo.business.platform.carmodellabel.service;

import com.ccbuluo.business.entity.BizCarmodelLabel;
import com.ccbuluo.business.platform.carmodellabel.dto.SearchBizCarmodelLabelDTO;
import com.ccbuluo.db.Page;
import com.ccbuluo.http.StatusDto;

/**
 * 车型标签service
 * @author chaoshuai
 * @date 2018-05-08 10:55:54
 */
public interface BizCarmodelLabelService {

    /**
     * 新增车型标签
     * @param bizCarmodelLabel 车型标签dto
     * @return com.ccbuluo.http.StatusDto
     * @exception
     * @author weijb
     * @date 2018-05-09 14:02:30
     */
    StatusDto saveCarmodelLabel(BizCarmodelLabel bizCarmodelLabel);
    /**
     * 编辑车型标签
     * @param bizCarmodelLabel 车型标签dto
     * @return com.ccbuluo.http.StatusDto
     * @exception
     * @author weijb
     * @date 2018-05-09 14:02:30
     */
    StatusDto editCarmodelLabel(BizCarmodelLabel bizCarmodelLabel);

    /**
     * 车型标签信息验证唯一性
     * @param bizCarmodelLabel 车型标签基本信息
     * @return com.ccbuluo.http.StatusDto
     * @exception
     * @author wuyibo
     * @date 2018-05-09 14:02:30
     */
    StatusDto findServiceMaintaincarVerification(BizCarmodelLabel bizCarmodelLabel);


    /**
     * 根据车型标签id查询车型标签详情
     * @param labelCode 车辆id
     * @return java.util.Map<java.lang.String,java.lang.Object>
     * @exception
     * @author weijb
     * @date 2018-06-08 13:55:14
     */
    BizCarmodelLabel queryCarmodelLabelBylabelCode(String labelCode);

    /**
     * 根据车型标签id删除车型标签
     * @param labelCode 车辆labelCode
     * @return java.util.Map<java.lang.String,java.lang.Object>
     * @exception
     * @author weijb
     * @date 2018-06-08 13:55:14
     */
    int deleteCarcoreInfoBylabelCode(String labelCode);
    /**
     * 车型标签列表分页查询
     * @param Keyword (车型标签名称)
     * @param offset 起始数
     * @param pageSize 每页数量
     * @author weijb
     * @date 2018-07-13 19:52:44
     */
    Page<SearchBizCarmodelLabelDTO> queryCarmodelLabelList(String Keyword, Integer offset, Integer pageSize);

}
