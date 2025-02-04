package adapter;

public class HDFCApiAdapter implements BankAPI {

    private  HDFCBankAPI hdfcBankAPI = new HDFCBankAPI();


    @Override
    public int checkBalance() {
        return hdfcBankAPI.getBalance();
    }

    @Override
    public void transferMoney() {
        hdfcBankAPI.transfer();

    }
}
