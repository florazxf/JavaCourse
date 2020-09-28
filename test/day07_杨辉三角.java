/*
使用2维数组打印一个杨辉三角
*/

import java.util.Arrays;
import java.util.Scanner;
public class AriExer {
    public static void main(String[] args){
        //1. 声明并初始化二维数组
        int[][] yanghui = new int[10][];
        //2. 给数组的元素赋值
        for(int i=0;i<10;i++){
            yanghui[i] = new int[i+1]; //第i行有i+1个元素
            //2.1 给首末元素赋值
            yanghui[i][0] = yanghui[i][i] = 1;
            //2.2 给每行的非首末元素赋值
            for(int j=1;j<yanghui[i].length-1;j++){
                yanghui[i][j] = yanghui[i-1][j-1]+yanghui[i-1][j];
            }
        }
        //3. 打印输出
        for(int i=0;i<10;i++){
            for(int j=0;j<yanghui[i].length;j++){
                System.out.print(yanghui[i][j]+" ");
            }
            System.out.println();
        }
    }
}


//我写的
import java.util.Arrays;
import java.util.Scanner;
public class AriExer {
    public static void main(String[] args){

        int[][] yanghui = new int[10][];
        //确定每行的个数
        for(int i=0;i<10;i++){
            yanghui[i] = new int[i+1]; //第i行有i+1个元素
        }

        //遍历赋值
        for(int i=0;i<10;i++){
            for(int j=0;j<yanghui[i].length;j++){
                if(i==0||i==1||j==0||j==(yanghui[i].length-1)){ //前两行和第一列最后一列都是的值都是1
                    yanghui[i][j] = 1;
                }
                else{
                    yanghui[i][j] = yanghui[i-1][j-1]+yanghui[i-1][j];
                }
                System.out.print(yanghui[i][j]+" ");

            }
            System.out.println();
        }
    }
}


//老师写的：
感觉老师的思路更清晰，分成三个部分：
①声明并初始化二维数组
②给数组的元素赋值
③遍历二维数组输出

import java.util.Arrays;
import java.util.Scanner;
public class AriExer {
    public static void main(String[] args){
        //1. 声明并初始化二维数组
        int[][] yanghui = new int[10][];
        //2. 给数组的元素赋值
        for(int i=0;i<10;i++){
            yanghui[i] = new int[i+1]; //第i行有i+1个元素
            //2.1 给首末元素赋值
            yanghui[i][0] = yanghui[i][i] = 1;
            //2.2 给每行的非首末元素赋值
            for(int j=1;j<yanghui[i].length-1;j++){
                yanghui[i][j] = yanghui[i-1][j-1]+yanghui[i-1][j];
            }
        }
        //3. 打印输出
        for(int i=0;i<10;i++){
            for(int j=0;j<yanghui[i].length;j++){
                System.out.print(yanghui[i][j]+" ");
            }
            System.out.println();
        }
    }
}
