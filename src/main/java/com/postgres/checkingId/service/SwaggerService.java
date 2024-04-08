package com.postgres.checkingId.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postgres.checkingId.entity.Swaggert;
import com.postgres.checkingId.repo.SwaggerRepo;

@Service
public class SwaggerService {
	 @Autowired
	    private SwaggerRepo swaggerRepo;


	    public Swaggert findByEmail(String email) {
	        return swaggerRepo.findByEmail(email);
	    }

		public Swaggert saveSwagger(@Valid Swaggert swaggert) {
			
			return swaggerRepo.saveAndFlush(swaggert);
		}
}
