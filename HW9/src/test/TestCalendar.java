package test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.Calendar;

class TestCalendar {

	@ParameterizedTest
	@ValueSource(ints= {1996,2000,2004,2008,2012})
	public void Should_return_true(int year) {
		Calendar calendar = new Calendar(year);
		assertTrue(calendar.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints= {1995,2001,2005,2009,2013})
	public void Should_return_false(int year) {
		Calendar calendar = new Calendar(year);
		assertFalse(calendar.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource()
	public void Should_return_if_year_is_leap(int year) {
		// Implement
	}

	// Create a new method for boundary testing
}
