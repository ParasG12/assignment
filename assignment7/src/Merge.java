public class Merge{
public static void main(String[]args){
 int arr1[]= {23,60,94,3,102};
 int arr2[]= {42,16,74};
int result[]=new int[arr1.length+arr2.length];
int start=0;
int start2=0;
int resultStart=0;
while(start<arr1.length && start2<arr2.length){
result[resultStart++]=arr1[start];
result[resultStart++]=arr2[start2];
start++;
start2++;
}
while(start<arr1.length){
result[resultStart++]=arr1[start];
start++;
}
while(start2<arr2.length){
result[resultStart++]=arr2[start2];
start2++;
}
for(int elem:result){
System.out.println(elem);}

}}

 