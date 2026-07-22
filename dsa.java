//trapped water question import java.util.*;
class first{
  public static int sd(int height[]){
//auxillary array
//left max
int n=height.length;
int lm[]=new int[n];
lm[0]=height[0];
for(int i=1;i<n;i++){
lm[i]=Math.max(height[i],lm[i-1]);
}

int rm[]=new int[n];
rm[n-1]=height[n-1];
for(int j=n-2;j>=0;j--){
  rm[j]=Math.max(height[j],rm[j+1]);
}
int tw=0;
for(int k=0;k<n;k++){
int wl=Math.min(lm[k],rm[k]);
//tw=wl-height
//a=a+tw
  tw=tw+wl-height[k];
}
return tw;
  }
public static void main(String args[]){
int height[]={5,4,3,2,1};
System.out.print(sd(height));
}

}  
////////////////////////////////////////////
//buy and sell stock 
import java.util.*;
class first{
 //buyand sell
 public static int bs(int price[]){
    int bp=Integer.MAX_VALUE;
    int P=Integer.MIN_VALUE;
    
    for(int i=0;i<price.length;i++){
        if(bp<price[i]){
        int   profit=price[i]-bp;
            P=Math.max(P,profit);
        }
        else{
            bp=price[i];
        }
    }
if(P==0){
    return 0;
}
else{
    return P;
}
 }

 public static void main(String args[]){
    int price[]={7,1,5,3,6,4};
    System.out.print(bs(price));
 }

} 
------------------------------------------------------------------
//Writeaprogramthatreadsasetofintegers,andthenprintsthesumoftheeven and odd integers
import java.util.*;
class p{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int odd=0,even=0;
    while(true){
        System.out.print("do you want to enter no 1/0 : ");
        int n=sc.nextInt();
        if(n==1){
        System.out.print("enter n : ");
        int i=sc.nextInt();
        if(i%2==0){
            even+=i;
        }
        else{
            odd+=i;
        }
        }
        else{
       System.out.println("odd : "+odd);
       System.out.println("even : "+even);
    //here if we don,t eiyr ext statment then it will start automatically 
    //even after stoping and add no in previous odd and even not a new no 
       System.exit(0);
               }
    }

        
    }
}
------------------------------------------------
//pattern problem 
/*  ****
    ***
    **
    *
*/
import java.util.*;
class p{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");

            }
        System.out.println();

           
        }
        
    }
}

-------------------------------------
//incorrect 0/1 triangle pattern
import java.util.*;
class p{
 public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         System.out.print("enter number : ");
        int n=sc.nextInt();
   
        for(int i=1;i<=n;i++){
               
            for(int j=1;j<=i;j++){
             
                int counter=1;
                if(i%2==0){
                   counter--;
                    System.out.print(counter + " ");
                
                }
                else{
                    
                    System.out.print(counter + " ");
                counter++;
                }
              
                
               
            }
 System.out.println();
            }
        

           
        }
        
    }
    ==============
       //one way
*****
****
***
**
*
public void pattern(int n){
    //outer
for(int i=1;i<=n;i++){
    //inner
    for(int j=n;j>=i;j--){
   System.out.print("*");
    }
    System.out.println();
}
}
//2nd way
public void pattern(int n){
    //outer
for(int i=1;i<=n;i++){
    
    for(int j=1;j<=n;j++){
   if(i+j<=n+1){
    System.out.print("*");
                
}
 else{
                    
 System.out.print("_");
                }

