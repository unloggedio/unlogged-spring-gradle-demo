package org.unlogged.demo.gradle.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.unlogged.demo.gradle.models.redis.DeliveryUnit;

@Repository
public interface DeliveryUnitRepo extends CrudRepository<DeliveryUnit, String> {
}
