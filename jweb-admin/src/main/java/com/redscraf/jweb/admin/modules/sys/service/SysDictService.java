package com.redscraf.jweb.admin.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.redscraf.jweb.admin.modules.sys.entity.SysDictEntity;
import com.redscraf.jweb.common.utils.PageUtils;

import java.util.Map;

/**
 * 数据字典
 *
 */
public interface SysDictService extends IService<SysDictEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

