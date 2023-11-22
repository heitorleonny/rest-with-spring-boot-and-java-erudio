package br.com.erudio;

import br.com.erudio.converters.NumberConverter;
import br.com.erudio.exceptions.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class SimpleMath {


    public Double sum(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;
    }
    public Double sub(Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }
    public Double mult(Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;
    }
    public Double divided(Double numberOne, Double numberTwo) {
        return numberOne / numberTwo;
    }

    public Double mean(Double numberOne, Double numberTwo) {
        return (numberOne + numberTwo) / 2;
    }
    public Double sqrt(Double numberOne) {
        return Math.sqrt(numberOne);
    }
}