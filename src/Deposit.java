import java.util.Scanner;

public class Deposit {
    public String[][] deposit(int account, String[][] bankdata){
        int intmoney;

        System.out.println("입금할 금액을 적어주세요\n");

        Scanner scanner = new Scanner(System.in);
        String money = scanner.nextLine();

        intmoney = Integer.parseInt(money) + Integer.parseInt(bankdata[account][1]);
        bankdata[account][1] = Integer.toString(intmoney);

        return bankdata;
    }
}
