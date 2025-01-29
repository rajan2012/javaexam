public class Main2 {

    static int ds(int n)
    {
        if(n>0&&n<10)
        {
            return n;
        }
            return n%10+ds(n/10);
    }

    public static void main(String[] args) {

        int a=ds(7);

        System.out.println(a);
    }
}
