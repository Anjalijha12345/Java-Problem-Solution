public class GCD {
    public static void main(String[] args) {
        gcd(270,192);

    }
    static void gcd(int x,int y)
    {
        int temp;
        while(y!=0)
        {
            temp=x%y;
            x=y;
            y=temp;
        }
        System.out.println(x);
    }
}
