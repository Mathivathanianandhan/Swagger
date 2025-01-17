package com.postgres.checkingId.DTO;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder	
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class SampleDTO {
	  @NotBlank(message = "Invalid Name: Empty name")
	    @NotNull(message = "Invalid Name: Name is NULL")
	    @Size(min = 3, max = 30, message = "Invalid Name: Exceeds 30 characters")
	    private String name;

	    @Email(message = "Invalid email")
	    private String email;

	    @NotBlank(message = "Invalid Phone number: Empty number")
	    @NotNull(message = "Invalid Phone number: Number is NULL")
	    @Pattern(regexp = "^\\d{10}$", message = "Invalid phone number")
	    private String mobile;

	    @Min(value = 1, message = "Invalid Age: Equals to zero")
	    @Max(value = 100, message = "Invalid Age: Exceeds 100 years")
	    private int age;
}
