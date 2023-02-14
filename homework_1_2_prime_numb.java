public class homework_1_2_prime_numb {
    public static void main(String[] args) {       
        for(int i = 1; i<=1000;i++){
            if (checkNumb(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean checkNumb(int n){
        for(int j = 2; j<n/2; j++){
            if(n % j==0){   
                return false;         
            } 
        }
        return true;
    }
}
