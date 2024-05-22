package com.hms.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Search1repo extends JpaRepository<Searchmodel, Integer> {

}

