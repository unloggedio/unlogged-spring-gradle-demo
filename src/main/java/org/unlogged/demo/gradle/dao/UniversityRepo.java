package org.unlogged.demo.gradle.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.unlogged.demo.gradle.models.University;

public interface UniversityRepo extends JpaRepository<University, String> {
}
