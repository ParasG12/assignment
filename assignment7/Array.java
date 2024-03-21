public class Array{
public static void main(String[]args){
int arr[]={24,54,31,16,82,45,67};
int firstMax=-1;
int secondMax=-1;
int thirdMax=-1;
for(int i=0;i<arr.length;i++){
if(arr[i]>firstMax){
secondMax=firstMax;
firstMax=arr[i];

}
 else if(arr[i]>secondMax ){
thirdMax=secondMax;
secondMax=arr[i];}


 else if(arr[i]>thirdMax){
thirdMax=arr[i];}
}
System.out.println("third max "+thirdMax);



}
}