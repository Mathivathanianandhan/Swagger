package com.postgres.checkingId.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.postgres.checkingId.DTO.SampleDTO;
import com.postgres.checkingId.entity.Sample;
import com.postgres.checkingId.service.SampleService;

@RestController
@RequestMapping("/api/sample")

public class SampleController {
	
	@Autowired
	private SampleService sampleService;
	   @GetMapping("/get")
	    public ResponseEntity<List<Sample>> getAllUsers() {
	        return ResponseEntity.ok().body(sampleService.getUsers());
	    }

//	    @GetMapping(path = "/users/{id}")
//	    public ResponseEntity<Sample> getUserByIdPath(@PathVariable Long id) {
//	        return ResponseEntity.ok().body(sampleService.getUserById(id));
//	    }
//
//	    @GetMapping(path = "/usersById")
//	    public ResponseEntity<Sample> getUserByIdParam(@RequestParam Long id) {
//	        return ResponseEntity.ok().body(sampleService.getUserById(id));
//	    }

	    @PostMapping("/users")
	    public ResponseEntity<Sample> saveUser(@RequestBody @Valid SampleDTO sampleDTO) {
	    	 return new ResponseEntity<>(sampleService.saveUser(sampleDTO), HttpStatus.CREATED);
	    }

	
	
	

}
