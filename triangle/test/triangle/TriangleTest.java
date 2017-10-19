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
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }

@Test
	public void test13()
    {
        Type actual = Triangle.classify(2, 5, 2);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }		


@Test
	public void test14()
    {
        Type actual = Triangle.classify(5, 2, 2);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }	
}