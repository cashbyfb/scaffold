package com.perye.manage.bean.vo;

import com.perye.common.util.RecursionUtils;
import com.perye.manage.bean.domain.PermissionResource;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Perye
 * @Date: 2019-03-17
 */
@Getter
@Setter
@Accessors( chain = true )
@ToString( callSuper = true )
public class PermissionResourceVO extends PermissionResource implements RecursionUtils.ParentChildrenRecursion< PermissionResourceVO > {

    private List< String >               methods  = new ArrayList<>();
    private List< PermissionResourceVO > children = new ArrayList<>();

}
