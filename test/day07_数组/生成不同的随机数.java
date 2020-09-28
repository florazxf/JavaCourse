/*
创建一个长度为6的int型数组，要求数组元素的值都在1-30之间，且是随机赋值。同时，要求元素的值各不相同。
*/

import java.util.Arrays;
import java.util.Scanner;
public class AriExer {
    public static void main(String[] args){
        int [] a = new int[6];
        for(int i =0;i<a.length;i++){
            a[i] = (int)(Math.random()*30+1); //生成1-30之间的随机数
            for(int j=0;j<i;j++){//看是否重复
                if(a[i]==a[j]){
                    i--;
                    break;
                }

            }

        }
        System.out.print(Arrays.toString(a));
    }
}
