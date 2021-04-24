package com.atguigu.yygh.cmn.service;

import com.atguigu.yygh.model.cmn.Dict;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author lijian
 * @create 2021-04-22 15:53
 */
public interface DictService extends IService<Dict> {
    //根据数据id查询子数据列表
    List<Dict> findChildData(Long id);
}
