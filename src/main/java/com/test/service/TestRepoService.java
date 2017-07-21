package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.test.model.CrawlStatus;
import com.test.model.Test;
import com.test.repo.TestRepo;

@Service
public class TestRepoService {
	@Autowired 
	TestRepo testRepo;

	public Test findOneTestByDesc(String desc){
		return testRepo.findOne(desc);
	}
	
	public Test saveATest(Test test){
		return testRepo.save(test);
	}
	
	public Page<Test> getAllTest(Pageable pageable){
		return testRepo.findAll(pageable);
	}
	
	
	public void init(){
		Test test = new Test("testLoginOut1",100,0.8,CrawlStatus.procesed,"this is a test");
		saveATest(test);
	}
}
