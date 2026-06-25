import java.util.*;
public class TypeCasting{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double decimalValue = 56.00;
    int intValue = (int) decimalValue;
    int number = 25;
    double doubleValue = (double) number;
    System.out.println("Double value: " + decimalValue);
        System.out.println("After casting double to int: " + intValue);
        System.out.println("Integer value: " + number);
        System.out.println("After casting int to double: " + doubleValue);
  }
}