package com.alkemy.ong.repository;

import com.alkemy.ong.models.entity.SlideEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlideRepository extends JpaRepository<SlideEntity, Long> {

    boolean existsBySlideOrder(Integer order);
}
