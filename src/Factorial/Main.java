package Factorial;

class Main {
    public static void main(String[] args){
        Main recur = new Main();
        var rec = recur.factorial(10);
        System.out.println(rec);

    }

    public int factorial(int n){
        if (n<0){
            return -1;
        }
        if (n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
