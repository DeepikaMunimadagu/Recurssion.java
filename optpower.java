class HelloWorld {
    public static int optpower(int a,int n){
        if(n==0){
            return 1;
        }
        int half = optpower(a,n/2)*optpower(a,n/2);
        if(n%2 != 0){
            half = a*half;
        }
        return half;
    }
    public static void main(String[] args) {
        int a=2;
        int n=5;
        System.out.println(optpower(a,n));
    }
}
