public class homework_1_1_nFactorial {
    public static void main(String[] args) {
    int n = lib.inputInt("Enter n: ");
    int nTri =n*(n+1)/2;
    System.out.println("n-triangular number = "+nTri);
    int nFactorial = 1;
    for (int i = 1; i<=n;i++){
        nFactorial=nFactorial*i;
    }
    System.out.println("n! = "+nFactorial);
    }
}
