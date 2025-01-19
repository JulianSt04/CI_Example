import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    /* ToDo: insert a test here */
    int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,1237,991};
    for (int i=0; i<primes.length; i++){
    assertEquals("True if is Prime", true, PrimeCheck.isPrime(primes[i]));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    int[] nonPrimes = {4,6,10,450,333,256,144,18,100000,49,63};
    for (int i=0; i<nonPrimes.length; i++){
    assertEquals("False if is no Prime", false, PrimeCheck.isPrime(nonPrimes[i]));
    }
  }
}
