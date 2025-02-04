package adapter;

public class PhonePayLoan {

    public boolean checkEligibility(int amount , BankAPI bankAPI){
//        10 % of loan amount in your account
        if(bankAPI.checkBalance() >= .1 * amount){
            System.out.println("Loan can be provided");
            return true;
        }
        return false;
    }
}
