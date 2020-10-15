
import java.util.Scanner;
public class book7_24 {
    public static void main(String[] args) {
        String[] color={"Spades","Clubs","Diamonds","Hearts"};
        String[] card={"ACE","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        int[] deck=new int[52];
        for(int i=0;i<deck.length;i++){//每个deck[i]的值是card的下标
            deck[i]=i%13;
        }
        for(int i=0;i<deck.length;i++){//打乱顺序
            int index= (int)(Math.random()*deck.length);
            int tmp=deck[i];
            deck[i]=deck[index];
            deck[index]=tmp;
        }
        int res=0;
        int[] f={0,0,0,0};//0表示该花色没有出现过
        while (f[0] + f[1] + f[2] + f[3] != 4) {
            res++;
            int index = (int) (Math.random() * deck.length);//随机取牌
            int tmp = index / 13;//花色
            if (f[tmp] == 0) {//这个花色没有出现过
                f[tmp] = 1;
                System.out.println(card[deck[index]] + " of " + color[tmp]);
            }
        }
        System.out.println("Number of picks: "+res);
    }
}