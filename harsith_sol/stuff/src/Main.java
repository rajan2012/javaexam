//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] a={2,0,4,3,8,10};

        int firstmax=Integer.MIN_VALUE;

        int secmax=Integer.MIN_VALUE;

        int thirdmax=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]>firstmax)
            {
                firstmax=a[i];
            }

             if(a[i]>secmax&&firstmax>a[i])
            {
                secmax=a[i];
            }
             if(a[i]>thirdmax&&firstmax>a[i]&&secmax>a[i])
            {
                thirdmax=a[i];
            }
        }

        System.out.println(firstmax+" "+secmax+" "+thirdmax);

    }
}