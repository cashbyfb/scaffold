package com.perye.manage.bean.domain.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;
import lombok.Getter;

/**
 * 收件箱类型(SYSTEM:系统邮箱,OTHER:其他邮箱[非系统邮箱]),默认为 : SYSTEM
 *
 * @Author: Perye
 * @Date: 2019-03-17
 */
@Getter
public enum ToEmailType implements IEnum {

	/**
	 *
	 */
	SYSTEM( "SYSTEM" , "系统邮箱" ),
	OTHER( "OTHER" , "其他邮箱[非系统邮箱])" );

	/** 数据库存储值 **/
	private String value;
	/** 相应注释 **/
	private String comment;

	ToEmailType ( String value , String comment ) {
		this.value = value;
		this.comment = comment;
	}
}

