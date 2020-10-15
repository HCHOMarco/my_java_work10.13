import java.util.Scanner;
public class book7_32 {
    public static int partition(int[] list){
        int p=list[0];
        int low=1;
        int high=list.length-1;
        while(low-high!=1){
            while((list[low]<=p)&&(low-high!=1)) {
                low++;
                if(low==list.length-1){
                    int tmp=list[0];
                    list[0]=list[low];
                    list[low]=tmp;
                    break;
                }
            }

            while((list[high]>p)&&(low-high!=1))high--;

            if((low-high==1)||(low==list.length-1))break;
            int tmp=list[low];
            list[low]=list[high];
            list[high]=tmp;
        }
        int tmp=list[high];
        list[high]=list[0];
        list[0]=tmp;
        for (int value : list) System.out.printf(" %d", value);
        System.out.println();
        return high;
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter list size: ");
        int n=kb.nextInt();
        int[] a=new int[n];
        System.out.print("Enter list content:");
        for(int i=0;i<n;i++)
            a[i]=kb.nextInt();
        System.out.print("After thr partition, the list is");
        int pos=partition(a);
    }
}