import java.util.Scanner;
public class book7_5 {
    public static void main(String[] args) {
        int[] a=new int[11];
        System.out.print("Enter 10 numbers:");
        Scanner kb=new Scanner(System.in);
        int cnt=0;
        for(int i=0;i<10;i++){
            int n=kb.nextInt();
            int f=0;
            for(int j=0;j<i;j++){
                if(n==a[j]) {
                    f = 1;
                    break;
                }
            }
            if(f==0)a[cnt++]=n;
        }
        System.out.println("The number of distinct numbers is "+cnt);
        System.out.print("The distinct numbers are:");
        for(int i=0;i<cnt;i++){
            System.out.print(" "+a[i]);
        }
    }
}
