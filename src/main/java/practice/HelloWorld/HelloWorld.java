package practice.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorld {
	@RequestMapping("/")
	String hello() {
		return "Hello world Ketan Singh";
	}
	public static void main(String args[]) {
		SpringApplication.run(HelloWorld.class, args);
	}

}
