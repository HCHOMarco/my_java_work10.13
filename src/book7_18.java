import java.util.Scanner;
public class book7_18 {
    public static void main(String[] args) {
        double[] a=new double[11];
        Scanner kb=new Scanner(System.in);
        for(int i=0;i<10;i++){
            a[i]=kb.nextDouble();
        }
        for(int i=0;i<10;i++){
            for(int j=0;j<9;j++){
                if(a[j]>a[j+1]){
                    double tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
        for(int i=0;i<10;i++){
            System.out.print(a[i]+" ");
        }
    }
}
