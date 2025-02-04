package adapter;

public class HDFCBankAPI {

    public int getBalance(){
        System.out.println("Balance check via HDFC");
        return 100;
    }

    public void transfer(){
        System.out.println("Transfer via HDFC");
    }
}
