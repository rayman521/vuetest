package com.example.demo.controller;


import java.sql.Date;
import java.util.List;

import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONObject;
import org.json.simple.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.userInfoDto;
import com.example.demo.mapper.MemberMapper;
import com.mysql.cj.log.Log;
import com.mysql.cj.xdevapi.JsonArray;

import lombok.RequiredArgsConstructor;


@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor
public class InfoController {
	@Autowired
	MemberMapper mapper;
	
	
	@PostMapping("/goLogin")
	public List<userInfoDto> getuserInfo(@RequestBody String userinfo){
	
		System.out.println("gdgdgd :: " + userinfo);
		System.out.println("gdgdgd :: " + userinfo);
		System.out.println("gdgdgd :: " + userinfo);
		
		JSONObject jsonObject = new JSONObject(userinfo);
		
		String id = (String) jsonObject.get("id");
		String password = (String) jsonObject.get("password");
		
		userInfoDto userInfoDto = new userInfoDto();
		
		userInfoDto.setId(id);
		userInfoDto.setPassword(password);
		
		return mapper.getUserList(userInfoDto);
	}
	
	@GetMapping("/test")
	public String test(){
	
		String test = "gdgd";
		
		
		return test;
	}
	

	@PostMapping("/insert")
	public void insert(@RequestBody String userinfo){
		
		System.out.println(userinfo);
		
		
		JSONObject jsonObject = new JSONObject(userinfo);
		
		String title = (String) jsonObject.get("id");
		String comment = (String) jsonObject.get("p");
		
		
		userInfoDto userInfoDto = new userInfoDto();
		
		userInfoDto.setId(title);
		userInfoDto.setPassword(comment);
		 
		mapper.insert(userInfoDto);
	
		  
	}
}