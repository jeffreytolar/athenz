//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zts;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import com.yahoo.rdl.*;

//
// RoleAccess -
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class RoleAccess {
    public List<String> roles;

    public RoleAccess setRoles(List<String> roles) {
        this.roles = roles;
        return this;
    }
    public List<String> getRoles() {
        return roles;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != RoleAccess.class) {
                return false;
            }
            RoleAccess a = (RoleAccess) another;
            if (roles == null ? a.roles != null : !roles.equals(a.roles)) {
                return false;
            }
        }
        return true;
    }
}
