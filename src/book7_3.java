import java.util.Scanner;
public class book7_3 {
    public static void main(String[] args) {
        System.out.print("Enter the number between 1 and 100");
        Scanner kb =new Scanner(System.in);
        int[] a=new int[110];
        while(true){
            int n=kb.nextInt();
            if(n==0)break;
            a[n]++;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                if(a[i]==1){
                    System.out.println(i+" occurs "+a[i]+" time");
                }else{
                    System.out.println(i+" occurs "+a[i]+" times");
                }
            }
        }
    }
}
