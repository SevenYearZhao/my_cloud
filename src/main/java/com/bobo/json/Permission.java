package com.bobo.json;

/**
 * @author bobo
 * @date 2020-09-09
 */

public class Permission {
    private String permissionId;

    public Permission() {
    }

    public Permission(String permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "permissionId='" + permissionId + '\'' +
                '}';
    }
}
