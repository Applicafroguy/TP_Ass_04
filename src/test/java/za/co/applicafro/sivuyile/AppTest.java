package za.co.applicafro.sivuyile;

import org.junit.Assert;
import org.junit.Test;

public class AppTest
{
  @Test
    public void testInheritance(){
      Dog dog = new Dog(2,2,2,2,true);

      Assert.assertTrue(dog.isCanBuck());
  }
}
