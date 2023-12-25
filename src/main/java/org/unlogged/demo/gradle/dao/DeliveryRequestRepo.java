package org.unlogged.demo.gradle.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.unlogged.demo.gradle.models.DeliveryRequest;

//@Repository
public interface DeliveryRequestRepo extends JpaRepository<DeliveryRequest, Integer> {
    @Query(value = "SELECT MAX(deliveryid) FROM DeliveryRequest", nativeQuery = true)
    long getLastId();
}
