package com.perye.manage.bean.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 后台管理角色_id
 * </p>
 *
 * @Author: Perye
 * @Date: 2019-03-17
 */
@Getter
@Setter
@ToString
@Accessors( chain = true )
@TableName( "manage_user_role" )
public class UserRole extends Model< UserRole > {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId( value = "id", type = IdType.AUTO )
    private Long id;
    /**
     * 后台管理用户_id
     */
    @TableField( "user_id" )
    private Long userId;
    /**
     * 后台管理角色_id
     */
    @TableField( "role_id" )
    private Long roleId;


    @Override
    protected Serializable pkVal () {
        return this.id;
    }

}
