import java.util.Scanner;
public class book7_19 {
    public static boolean isSorted(int[] list){
        for(int i=1;i<list.length;i++){
            if(list[i]<list[i-1])return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter the size of of the list:");
        int n=kb.nextInt();
        int[] a=new int[n];
        System.out.print("Enter the size of of the list:");
        for(int i=0;i<n;i++){
            a[i]=kb.nextInt();
        }
        boolean f=isSorted(a);


        System.out.print("The list has "+n+" integers");
        for(int i=0;i<n;i++)
            System.out.print(" "+a[i]);
        System.out.println("");
        if(f)System.out.println("The list is already sorted");
        else System.out.println("The list is not sorted");
    }
}
