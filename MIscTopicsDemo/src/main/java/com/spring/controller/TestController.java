//package com.spring.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.spring.dto.DBConfig;

//@RestController
//public class TestController {
//
//	@Value("${sring.application.name}")
//	String appName;
//	
//	@Autowired
//	String dbConfig;
//	
//	@GetMapping(value="/dbconfig")
//	public String getDbConfig() {
//		return this.dbConfig;
//	}
//	
//	@GetMapping(value="/appname")
//	public String getAppName() {
//		return this.appName;
//	}
//	
//	/*PATH Parameter based API versioning*/
//	@GetMapping(value="/api/contact/v1", produces=MediaType.APPLICATION_JSON_VALUE)
//	public Contact getContact() {
//		return new Contact("Tom", 12345);
//	}
//	
//	@GetMapping(value="/api/contact/v2", produces=MediaType.APPLICATION_JSON_VALUE)
//	public Contact getContact2() {
//		return new ContactV2("Tom", 12345);
//	}
//	
//	/*Query Request Parameter based API versioning*/
//	/*PATH Parameter based API versioning*/
//	
//	
//	@GetMapping(value="/api/contact", produces=MediaType.APPLICATION_JSON_VALUE)
//	public Contact getContactV2() {
//		return new Contact("Tom", 12345);
//	}
//	
//
//}
