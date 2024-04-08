package com.postgres.checkingId.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.postgres.checkingId.entity.Sample;

public interface SampleRepo extends JpaRepository<Sample, Integer> {

}
