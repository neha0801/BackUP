import static org.junit.Assert.*;

import org.junit.Test;


public class CalcTest {

	@Test
	public void test_addition() {
		System.out.println("testing add fuction");
		Calculator C = new Calculator();
		assertTrue(C.addition(1.25,1.75)==3.0);
	}
	
	@Test
	public void test_subtraction() {
		System.out.println("testing subtraction fuction");
		Calculator C = new Calculator();
		assertTrue(C.subtraction(3.25,1.25)==2.00);
	}
	
	@Test
	public void test_multiplication() {
		System.out.println("testing multiplication fuction");
		Calculator C = new Calculator();
		assertTrue(C.multiplication(33,3)==99);
	}
	
	@Test
	public void test_divison() {
		System.out.println("testing division fuction");
		Calculator C = new Calculator();
		assertTrue(C.division(120,10)==12.0);
	}
	
	@Test
	public void test_modulus() {
		System.out.println("testing modulus fuction");
		Calculator C = new Calculator();
		assertTrue(C.modulus(100, 3)==1);
	}

}
