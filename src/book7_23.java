import java.util.Scanner;
public class book7_23 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int[] a=new int[110];
        for(int i=0;i<=100;i++){
            a[i]=1;
        }
        for(int i=1;i<=100;i++){
            for(int j=i;j<=100;j+=i){
                a[j]=-1*a[j];
            }
        }
        for(int i=1;i<=100;i++){
            if(a[i]==-1)
                System.out.print(i+" ");
        }
    }
}
