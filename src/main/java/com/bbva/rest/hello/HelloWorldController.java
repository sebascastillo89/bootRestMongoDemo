package com.bbva.rest.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bbva.i18n.Hello;
import com.bbva.i18n.HelloRepository;

@RestController
public class HelloWorldController {

	@Autowired
	HelloRepository helloRepository;
	
	@RequestMapping("greeting")
	public Greeting greeting(@RequestParam(value="name", defaultValue="World!") String name, @RequestParam(value="lang", defaultValue="en")String lang){
		
		Hello hello = helloRepository.findByLang(lang);
		String greetingContent = hello != null ? hello.getStr() : "Hello";
		Greeting greeting = new Greeting();
		greeting.setContent(greetingContent + " " + name + "!!!");
		return greeting;
	}
}
