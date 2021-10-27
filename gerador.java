import java.util.concurrent.ThreadLocalRandom;
class Aleatorio {
    public static void main( String args[] ) {
      int int_random = ThreadLocalRandom.current().nextInt();  
  
      System.out.println("Aleatoriedade nos Integers: " + int_random); 

      double double_rand = ThreadLocalRandom.current().nextDouble(); 
  
      System.out.println("Aletoriedade dupla: " + double_rand); 
      boolean boolean_rand = ThreadLocalRandom.current().nextBoolean(); 
      
      System.out.println("Aleatoriedade Booleana: " + boolean_rand); 
    }
}