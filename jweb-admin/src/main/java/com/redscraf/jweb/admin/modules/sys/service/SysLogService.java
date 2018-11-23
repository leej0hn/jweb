package com.redscraf.jweb.admin.modules.sys.service;


import com.baomidou.mybatisplus.service.IService;
import com.redscraf.jweb.admin.modules.sys.entity.SysLogEntity;
import com.redscraf.jweb.common.utils.PageUtils;

import java.util.Map;


/**
 * 系统日志
 * 
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
