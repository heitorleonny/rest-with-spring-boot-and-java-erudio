package br.com.erudio.controllers;

import java.util.concurrent.atomic.AtomicLong;

import br.com.erudio.SimpleMath;
import br.com.erudio.converters.NumberConverter;
import br.com.erudio.exceptions.UnsupportedMathOperationException;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;



@RestController
public class MathController {
	private static final AtomicLong counter = new AtomicLong();

	private SimpleMath math = new SimpleMath();
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
	) throws Exception {
				 if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ){
					 throw new UnsupportedMathOperationException("Please set a numeric value");
				 }
		return  math.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sub(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
	) throws Exception {
				 if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ){
					 throw new UnsupportedMathOperationException("Please set a numeric value");
				 }
		return  math.sub(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}

	@RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mult(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
	) throws Exception {
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) ){
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return math.mult(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}

	@RequestMapping(value = "divided/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public double divided(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
	) throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Pleas set a numeric value");
		}
		return math.divided(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	@RequestMapping(value = "mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public double avarage(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
	) throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Pleas set a numeric value");
		}
		return math.mean(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	@RequestMapping(value = "sqrt/{numberOne}", method = RequestMethod.GET)
	public double sqrt(
			@PathVariable(value = "numberOne") String numberOne
	) throws Exception {
		if (!NumberConverter.isNumeric(numberOne)){
			throw new UnsupportedMathOperationException("Pleas set a numeric value");
		}
		return math.sqrt(NumberConverter.convertToDouble(numberOne));
	}






}
