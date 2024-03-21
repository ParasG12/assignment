public class EqualityChecker{
public static void main(String[]args){
int arr1[]={1,2,3,4,5};
int arr2[]={10,11,12,13,14,15};
if(arr1==null || arr2==null){
System.out.println("not equal");}
else if(arr1==arr2){
System.out.println("array equal as ref is equal");
}
else{
if(arr1.length!=arr2.length){
System.out.println("not equal as both are diff in size");
}
else{
boolean b=true;
for(int i=0;i<arr1.length;i++){
if(arr1[i]!=arr2[i]){
b=false;
break;
}}
 if(b){System.out.println("equal");}
else{System.out.println("not equal");}

}
}
}
}