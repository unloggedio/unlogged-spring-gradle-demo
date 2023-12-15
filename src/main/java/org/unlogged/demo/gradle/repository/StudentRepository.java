package org.unlogged.demo.gradle.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.unlogged.demo.gradle.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {
}
