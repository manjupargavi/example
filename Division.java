import java.util.Scanner;
class ArraySizeException extends Exception{
public ArraySizeException(String message){
super(message);
}
}
class DivisorZeroException extends ArithmeticException{
public DivisorZeroException(String message){
super(message);
}
}
public class Division{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
int[] numbers = new int[2];
try{
for(int i=0;i<2;i++){
numbers[i]=scanner.nextInt();
}
if(numbers.length<2){
throw new ArraySizeException("Two arguments must be provided");
}
else if(numbers[1]==0){
throw new DivisorZeroException("Divisor should be non zero");
}
else
{
int result = numbers[0]/numbers[1];
System.out.println("Result of division is "+ result);
}
}
catch (ArraySizeException e){
System.out.println(e.getMessage());
}
catch (DivisorZeroException e){
System.out.println(e.getMessage());
}
catch (ArithmeticException e){
System.out.println("Division by zero error");
}
}
}