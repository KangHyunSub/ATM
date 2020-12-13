import java.util.Scanner;

public class SelectAccount {
    public String[][] selectAccount(String pin, String[][] bankdata){
        int account = -1;
        String nextstep = new String();

        for(int i=0; i<bankdata.length; i++){
            if(bankdata[i][0].equals(pin)){
                account = i;
            }
        }
        if(account == -1){
            System.out.println("등록되지 않은 카드입니다.\n");
        }
        else{
                System.out.println("1. 잔액 조회\n2. 입금\n3. 인출\n");

                Scanner scanner = new Scanner(System.in);
                nextstep = scanner.nextLine();
                if(nextstep.equals("1")){
                    CheckBalance checkBalance = new CheckBalance();
                    checkBalance.checkBalance(account, bankdata);
                }
                else if(nextstep.equals("2")){
                    Deposit deposit = new Deposit();
                    bankdata = deposit.deposit(account, bankdata);
                }
                else if(nextstep.equals("3")){
                    Withdrawal withdrawal = new Withdrawal();
                    bankdata = withdrawal.withdrawal(account, bankdata);
                }
        }
        return bankdata;
    }
}
