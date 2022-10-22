package com.hendisantika.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.hendisantika.entity.Seance;

@Service
public class SeanceService extends AbstractService<Seance> {
	
	@Override
	protected JpaRepository<Seance, Long> getRepository() {
		// TODO Auto-generated method stub
		return null;
	}

}
