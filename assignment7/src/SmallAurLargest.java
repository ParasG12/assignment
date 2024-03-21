public class SmallAurLargest{
public static void main(String[]args){
int arr[]={10,20,450,40,70};
int smallest=500;
int largest=-1;
for(int i=0;i<arr.length;i++){
if(arr[i]>largest){
if(smallest>largest && largest!=-1){
smallest=largest;
}
largest=arr[i];
}
else if(arr[i]<smallest && arr[i]<largest){
smallest=arr[i];
}

}
System.out.println("smallest and greatest are "+smallest+" "+largest);
}}