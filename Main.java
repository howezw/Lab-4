/*Lab 4 
Zachary Howe, Luke Greely, Kyle Troyer
February 2 2021 */ 
import java.util.Random;
class Main {
  public static void main(String[] args) {
    Random r = new Random();
    int randomNum = r.nextInt(50) + 1;
    System.out.println("The Random Number is:" + randomNum);

    for (int count = randomNum; count >= 0; count--) 
    {System.out.println(count);
    }
    if (randomNum <= 15) {
      System.out.println("Ahoy Mateys!");
       }
    else if (randomNum > 20 && randomNum <42){
      System.out.println("Cannonball!");

    }
    else {
      System.out.println("Look, A Sea Shanty!");
    }
  }
}