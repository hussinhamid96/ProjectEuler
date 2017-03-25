package projecteuler;

public class problem7 {
    public static void main(String[]args){
        
        int number = 200000;
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
       
        int a=0;
        int count = 1;
        for(int x=2; x<= number; x++){
            if(prime[x]){
                
                if(count == 10001){
                    a=x;
                }
                count++;
                
            }
        }
        System.out.println("place 10001st : "+a);
        
    }
}
