package com.smartinterviewshedular.commonlib.auth.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserRoleType {

    APP_ROLE_ADMIN(1,"ROLE_admin"),
    APP_ROLE_OPERATOR(2,"ROLE_operator");

    private final Integer roleId;
    private final String roleName;
}
