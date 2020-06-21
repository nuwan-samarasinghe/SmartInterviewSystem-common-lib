package com.smartinterviewshedular.commonlib.auth.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PermissionType {

    CREATE_CUSTOMER_PERMISSION(1, "create_customer"),
    READ_CUSTOMER_PERMISSION(2, "read_customer"),
    UPDATE_CUSTOMER_PERMISSION(3, "update_customer"),
    DELETE_CUSTOMER_PERMISSION(4, "delete_customer");

    private final Integer permissionId;
    private final String permissionName;
}
