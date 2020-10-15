import java.util.Scanner;
public class book7_34 {
    public static String sort(String s){
        char[] ss;
        ss=s.toCharArray();//将String类转化为char类型的数组
        for(int i=0;i<s.length();i++){
            for(int j=1;j<s.length();j++){
                if(ss[j]<ss[j-1]){
                    char tmp=ss[j];
                    ss[j]=ss[j-1];
                    ss[j-1]=tmp;
                }
            }
        }
        s=String.valueOf(ss);//将char类型的数组转化为String
        return s;
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String s=kb.nextLine();
        System.out.println(sort(s));
    }
}
