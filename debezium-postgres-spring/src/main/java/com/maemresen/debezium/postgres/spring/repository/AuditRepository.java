package com.maemresen.debezium.postgres.spring.repository;

import com.maemresen.debezium.postgres.spring.entity.Audit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditRepository extends JpaRepository<Audit, Long> {
}
