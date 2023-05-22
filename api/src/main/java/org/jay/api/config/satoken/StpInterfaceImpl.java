package org.jay.api.config.satoken;


import cn.dev33.satoken.stp.StpInterface;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.jay.api.mapper.SysRoleMapper;
import org.jay.service.model.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class StpInterfaceImpl implements StpInterface {

    @Autowired
    SysRoleMapper sysRoleMapper;

    @Override
    public List<String> getPermissionList(Object loginId, String s) {
////        查出JSON化的权限列表
//        String permission = sysRole.getPermissions(Integer.valueOf((String) loginId));
//        if(!permission.equals("")){
//            return toListString(permission);
//        }
        return null;
    }

    @Override
    public List<String> getRoleList(Object loginId, String s) {
//        查出JSON化的用户组列表
        String role = sysRoleMapper.getRole(Integer.valueOf((String) loginId));
        log.info("role: "+role);
        if(!role.equals("")){
            return toListString(role);
        }
        return null;
    }

    /**
     * 将JSON字符串转成List<String>
     * @param argument JSON化的数组字符串
     * @return Java能识别的List<String>
     */
    public List<String> toListString(String argument){
        Object[] array = JSONObject.parseArray(argument).toArray();
        List<String> result = new ArrayList<String>();
        for (Object item : array) {
            result.add(item.toString());
        }
        return result;
    }
}
