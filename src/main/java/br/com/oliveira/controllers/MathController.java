package br.com.oliveira.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.oliveira.SimpleMath;

@RestController
public class MathController {
	SimpleMath math = new SimpleMath();
	

	@GetMapping("/sum")
	public String sum2() {
		return "Digite os valores a serem somados, ex: sum/10/5 = soma de 10 + 5";
	}
	
	@GetMapping("/sum/{num1}/{num2}")
	public Double sum(
			@PathVariable Double num1,
			@PathVariable Double num2
			) {
		
		return math.sum(num1, num2);
	}

	
	@GetMapping("/subtraction/{num1}/{num2}")
	public Double subtraction(
			@PathVariable Double num1,
			@PathVariable Double num2
			) {
		
		return math.subtraction(num1, num2);
	}

	
	@GetMapping("/multiplication/{num1}/{num2}")
	public Double multiplication(
			@PathVariable Double num1,
			@PathVariable Double num2
			) {
		
		return math.multiplication(num1, num2);
	}

	
	@GetMapping("/division/{num1}/{num2}")
	public Double division(
			@PathVariable Double num1,
			@PathVariable Double num2
			) {
		
		return math.division(num1, num2);
	}

	
	@GetMapping("/mean/{num1}/{num2}")
	public Double mean(
			@PathVariable Double num1,
			@PathVariable Double num2
			) {
		
		return math.mean(num1, num2);
	}

	
	@GetMapping("/squareRoot/{num1}")
	public Double squareRoot(
			@PathVariable Double num1
			) {
		
		return math.squareRoot(num1);
	}
	
	


}
