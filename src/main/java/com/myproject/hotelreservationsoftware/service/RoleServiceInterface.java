package com.myproject.hotelreservationsoftware.service;

import com.myproject.hotelreservationsoftware.model.Role;
import com.myproject.hotelreservationsoftware.model.User;
import java.util.List;

public interface RoleServiceInterface {
    List<Role> getRoles();

    Role createRole(Role theRole);

    void deleteRole(Long id);

    Role findByName(String name);

    User removeUserFromRole(Long userId, Long roleId);

    User assignRoleToUser(Long userId, Long roleId);

    Role removeAllUsersFromRole(Long roleId);
}
