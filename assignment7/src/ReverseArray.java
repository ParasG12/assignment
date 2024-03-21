public class ReverseArray{
public static void main(String[]args){
int arr[]={10,20,30,40,50};
int n=arr.length;
int start=0;
int end=n-1;
for(int i=0;i<n/2;i++){
   int temp=arr[start];
arr[start]=arr[end];
arr[end]=temp;
start++;
end--;
}
for(int elem:arr){
System.out.println(elem);}
}
}