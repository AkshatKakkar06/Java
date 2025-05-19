class acc {

    public static void main(String[]  args){
        System.out.println("Working");
        // int fac =1;
        // for(int i=5; i>0;i--){
        //     fac*=i;
        // }
        // System.out.println(fac);
        System.out.println(fac1());
        System.out.println("Finsshed");
    }

    static int fac1 (){
        
        return 1*fac2();
    }
    
    static int fac2 (){
        
        return 2*fac3();
    }
    
    static int fac3 (){
        
        return 3*fac4();
    }
    
    static int fac4 (){
        
        return 4;
    }
}