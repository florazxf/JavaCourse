import java.util.*;
public class Utility {
    private static String readKeyBoard(int limit) {
        label:for (;;){
            String str = scanner.next();
            if (str.length() > limit){
                System.out.println("输入过长，请重新输入：");
                continue label;
            }else {
                return str;
            }
        }
    }
    private static Scanner scanner = new Scanner(System.in);
    /**
     * 用于界面菜单的选择。该方法读取键盘，用户键入1-4的任意字符有效
     */
    public static char readMenuSelection(){
        char c;
        for (;;){
            //String str = readKeyBoard(1);
            String str = readKeyBoard(1);
            c = str.charAt(0);
            if(c!='1'&&c!='2'&&c!='3'&&c!='4'){
                System.out.print("选择错误，请重新输入：");
            }else
                break;

        }
        return c;
    }
    /*
    * 用于收入和支出金额的输入。从键盘读取一个不超过4位长度的整数
    */
    public static int readNumber(){
        int n;
        for(;;){
            String str = readKeyBoard(4);
            try{
                n = Integer.parseInt(str);
                break;
            }catch(NumberFormatException e){
                System.out.print("数字输入错误，请重新输入");
            }
        }
        return n;
    }

    /*
    *用于收入和支出说明的输入
    */
    public static String readString(){
        String str = readKeyBoard(8);
        return str;
    }
    /**
     * 用于确认选择的输入。 从键盘获取'Y'或'N'，并将其作为方法的返回值
     */
    public static char readConfirmSelection(){
        char c;
        for(;;){
            String str = readKeyBoard(1).toUpperCase();
            c = str.charAt(0);
            if(c=='Y'||c=='N'){
                break;
            }else{
                System.out.print("选择错误，请重新输入： ");
            }
        }
        return c;
    }

}
