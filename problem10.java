package projecteuler;

public class problem10 {
       public static void main(String[]args){
           
           int number = 3000000;
        boolean prime[] = new boolean[number+1];
        
        for(int x=2; x<=number; x++){
            prime[x] = true;
        }
        
        for(int x=2; x*x<=number; x++){
            if(prime[x]){
                for(int y=x; y*x<=number; y++){
                         prime[y*x] = false;
                }
            }
        }
        long sumprime=0;
        int x=2;
        while(x < 2000000){
            
            if(prime[x] == true){
                sumprime += x;
            }
            x++;
            
        }
        System.out.println(sumprime);
           
       }
}
