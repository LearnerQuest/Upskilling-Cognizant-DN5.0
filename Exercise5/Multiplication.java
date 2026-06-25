import java.util.*;
public class Multiplication{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0; i<=10; i++){
      int result = i*n;
      System.out.println( n + " x " + i + " = " + result);
    }
    

  }
}