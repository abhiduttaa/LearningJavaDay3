public class factorial {
    public static void main(String[] args){
        int f=1,n=5;
        while (n>0) {
            f=f*n;
            n=n-1;
        }
        System.out.println(f);
    }
}
