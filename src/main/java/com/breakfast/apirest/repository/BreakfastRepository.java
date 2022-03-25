package com.breakfast.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.breakfast.apirest.models.Breakfast;

public interface BreakfastRepository extends JpaRepository<Breakfast, Long>{

  Breakfast findById(long id);

} 