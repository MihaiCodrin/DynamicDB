package com.tay.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tay.demo.dao.UserInfoRepository;
import com.tay.demo.entity.UserInfo;




@RestController
public class MainController {

	@Autowired
	private UserInfoRepository userInfoRepository;

	@GetMapping("/{id}")
	public UserInfo findById(@PathVariable Integer id) {
		UserInfo findOne = userInfoRepository.findById(id).get();
		return findOne;
	}
}
