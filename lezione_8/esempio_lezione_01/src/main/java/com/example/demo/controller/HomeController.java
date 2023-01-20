package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "Benvenuti al corso Java Springboot!";
	}

	@RequestMapping("/demo")
	@ResponseBody
	public String demo() {
		return "Demo!";
	}

	@RequestMapping("/esempio")
	public String esempioView() {
		return "index";
	}

	@RequestMapping("/secondoesempio")
	public String secondoEsempioView() {
		return "second";
	}

	@RequestMapping("/lorenzo")
	public String lorenzoView() {
		return "lorenzo";
	}


    @RequestMapping("/edoardo")
    public String edoardoView() {
        return "edoardo";
    }

}
