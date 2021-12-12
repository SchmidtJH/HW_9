package test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.Calculator;


class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		assertEquals(15,calculator.add(7, 8));	
		
	}

	@ParameterizedTest
	@CsvSource(value= {"7,8"})
	public void Should_add_two_numbers_and_return_result_parameterized(int valueOne, int valueTwo) {
		assertEquals(15, calculator.add(valueOne, valueTwo));
	}
	
	@Test
	public void Should_substract_two_numbers_and_return_result() {
		assertEquals(15,calculator.sub(23,8));
	}
	
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		assertEquals(150,calculator.multiply(10,15));
	}
	
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		assertEquals(15,calculator.divide(150,10));
	}
	
	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		Exception exception = assertThrows(ArithmeticException.class, () ->
        calculator.divide(0, 0));
    
	}
}
