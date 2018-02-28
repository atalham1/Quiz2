package pkgCore;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarPaymentTest {

	@Test
	void testMonthlyPay() {
		
		double x = CarPayment.monthlyPayment(35000,60,.1);
		assertEquals(743.6465648943916,x);
	}
	
	@Test
	void testTotalInterest() {
		
		double x = CarPayment.monthlyPayment(35000,60,.1);
		double IR = CarPayment.totalInterest(35000,x,60);
		
		assertEquals(9618.793893663496,IR);
				
	}

}
