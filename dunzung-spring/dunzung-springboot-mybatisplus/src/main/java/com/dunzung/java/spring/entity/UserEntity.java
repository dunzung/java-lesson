package com.dunzung.java.spring.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Builder(toBuilder = true)
@Data
@TableName("sys_user")
public class UserEntity {

    private Long id;

    private Long userId;

    private String userName;

    private String mobile;

}
