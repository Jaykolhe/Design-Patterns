package adapter;

public class PhonePay {

    private Recharge fastTag;
    private PhonePayLoan phonePeLoan;
    private BankAPI bankAPI;

    PhonePay(BankAPI bankAPI){
        this.fastTag = new Recharge();
        this.phonePeLoan = new PhonePayLoan();
        this.bankAPI = bankAPI;
    }

    void fastTagRecharge(int amount){
        fastTag.recharge(amount , bankAPI);
    }

    void availLoan(int amount){
        phonePeLoan.checkEligibility(amount ,bankAPI);
    }
}
