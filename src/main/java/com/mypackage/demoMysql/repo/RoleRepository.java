package com.mypackage.demoMysql.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mypackage.demoMysql.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
