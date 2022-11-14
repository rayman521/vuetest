package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.userInfoDto;

@Mapper
public interface MemberMapper {

	public List<userInfoDto> getUserList(userInfoDto userInfoDto); //  유저정보 가져오기
		
	public void insert(userInfoDto userInfoDto); //  유저정보 가져오기
		
}
