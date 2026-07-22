import java.util.*;
class p{
   //one way
public void pattern(int n){
    //outer
for(int i=1;i<=n;i++){
    
    for(int j=1;j<=n;j++){
   if(i-j>=0){
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


