import java.util.Scanner;
public class book7_31 {
    public static int[]merge(int[] list1,int[] list2) {
        int[] res=new int[list1.length+list2.length];
        System.arraycopy(list1, 0, res, 0, list1.length);
        System.arraycopy(list2, 0, res, list1.length, list2.length);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res.length-1;j++){
                if(res[j+1]<res[j]){
                    int tmp=res[j+1];
                    res[j+1]=res[j];
                    res[j]=tmp;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);

        System.out.print("Enter list1 size and contents: ");
        int n;
        n=kb.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=kb.nextInt();

        System.out.print("Enter list2 size and contents: ");
        n=kb.nextInt();
        int[] b=new int[n];
        for(int i=0;i<n;i++)
            b[i]=kb.nextInt();

        System.out.print("The merge list is");
        int[] res=merge(a,b);
        for (int re : res) System.out.printf(" %d", re);
    }
}