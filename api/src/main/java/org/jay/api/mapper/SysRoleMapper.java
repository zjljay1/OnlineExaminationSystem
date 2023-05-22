package org.jay.api.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.jay.service.model.*;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 角色 Mapper 接口
 * </p>
 *
 * @author Jay
 * @since 2023-05-06
 */
@Mapper
public interface SysRoleMapper extends BaseMapper<SysRole> {

    String getRole(@Param("ID") Integer valueOf);
}
