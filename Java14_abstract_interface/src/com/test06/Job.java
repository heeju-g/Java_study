package com.test06;

public interface Job {
	// JOB_ID변수에 IT넣어줌.
	//인터페이스 안에서의 변수는 자동으로 상수화 = static final(job_id)
	public String JOB_ID = "IT";
	public void jobLoc(String loc);

}
