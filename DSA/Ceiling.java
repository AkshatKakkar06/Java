package DSA;
import java.util.Scanner;

public class Ceiling {
    public static void main(String[] arg){
        findCeiling obj = new findCeiling();
        obj.find();
    }
}    

class findCeiling{
    private int a;
    private int[] arr={2,4,6,8,14,16,18};
    findCeiling(){
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
    }
     void find(){
        int s,e,m;
        s=0;
        e=arr.length-1;
        if(a>arr[e]){
            System.out.println("Ceiling isn't present");
            return;
        }
        while(s<=e){
            m=s+(e-s)/2;
            if(arr[m]==a){
                System.out.println("The ceiling:"+a);
                return;
            }
            else if(arr[m]<a){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        System.out.println("The ceiling:"+arr[s]);
    }  
}



     
 

