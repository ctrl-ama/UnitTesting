import org.junit.*;

public class Mathstest {

    Maths maths;

    @before
    public void setUp(){
        maths = new Maths();
    }

  //  @Test
 //   public void checkTheSumOfTwoNumbers(){
    //    int result = maths.addTwoNumbers(2,3);
      //  Assert.assertEquals();

    @Test
    public void checkIfPrime()
    {
        Assert.assertEquals(3,maths.addTwoNumbers(5,4));
    }

    @Test
    public void checkIfPrimeAgain(){
        Assert.assertEquals(3,maths.addTwoNumbers(1,2));

    }


    @Test
    public void checkIfPrime(){
        Assert.assertTrue(maths.)
    }



}
