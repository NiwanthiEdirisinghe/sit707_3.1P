package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Niwanthi Edirisinghe
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = null;
		Assert.assertNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Niwanthi";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		DateUtil date = new DateUtil(1, 1, 2024); // January 1, 2024
	    System.out.println("testMinJanuary1ShouldIncrementToJanuary2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		DateUtil date = new DateUtil(1, 1, 2024); // January 1, 2024
	    System.out.println("testMinJanuary1ShouldDecrementToDecember31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(2023, date.getYear());
	}
	
	/*
	 * Write tests for rest months of year 2024.
	 */
	@Test
	public void test1A() {
	    DateUtil date = new DateUtil(1, 6, 1994);
	    date.decrement();
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(5, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void test2A() {
	    DateUtil date = new DateUtil(2, 6, 1994);
	    date.decrement();
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void test3A() {
	    DateUtil date = new DateUtil(15, 6, 1994);
	    date.decrement();
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void test4A() {
	    DateUtil date = new DateUtil(30, 6, 1994);
	    date.decrement();
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test(expected = RuntimeException.class)
	public void test5A() {
	    new DateUtil(31, 6, 1994);
	}

	@Test
	public void test6A() {
	    DateUtil date = new DateUtil(15, 1, 1994);
	    date.decrement();
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void test7A() {
	    DateUtil date = new DateUtil(15, 2, 1994);
	    date.decrement();
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void test8A() {
	    DateUtil date = new DateUtil(15, 11, 1994);
	    date.decrement();
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void test9A() {
	    DateUtil date = new DateUtil(15, 12, 1994);
	    date.decrement();
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void test10A() {
	    DateUtil date = new DateUtil(15, 6, 1700);
	    date.decrement();
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1700, date.getYear());
	}

	@Test
	public void test11A() {
	    DateUtil date = new DateUtil(15, 6, 1701);
	    date.decrement();
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1701, date.getYear());
	}

	@Test
	public void test12A() {
	    DateUtil date = new DateUtil(15, 6, 2023);
	    date.decrement();
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2023, date.getYear());
	}

	@Test
	public void test13A() {
	    DateUtil date = new DateUtil(15, 6, 2024);
	    date.decrement();
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void test1B() {
	    DateUtil date = new DateUtil(1, 6, 1994);
	    date.increment();
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void test2B() {
	    DateUtil date = new DateUtil(2, 6, 1994);
	    date.increment();
	    Assert.assertEquals(3, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void test3B() {
	    DateUtil date = new DateUtil(15, 6, 1994);
	    date.increment();
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void test4B() {
	    DateUtil date = new DateUtil(30, 6, 1994);
	    date.increment();
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(7, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test(expected = RuntimeException.class)
	public void test5B() {
	    new DateUtil(31, 6, 1994);
	}

	@Test
	public void test6B() {
	    DateUtil date = new DateUtil(15, 1, 1994);
	    date.increment();
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void test7B() {
	    DateUtil date = new DateUtil(15, 2, 1994);
	    date.increment();
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void test8B() {
	    DateUtil date = new DateUtil(15, 11, 1994);
	    date.increment();
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void test9B() {
	    DateUtil date = new DateUtil(15, 12, 1994);
	    date.increment();
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void test10B() {
	    DateUtil date = new DateUtil(15, 6, 1700);
	    date.increment();
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1700, date.getYear());
	}

	@Test
	public void test11B() {
	    DateUtil date = new DateUtil(15, 6, 1701);
	    date.increment();
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1701, date.getYear());
	}

	@Test
	public void test12B() {
	    DateUtil date = new DateUtil(15, 6, 2023);
	    date.increment();
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2023, date.getYear());
	}

	@Test
	public void test13B() {
	    DateUtil date = new DateUtil(15, 6, 2024);
	    date.increment();
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}
	
	//leap year
	@Test
	public void testLeapYearFebruary29ShouldIncrementToMarch1() {
	    DateUtil date = new DateUtil(29, 2, 2020);
	    date.increment();
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	    Assert.assertEquals(2020, date.getYear());
	}

	@Test
	public void testLeapYearFebruary28ShouldIncrementToFebruary29() {
	    DateUtil date = new DateUtil(28, 2, 2020);
	    date.increment();
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(2020, date.getYear());
	}

	@Test
	public void testLeapYearFebruary28ShouldDecrementToFebruary27() {
	    DateUtil date = new DateUtil(28, 2, 2020);
	    date.decrement();
	    Assert.assertEquals(27, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(2020, date.getYear());
	}

	@Test(expected = RuntimeException.class)
	public void testLeapYearFebruary29InvalidYearShouldThrowException() {
	    new DateUtil(29, 2, 2021); // 2021 is not a leap year
	}
}
