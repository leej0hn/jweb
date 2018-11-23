package com.redscraf.jweb.admin.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.redscraf.jweb.admin.modules.sys.entity.SysUserEntity;
import com.redscraf.jweb.common.utils.PageUtils;

import java.util.List;
import java.util.Map;


/**
 * 系统用户
 * 
 */
public interface SysUserService extends IService<SysUserEntity> {

	PageUtils queryPage(Map<String, Object> params);
	
	/**
	 * 查询用户的所有菜单ID
	 */
	List<Long> queryAllMenuId(Long userId);

	/**
	 * 查询用户的菜单ID，不包括所属角色
	 */
	List<Long> queryUserMenuId(Long userId);
	
	/**
	 * 保存用户
	 */
	void save(SysUserEntity user);
	
	/**
	 * 修改用户
	 */
	void update(SysUserEntity user);

	/**
	 * 修改密码
	 * @param userId       用户ID
	 * @param password     原密码
	 * @param newPassword  新密码
	 */
	boolean updatePassword(Long userId, String password, String newPassword);
}
