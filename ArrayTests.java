import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed3Inputs() {
    int[] input = {1, 2, 3};
    int[] temp = {1, 2, 3};

    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input));

    //Checks to make sure its a new array.
    assertArrayEquals(temp, input);
  }

  @Test
  public void testReserseInPlace3Inputs() {
    int[] input = {1, 2, 3};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{3, 2, 1}, input);
  }
}
