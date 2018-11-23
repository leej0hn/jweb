package com.redscraf.jweb.admin.modules.sys.entity;


import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户与菜单对应关系
 * 
 */
@Data
@TableName("sys_user_menu")
public class SysUserMenuEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@TableId
	private Long id;

	/**
	 * 用户ID
	 */
	private Long userId;

	/**
	 * 菜单ID
	 */
	private Long menuId;


}
