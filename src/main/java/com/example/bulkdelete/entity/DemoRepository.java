package com.example.bulkdelete.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface DemoRepository extends JpaRepository<Demo, Integer> {

    @Transactional
    @Modifying
    @Query("DELETE from Demo d where d.id =?1")
    void deleteById(Long id);
}
