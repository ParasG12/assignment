
import java.util.Scanner;
public class BMIChecker{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter weight and height");
double weight=sc.nextDouble();
double height=sc.nextDouble();
double Bmi=weight/(height*height);
if(Bmi<18.5){
System.out.println("under weight");}
else if(Bmi>=18.5 && Bmi <24.9){
System.out.println("normal weight");}
else if(Bmi>=25 && Bmi <29.9){
System.out.println("over weight");}
else{
System.out.println("Obesity");}




}}


