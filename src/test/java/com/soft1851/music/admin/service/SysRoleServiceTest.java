package com.soft1851.music.admin.service;

import com.soft1851.music.admin.domain.entity.SysRole;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SysRoleServiceTest {
    @Resource
    private SysRoleService sysRoleService;

    @Test
    void selectRoleById() {
        Map<String, Object> map = sysRoleService.selectRoleById(1);
        System.out.println(map);
    }

    @Test
    void checkRole() {
        SysRole role1 = SysRole.builder().roleId(1).roleName("admin").build();
        SysRole role2 = SysRole.builder().roleId(2).roleName("editor").build();
        List<SysRole> roles = new ArrayList<>();
        roles.add(role1);
        roles.add(role2);
        boolean flag = sysRoleService.checkRole(roles, 1);
        System.out.println(flag);
        assertTrue(flag);
    }
}