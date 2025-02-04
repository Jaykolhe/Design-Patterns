package adapter;

public class Recharge {

    public boolean recharge(int amount, BankAPI bankAPI){
        if(bankAPI.checkBalance() >= amount){
            System.out.println("Recharge is successfull");
            return true;
        }
        return false;
    }
}
