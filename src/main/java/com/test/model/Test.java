package com.test.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.test.model.CrawlStatus;

@Entity
public class Test {
	
	@Id
	String exDesc;
	int tcCount;
	double passPer;
	@Enumerated(EnumType.STRING)
	CrawlStatus crawlStatus;
	@Transient
	String testTransient;
	
	public Test(){}
	
	public Test(String exDesc, int tcCount, CrawlStatus status) {
		this.exDesc = exDesc;
		this.tcCount = tcCount;
		this.crawlStatus = status;
	}
	public Test(String exDesc, int tcCount, double passPer, CrawlStatus crawlStatus, String testTransient) {
		this.exDesc = exDesc;
		this.tcCount = tcCount;
		this.passPer = passPer;
		this.crawlStatus = crawlStatus;
		this.testTransient = testTransient;
	}
	public String getExDesc() {
		return exDesc;
	}
	public void setExDesc(String exDesc) {
		this.exDesc = exDesc;
	}
	public int getTcCount() {
		return tcCount;
	}
	public void setTcCount(int tcCount) {
		this.tcCount = tcCount;
	}
	public double getPassPer() {
		return passPer;
	}
	public void setPassPer(double passPer) {
		this.passPer = passPer;
	}
	public CrawlStatus getCrawlStatus() {
		return crawlStatus;
	}
	public void setCrawlStatus(CrawlStatus crawlStatus) {
		this.crawlStatus = crawlStatus;
	}
	
	public String getTestTransient() {
		return testTransient;
	}
	
	public void setTestTransient(String testTransient) {
		this.testTransient = testTransient;
	}
	
	@Override
	public String toString() {
		return this.exDesc+"\t"+this.tcCount+"\t"+this.passPer;
	}
	
	
	
}
