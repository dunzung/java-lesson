package com.dunzung.java.spring.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Builder(toBuilder = true)
@Data
@TableName("sys_role")
public class RoleEntity {

    private Long id;

    private Long roleId;

    private String roleName;

}
