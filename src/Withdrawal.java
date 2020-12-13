import java.util.Scanner;

public class Withdrawal {
    public String[][] withdrawal(int account, String[][] bankdata){
        int intmoney;

        System.out.println("출금할 금액을 적어주세요\n");

        Scanner scanner = new Scanner(System.in);
        String money = scanner.nextLine();

        intmoney = Integer.parseInt(bankdata[account][1]) - Integer.parseInt(money);
        if(intmoney < 0){
            System.out.println("잔액이 모자랍니다.\n");
        }
        else{
            bankdata[account][1] = Integer.toString(intmoney);
        }
        return bankdata;
    }
}
