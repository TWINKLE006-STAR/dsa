import java.util.*;
class p{
public void pattern(int n){
    //outer
for(int i=1;i<=n;i++){
    //inner
    for(int j=1;j<=n;j++){
     if(j<=i){
        System.out.print("*");

     }   
     else{
        System.out.print("_");

     }
    }
    System.out.println();
}
}

 public static void main(String a[]){
    p obj=new p();
    obj.pattern(5);   
 
 }
}


