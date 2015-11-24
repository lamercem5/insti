import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class YearUtilitiesTest {

	public boolean isLeap(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}

	}

	@Test
	public void test1() {
		try {
			assertEquals(true, isLeap(4));
		} catch (Exception e) {
			fail();
		}
	}

	@Test
	public void test2() {
		try {
			assertEquals(false, isLeap(3));
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void test3() {
		try {
			assertEquals(false, isLeap(100));
		} catch (Exception e) {
			fail();
		}
	}

	@Test
	public void test4() {
		try {
			assertEquals(false, isLeap(300));
		} catch (Exception e) {
			fail();
		}
	}
	@Test
	public void test5() {
		try {
			assertEquals(true, isLeap(400));
		} catch (Exception e) {
			fail();
		}
	}
	
}
