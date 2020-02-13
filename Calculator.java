public class Calculator{
  //constructor
  Calculator(){

  }
  //to add
  public int add(int a, int b){
    return a + b;
  }
  //to subtract
  public int subtract(int a, int b){
    return a - b;
  }
  //to multiply
  public int multiply(int a, int b){
    return a * b;
  }
  //to divide
  public int divide(int a, int b){
    return a / b;
  }
  //to find remainder
  public int modulo(int a, int b){
   return a % b;
  }
  //to calculate using above classes
  public static void main(String args[]){
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.subtract(45, 11));
  }
}
