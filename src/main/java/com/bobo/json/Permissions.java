package com.bobo.json;

import java.util.List;

/**
 * @author bobo
 * @date 2020-09-09
 */

public class Permissions {
    List<Permission> permissions;

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "Permissions{" +
                "permissions=" + permissions +
                '}';
    }
}
