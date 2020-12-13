public class Main {
    public static void main(String[] args) {
        Data data= new Data();
        InsertCard insertCard = new InsertCard();
        String pin = insertCard.insertCard();

        SelectAccount selectAccount = new SelectAccount();
        data.setData(selectAccount.selectAccount(pin, data.getData()));
    }
}
