package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

/**
 * Test class for the Triangle implementation.
 */
public class TriangleTest {

    @Test
    public void test1() {
        Type actual = Triangle.classify(10, 10, 10);
        Type expected = EQUILATERAL;
        assertEquals(actual, expected);
    }
	
	@Test
    public void test2() {
        Type actual = Triangle.classify(10, 20, 30);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }
	
	@Test
    public void test3() {
        Type actual = Triangle.classify(20, 40, 30);
        Type expected = SCALENE;
        assertEquals(actual, expected);
    }
	
	@Test
    public void test4() {
        Type actual = Triangle.classify(20, 20, 30);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }
	
	@Test
	public void test5()
    {
        Type actual = Triangle.classify(-1, -1, -1);
        Type expected = INVALID;
        assertEquals(actual, expected);
        Type actual2 = Triangle.classify(1, -1, -1);
        Type expected2 = INVALID;
        assertEquals(actual, expected);
        Type actual3 = Triangle.classify(1, 1, -1);
        Type expected3 = INVALID;
        assertEquals(actual, expected);
    }
	
	@Test
    public void test6()
    {
        Type actual = Triangle.classify(1, 2, 5);
        Type expected = INVALID;
        assertEquals(actual, expected);
        Type actual2 = Triangle.classify(5, 1, 2);
        Type expected2 = INVALID;
        assertEquals(actual, expected);
        Type actual3 = Triangle.classify(1, 5, 2);
        Type expected3 = INVALID;
        assertEquals(actual, expected);
    }
	
	@Test
	public void test7()
    {
        Type actual = Triangle.classify(2, 2, 1);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }
	
	@Test
    public void test8()
    {
        Type actual = Triangle.classify(2, 1, 2);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }
	
	@Test
    public void test9()
    {
        Type actual = Triangle.classify(1, 2, 2);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }
   
	@Test
	 public void test10()
		{
			Triangle.Type a;
		}

	@Test
	public void test11()
		{
			new Triangle();
		}

	@Test
		public void test12()
		{
			Type actual = Triangle.classify(2, 2, 5);
			Type expected = INVALID;
			assertEquals(actual, expected);
		}

	@Test
		public void test13()
		{
			Type actual = Triangle.classify(2, 5, 2);
			Type expected = INVALID;
			assertEquals(actual, expected);
		}		


	@Test
		public void test14()
		{
			Type actual = Triangle.classify(5, 2, 2);
			Type expected = INVALID;
			assertEquals(actual, expected);
		}
		
	@Test 
		public void test15()
		{
		Type actual = Triangle.classify(0, 1, 1);
			Type expected = INVALID;
			assertEquals(actual, expected);	
		}
		
			
	@Test
		public void test16()
		{
			Type actual = Triangle.classify(1, 0, 1);
			Type expected = INVALID;
			assertEquals(actual, expected);
			
		}
		
	@Test
		public void test17()
		{
			Type actual = Triangle.classify(1, 1, 0);
			Type expected = INVALID;
			assertEquals(actual, expected);
			
		}

	@Test
		public void test19()
		{
			Type actual = Triangle.classify(-1, 1, 1);
			Type expected = INVALID;
			assertEquals(actual, expected);
			
		}

	@Test
		public void test20()
		{
			Type actual = Triangle.classify(1, -1, 1);
			Type expected = INVALID;
			assertEquals(actual, expected);
			
		}

	@Test
		public void test21()
		{
			Type actual = Triangle.classify(1, 1, -1);
			Type expected = INVALID;
			assertEquals(actual, expected);
			
		}
		
	@Test
		public void test22()
		{
			Type actual = Triangle.classify(10, 90, 10);
			Type expected = INVALID;
			assertEquals(actual, expected);
			
		}
		
	@Test
		public void test23()
		{
			Type actual = Triangle.classify(10, 10, 90);
			Type expected = INVALID;
			assertEquals(actual, expected);
			
		}
		
	@Test
		public void test24()
		{
			Type actual = Triangle.classify(90, 10, 10);
			Type expected = INVALID;
			assertEquals(actual, expected);
			
		}
	@Test
		public void test25()
		{
			Type actual = Triangle.classify(1, 2, 1);
			Type expected = INVALID;
			assertEquals(actual, expected);
			
		}

	@Test
		public void test26()
		{
			Type actual = Triangle.classify(3, 5, 2);
			Type expected = INVALID;
			assertEquals(actual, expected);
			
		}
	
	@Test
		public void test27()
		{
			Type actual = Triangle.classify(5, 3, 2);
			Type expected = INVALID;
			assertEquals(actual, expected);
			
		}
	@Test
		public void test28()
		{
			Type actual = Triangle.classify(5, 3, 1);
			Type expected = INVALID;
			assertEquals(actual, expected);
			
		}
		
	@Test
		public void test29()
		{
			Type actual = Triangle.classify(1, 9, 2);
			Type expected = INVALID;
			assertEquals(actual, expected);
			
		}

	@Test
		public void test30()
		{
			Type actual = Triangle.classify(4, 2, 2);
			Type expected = INVALID;
			assertEquals(actual, expected);
			
		}
	@Test
		public void test31()
		{
			Type actual = Triangle.classify(2, 2, 4);
			Type expected = INVALID;
			assertEquals(actual, expected);
			
		}

	}

