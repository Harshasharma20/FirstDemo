package com.demo.firstdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.firstdemo.model.FirstDemoModel;

@Controller
@RequestMapping("/demo")
public class FirstDemoController {
	
	
//PostMapping -- ADD DATA
//GetMapping -- FETCH DATA 
//RequestMapping -- map request to controller
//ResponeBody
//RestController
//PathVariable

	
	
	@PostMapping("/addData")
	public String addData(@RequestBody FirstDemoModel firstDemoModel ) {
		String data = firstDemoModel.getGreeting() + firstDemoModel.getName();
		System.out.println("data");
		return data; //hhtml page as controller return static page 
		//rest controller looking for JSON Data
	}
	
	@GetMapping("/getData/{message}")
	public String getData(@PathVariable String message, FirstDemoModel firstDemoModel) {
		return "firstDemoModel";
	}
	
	/*
	 * @GetMapping("/info")
	 * 
	 * @ResponseBody public String getInfo() { System.out.println("info"); return
	 * "info"; }
	 */
	

}
