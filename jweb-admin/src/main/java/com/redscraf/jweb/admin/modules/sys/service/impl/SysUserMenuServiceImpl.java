package com.redscraf.jweb.admin.modules.sys.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.redscraf.jweb.admin.modules.sys.dao.SysUserMenuDao;
import com.redscraf.jweb.admin.modules.sys.entity.SysUserMenuEntity;
import com.redscraf.jweb.admin.modules.sys.service.SysUserMenuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


/**
 * 角色与菜单对应关系
 * 
 */
@Service("sysUserMenuService")
public class SysUserMenuServiceImpl extends ServiceImpl<SysUserMenuDao, SysUserMenuEntity> implements SysUserMenuService {

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void saveOrUpdate(Long userId, List<Long> menuIdList) {
		//先删除角色与菜单关系
		deleteBatch(new Long[]{userId});
		if(menuIdList.size() == 0){
			return ;
		}
		//保存角色与菜单关系
		List<SysUserMenuEntity> list = new ArrayList<>(menuIdList.size());
		for(Long menuId : menuIdList){
			SysUserMenuEntity sysUserMenuEntity = new SysUserMenuEntity();
			sysUserMenuEntity.setMenuId(menuId);
			sysUserMenuEntity.setUserId(userId);

			list.add(sysUserMenuEntity);
		}
		this.insertBatch(list);
	}

	@Override
	public int deleteBatch(Long[] roleIds){
		return baseMapper.deleteBatch(roleIds);
	}


}
