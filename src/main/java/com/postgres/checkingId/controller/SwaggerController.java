package com.postgres.checkingId.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.postgres.checkingId.entity.Swaggert;
import com.postgres.checkingId.service.SwaggerService;



@RestController
@RequestMapping("/api/swagger")
@Configuration
@Validated
public class SwaggerController {
	 @Autowired
	    private SwaggerService swaggerService;
	 @PostMapping("/create")
	 public Swaggert saveSwagger(@Valid @RequestBody Swaggert swaggert)
	 {
		 return swaggerService.saveSwagger(swaggert);
	 }
	 @GetMapping("/get")
	 public Swaggert findByEmail(@RequestParam String email) {
	        return swaggerService.findByEmail(email);
	    }
	 
}
