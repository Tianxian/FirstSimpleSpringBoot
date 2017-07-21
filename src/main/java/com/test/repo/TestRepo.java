package com.test.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.test.model.Test;

@Repository
public interface TestRepo extends PagingAndSortingRepository<Test, String>{

	List<Test> findByExDesc(String desc);
	Test findOne(String desc);
}
