package com.redscraf.jweb.admin.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.redscraf.jweb.admin.modules.sys.entity.SysUserMenuEntity;

/**
 * 用户与菜单对应关系
 * 
 */
public interface SysUserMenuDao extends BaseMapper<SysUserMenuEntity> {
	
	/**
	 * 根据角色ID数组，批量删除
	 */
	int deleteBatch(Long[] userIds);
}
