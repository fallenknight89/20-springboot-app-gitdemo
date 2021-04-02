package com.boot.req.res.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootReqResApplication {

  private Map<String,Object> cache = new HashMap();
  private static final String REST_URL="https://www.equifax.com/getScores";

	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootReqResApplication.class, args);
	}

	//HIS-200 related changes
	public void doProcess() {
		//logic goes here
	}
	//HIS-200 related new changes
	public void doProcessTwo() {
		//logic goes here
	}
	//HIS-301 changes
	public void loadDataToCache(){
		//logic
	}


	public void developChange() {
	 // changes done in develop by another person
	}

}
