public class SortingCheck{
public static boolean checkAsc(int[]arr){
boolean asc=true;
for(int i=0;i<arr.length-1;i++){
if(arr[i]>arr[i+1]){
asc=false;
break;}
}
return asc;

}
public static boolean  checkDesc(int []arr){
boolean desc=true;
for(int i=0;i<arr.length-1;i++){
if(arr[i]<arr[i+1]){
desc=false;
break;}
}
return desc;
}
public static void main(String[]args){
int arr[]={50,40,30,20,10};
if(checkAsc(arr)){
System.out.println("array in ascending order");
}
else if(checkDesc(arr)){
System.out.println("array in desc order");}
else{
System.out.println("random");
}

}}



