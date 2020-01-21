package com.yj.emallstudy.service;


import com.yj.emallstudy.mbg.model.UmsAdmin;
import com.yj.emallstudy.mbg.model.UmsPermission;

import java.util.List;

/**
 * @author: 杨靖
 * @time: 2020/1/21 0021 15:43
 * @description:
 */
/**
 * 后台管理员Service
 * Created by macro on 2018/4/26.
 */
public interface UmsAdminService {
    /**
     * 根据用户名获取后台管理员
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 注册功能
     */
    UmsAdmin register(UmsAdmin umsAdminParam);

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    List<UmsPermission> getPermissionList(Long adminId);
}