
import java.util.Scanner;
public class VowelChecker{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the charcter");
char ch=sc.next().toUpperCase().charAt(0);
if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
System.out.println("character is vowel "+ch);
}
else{
System.out.println("character is not vowel"+ch);
}

}}