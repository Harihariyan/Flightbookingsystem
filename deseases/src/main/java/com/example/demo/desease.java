package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class desease {
	@RequestMapping("/desease")
	public String deseases()
	{
		return "list of deseases";
	}

}
