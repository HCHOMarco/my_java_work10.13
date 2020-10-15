import java.util.Scanner;
class info{
    String name;
    int mark;
}
public class book7_17 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        info[] node=new info[110];
        for(int i=0;i<n;i++){
            //node[i]=new info();
            node[i].name=kb.next();
            node[i].mark=kb.nextInt();
        }
        for(int i=0;i<n;i++){
            int maxp=i;
            for(int j=i+1;j<n;j++){
                if(node[j].mark>node[maxp].mark){
                    maxp=j;
                }
            }
            int tmp=node[i].mark;
            node[i].mark=node[maxp].mark;
            node[maxp].mark=tmp;
            String tmpex=node[i].name;
            node[i].name=node[maxp].name;
            node[maxp].name=tmpex;
        }
        for(int i=0;i<n;i++){
            System.out.println(node[i].name+" "+node[i].mark);
        }
    }
}