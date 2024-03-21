package p1.p2;
public class FindPairs{
public static void main(String[]args){
int arr[]={10,20,30,40,50};
int sum=50;
int first=0;
int second=1;
for(int i=0;i<arr.length-1;i++){
   for(int j=i+1;j<arr.length;j++){
if(arr[i]+arr[j]==sum){
System.out.println(arr[i]+" "+arr[j]);
}
}
}
}}