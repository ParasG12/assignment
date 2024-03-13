import java.util.Scanner;
public class Calculator{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a and b");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("1:+");
System.out.println("2:-");
System.out.println("3:*");

char ch=sc.next().charAt(0);
int res=0;
switch(ch){
case '+':
res=a+b;
System.out.println("the add of 2 nos:"+res);
break;
case '-':
res=a-b;
System.out.println("the sub of 2 nos:"+res);
break;
case '*':
res=a*b;
System.out.println("the mul of 2 nos:"+res);
break;
default:
res=a/b;
System.out.println("the div of 2 nos:"+res);
break;}

}}

 