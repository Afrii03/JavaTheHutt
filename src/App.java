  import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception { 
    Scanner scanner = new Scanner(System.in);
    boolean d =(false);
    int proba = 1;
    int random = (int)(Math.random() * 101);
    System.out.println("Podaj liczbe");
    int a = scanner.nextInt();

    while(proba < 6){
    if(a == random){
    System.out.println("Brawo");
    d =true;
    break;
    }else if(a < random){
      System.out.println("Podałes za niska liczbe");
    }else{
      System.out.println("podałes za wysoka liczbe");
      

        
      }
      proba++;
      

    } 
    if(d){
      System.out.println("Brawo wygrałes");
    }else{
      System.out.println("Niestety przegrałes/as");
    }

   
  
  }
}