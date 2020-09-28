/*
一个数恰好等于它的因子之和这个数就称为完数。找到1000以内的所有完数（因子：除去这个数本身的其他约数）
*/

//方法一：老师的方法

        for(int i=1;i<=1000;i++){
            int sum = 0;
            for(int j = 1;j<=i/2;j++){
                if(i%j==0){
                    sum +=j;
                }
            }
            if(sum==i){
                System.out.println(i);
            }

        }
        
        
//方法二： 
/*
自己做的，直接开的根号，结果没问题 速度快很多
*/
      for(int i=2;i<=1000;i++){
            int sum = 1;
            for(int j = 2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    int c = (i/j==j)?0:i/j;
                    sum = sum +j +c;
                }
            }
            if(sum==i){
                System.out.println(i);
            }

        }
