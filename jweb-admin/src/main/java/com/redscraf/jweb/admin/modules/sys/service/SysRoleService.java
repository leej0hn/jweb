package com.redscraf.jweb.admin.modules.sys.service;


import com.baomidou.mybatisplus.service.IService;
import com.redscraf.jweb.admin.modules.sys.entity.SysRoleEntity;
import com.redscraf.jweb.common.utils.PageUtils;

import java.util.Map;


/**
 * 角色
 * 
 */
public interface SysRoleService extends IService<SysRoleEntity> {

	PageUtils queryPage(Map<String, Object> params);

	void save(SysRoleEntity role);

	void update(SysRoleEntity role);
	
	void deleteBatch(Long[] roleIds);

}
