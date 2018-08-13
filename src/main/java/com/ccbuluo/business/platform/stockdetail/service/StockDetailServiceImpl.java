package com.ccbuluo.business.platform.stockdetail.service;

import com.ccbuluo.business.entity.BizStockDetail;
import com.ccbuluo.business.platform.stockdetail.dao.BizStockDetailDao;
import com.ccbuluo.business.platform.stockdetail.dto.UpdateStockBizStockDetailDTO;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 库存详情service实现
 * @author liuduo
 * @version v1.0.0
 * @date 2018-08-08 14:46:41
 */
@Service
public class StockDetailServiceImpl implements StockDetailService{

    @Autowired
    private BizStockDetailDao bizStockDetailDao;

    /**
     * 根据入库详单的  供应商、商品、仓库、批次号  查询在库存中有无记录
     * @param supplierNo 供应商
     * @param productNo 商品编号
     * @param inRepositoryNo 入库仓库编号
     * @param applyNo 交易单号
     * @return 库存明细id
     * @author liuduo
     * @date 2018-08-08 14:55:43
     */
    @Override
    public Long getByinstockorderDeatil(String supplierNo, String productNo, String inRepositoryNo, String applyNo) {
        return bizStockDetailDao.getByinstockorderDeatil(supplierNo, productNo, inRepositoryNo, applyNo);
    }

    /**
     * 修改有效库存
     * @param bizStockDetail 库存明细
     * @param versionNo 版本号
     * @author liuduo
     * @date 2018-08-08 15:24:09
     */
    @Override
    public void updateValidStock(BizStockDetail bizStockDetail, Long versionNo) {
        bizStockDetailDao.updateValidStock(bizStockDetail, versionNo);
    }

    /**
     * 保存库存明细
     * @param bizStockDetail 库存明细
     * @author liuduo
     * @date 2018-08-08 15:39:58
     */
    @Override
    public Long saveStockDetail(BizStockDetail bizStockDetail) {
        return bizStockDetailDao.saveEntity(bizStockDetail);
    }

    /**
     * 根据库存明细id查询版本号
     * @param id 库存明细id
     * @return 版本号
     * @author liuduo
     * @date 2018-08-08 19:31:38
     */
    @Override
    public Integer getVersionNoById(Long id) {
        return bizStockDetailDao.getVersionNoById(id);
    }

    /**
     * 根据库存明细id查询所有库存明细的占用库存
     * @param ids 库存明细id
     * @return 库存明细
     * @author liuduo
     * @date 2018-08-08 14:55:43
     */
    @Override
    public List<UpdateStockBizStockDetailDTO> getOutstockDetail(List<Long> ids) {
        return bizStockDetailDao.getOutstockDetail(ids);
    }

    /**
     * 修改库存明细的占用库存
     * @param bizStockDetails 库存明细
     * @author liuduo
     * @date 2018-08-09 19:14:33
     */
    @Override
    public void updateOccupyStock(List<BizStockDetail> bizStockDetails) {
        bizStockDetailDao.updateOccupyStock(bizStockDetails);
    }

    /**
     * 把库存明细中的有效库存更新库到占用库存
     * @param bizStockDetails 库存明细
     * @author liuduo
     * @date 2018-08-10 11:48:21
     */
    @Override
    public void updateOccupyStockById(List<BizStockDetail> bizStockDetails) {
        bizStockDetailDao.updateOccupyStockById(bizStockDetails);
    }

    /**
     * 根据库存明细id查询到控制的版本号（乐观锁使用）
     * @param stockIds 库存明细id
     * @return 版本号对组
     * @author liuduo
     * @date 2018-08-10 15:02:51
     */
    @Override
    public List<Pair<Long,Long>> queryVersionNoById(List<Long> stockIds) {
        return bizStockDetailDao.queryVersionNoById(stockIds);
    }
}
