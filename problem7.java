package projecteuler;

public class problem7 {
    public static void main(String[]args){
        
        int number = 500000;
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
        long total=0;
        long a=0;
        int count1 = 1;
        for(int x=2; x<= number; x++){
            if(prime[x]){
                
                total += x;
                if(count1 == 10001){
                    a=x;
                }
                count1++;
                
            }
        }
        System.out.println("place 10001st : "+a);
        
    }
}
