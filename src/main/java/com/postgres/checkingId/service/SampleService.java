package com.postgres.checkingId.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;

import com.postgres.checkingId.DTO.SampleDTO;
import com.postgres.checkingId.entity.Sample;
import com.postgres.checkingId.repo.SampleRepo;

@Service
public class SampleService {
	
	@Autowired
	private SampleRepo sampleRepo;
	 public List<Sample> getUsers() {
	        return sampleRepo.findAll();
	    }
//	 public Sample saveUser(SampleDTO sampleDTO) {
//		    Sample sample = Sample.builder()
//		            .name(sampleDTO.getName())
//		            .email(sampleDTO.getEmail())
//		            .mobile(sampleDTO.getMobile())
//		            .age(sampleDTO.getAge())
//		            .build();
//		    return sampleRepo.save(sample);
//		}

	 public Sample saveUser(SampleDTO sampleDTO) {
		 Sample sample =Sample.build(0,sampleDTO.getName(),sampleDTO.getEmail(),sampleDTO.getMobile(),sampleDTO.getAge());
		 //Sample savedSample = sampleRepo.save(sample);
		 return sampleRepo.save(sample);
	    }
//	 public Sample saveUser(SampleDTO sampleDTO) {
//		 Sample user = Sample.builder()
//	            .name(sampleDTO.getName())
//	            .email(sampleDTO.getEmail())
//	            .mobile(sampleDTO.getMobile())
//	            .age(sampleDTO.getAge())
//	        .build();
//	        return sampleRepo.save(user);
//	    }

	    public void deleteAllUsers() {
	    	sampleRepo.deleteAll();
	    }

	    public void saveAllUsers(List<Sample> users) {
	    	sampleRepo.saveAll(users);
	    }

		public Object saveUser(SampleService sampleService) {
			// TODO Auto-generated method stub
			return null;
		}

		
	

}
