package adapter;

public class ICICIApiAdapter implements BankAPI {

    private  ICICIBankAPI icicibankapi = new ICICIBankAPI();
    @Override
    public int checkBalance() {
        return icicibankapi.getBalance();
    }

    @Override
    public void transferMoney() {
    icicibankapi.transfer();
    }
}
