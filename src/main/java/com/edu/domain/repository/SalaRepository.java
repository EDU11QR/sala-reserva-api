package com.edu.domain.repository;

import com.edu.domain.model.SalaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaRepository  extends JpaRepository<SalaEntity, Long> {
}
