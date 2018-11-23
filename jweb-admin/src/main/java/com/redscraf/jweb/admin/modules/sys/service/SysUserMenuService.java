package com.redscraf.jweb.admin.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.redscraf.jweb.admin.modules.sys.entity.SysUserMenuEntity;

import java.util.List;


/**
 * 角色与菜单对应关系
 * 
 */
public interface SysUserMenuService extends IService<SysUserMenuEntity> {
	
	void saveOrUpdate(Long userId, List<Long> menuIdList);

	/**
	 * 根据角色ID数组，批量删除
	 */
	int deleteBatch(Long[] userIds);
}
