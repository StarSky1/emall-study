package com.yj.emallstudy.dao;


import com.yj.emallstudy.mbg.model.UmsPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @author: 杨靖
 * @time: 2020/1/21 0021 16:53
 * @description:
 */
/**
 * 后台用户与角色管理自定义Dao
 * Created by macro on 2018/10/8.
 */
public interface UmsAdminRoleRelationDao {

    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}