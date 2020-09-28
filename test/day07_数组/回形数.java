/*
控制台输入一个整数n，输出n*n矩阵回形数
请输入一个整数：5
1	  2	  3	  4	  5	
16	17	18	19	6	
15	24	25	20	7	
14	23	22	21	8	
13	12	11	10	9	
*/

//方法一：
import java.util.Arrays;
import java.util.Scanner;
public class AriExer {
    public static void main(String[] args){
        //1. 定义二维数组
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int n = scan.nextInt();
        int [][] arr = new int[n][n];

        //2. 给二维数组赋值
        int m = 0; //要显示的数据
        //上下左右的边界
        int l = 0;
        int r = n-1;
        int t = 0;
        int b = n-1;
        while(t<=b){//控制行数
            for(int y = l;y<=r;y++){ //向右
                arr[t][y] = ++m;
            }
            t++;
            for(int x = t;x<=b;x++){//向下
                arr[x][r] = ++m;
            }
            r--;
            for(int y = r;y>=l;y--){//向左
                arr[b][y] = ++m;
            }
            b--;
            for(int x=b;x>=t;x--){//向上
                arr[x][l] = ++m;
            }
            l++;
        }

        //3. 打印
        //System.out.print(Arrays.deepToString(arr));
        for(int q = 0;q<n;q++){
            for(int w = 0;w<n;w++){
                System.out.print(arr[q][w]+"\t");
            }
            System.out.println();
        }

    }
}

//方法二：
import java.util.Arrays;
import java.util.Scanner;
public class AriExer {
    public static void main(String[] args){
        //1. 定义二维数组
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int n = scan.nextInt();
        int [][] arr = new int[n][n];

        //2. 给二维数组赋值
        int s = n*n;
        int k=1;//k==1 向右 k==2 向下 k==3 向左 k==4 向上
        int i=0;
        int j=0;
        for(int m=1;m<=s;m++){
            if(k==1){//向右
                if(j<n && arr[i][j]==0){
                    arr[i][j++] = m;
                }
                else{
                    k=2;
                    i++;
                    j--;
                    m--;
                }
            }
            else if(k==2){//向下
                if(i<n && arr[i][j]==0){
                    arr[i++][j] = m;
                }
                else{
                    k=3;
                    i--;
                    j--;
                    m--;
                }
            }
            else if(k==3){//向左
                if(j>=0&&arr[i][j]==0){
                    arr[i][j--] = m;
                }
                else{
                    k=4;
                    i--;
                    j++;
                    m--;
                }
            }
            else if(k==4){//向上
                if(i>=0&&arr[i][j]==0){
                    arr[i--][j] = m;
                }
                else{
                    k=1;
                    i++;
                    j++;
                    m--;
                }
            }
        }

        //3. 打印
        //System.out.print(Arrays.deepToString(arr));
        for(int a = 0;a<n;a++){
            for(int b = 0;b<n;b++){
                System.out.print(arr[a][b]+"\t");
            }
            System.out.println();
        }

    }
}
