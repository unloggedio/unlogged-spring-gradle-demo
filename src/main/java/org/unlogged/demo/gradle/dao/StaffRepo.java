package org.unlogged.demo.gradle.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.unlogged.demo.gradle.models.Staff;

public interface StaffRepo extends JpaRepository<Staff, String> {
}
