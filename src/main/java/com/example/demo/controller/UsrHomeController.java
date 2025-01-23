package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.Member;

@Controller
public class UsrHomeController {
	@RequestMapping("/usr/home/main")
	@ResponseBody
	public String showMain() {
		return "하이";
	}
	

	@RequestMapping("/usr/home/getInt")
	@ResponseBody
	public int getInt() {
		
		int a = 1;
		int b = 2;
		
		return a + b;
	}

	@RequestMapping("/usr/home/getString")
	@ResponseBody
	public String getString() {
		
		String str = "하이";
		
		return str;
		
	}

	@RequestMapping("/usr/home/getMap")
	@ResponseBody
	public HashMap<String, String> getMap() {
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("사는곳", "대전");
		
		return hm;
	}
	
	@RequestMapping("/usr/home/getList")
	@ResponseBody
	public ArrayList<String> getList() {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("안녕하세요");
		
		return list;
	}
	
	@RequestMapping("/usr/home/getBoolean")
	@ResponseBody
	public Boolean getBoolean() {
		
		Boolean a = true;
		
		return a;
	}
	
	@RequestMapping("/usr/home/getMember")
	@ResponseBody
	public Member getMember() {
		
		Member member = new Member();
		member.setName("노지혜");
		
		return member;
	}
}
