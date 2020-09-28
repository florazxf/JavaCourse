public class FamilyAccount {

    public static void main(String[] args){
        boolean isFlag = true;
        int balance = 10000;//初始金额
        String details = ("收支\t\t账户金额\t收支金额\t说明\n");//记录用户输入支出的详情

        while(isFlag){
            System.out.println("-------------收支记账软件-------------");
            System.out.println("             1 收支明细");
            System.out.println("             2 登记收入");
            System.out.println("             3 登记支出");
            System.out.println("             4 退   出");
            System.out.print("             请选择(1-4):");
            char selection = Utility.readMenuSelection();
            switch (selection){
                case '1':
                    System.out.println("-------------------------收支明细-------------------------");
                    System.out.println(details);
                    System.out.println("--------------------------------------------------------");
                    break;
                case '2':
                    System.out.print("本次收入金额：");
                    int money = Utility.readNumber();//读取本次收入金额
                    System.out.print("本次收入说明：");
                    String info = Utility.readString();//读取收入说明
                    balance+=money;
                    details +=  ("收入\t\t"+balance+"\t\t"+money+"\t\t"+info+"\n");
                    break;
                case '3':
                    System.out.print("本次支出金额：");
                    int pay = Utility.readNumber();//读取本次收入金额
                    if(pay>balance){
                        System.out.println("支出超过余额，破产");
                        break;
                    }else{
                        balance-=pay;
                    }
                    System.out.print("本次支出说明：");
                    String payinfo = Utility.readString();//读取收入说明
                    details +=  ("支出\t\t"+balance+"\t\t"+pay+"\t\t"+payinfo+"\n");
                    break;
                case '4':
                    System.out.println("确认是否退出<Y/N>: ");
                    char isExit = Utility.readConfirmSelection();
                    if(isExit=='Y'){//退出
                        isFlag = false;
                    }
                    break;
            }
        }

    }
}
