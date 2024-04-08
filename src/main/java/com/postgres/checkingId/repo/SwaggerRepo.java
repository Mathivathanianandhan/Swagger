package com.postgres.checkingId.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.postgres.checkingId.entity.Swaggert;
@Repository
public interface SwaggerRepo extends JpaRepository<Swaggert, Long> {
	@Query(value="select * from swaggers as s where s.email=:e",nativeQuery = true)
	Swaggert findByEmail(@Param("e") String  email);

}
