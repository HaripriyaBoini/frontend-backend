package com.hms.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Myrepo8 extends JpaRepository<Searchmodel8, Integer> {
	Searchmodel8 findByMobilenumber(String mobileNumber);
}
