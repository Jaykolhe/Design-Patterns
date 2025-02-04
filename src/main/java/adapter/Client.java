package adapter;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

            System.out.println("Enter the Bank you want to use!");
            String BankName =  scanner.nextLine();
            BankAPI bankAPI = null;
            if(BankName.equals("HDFC")){
                bankAPI = new HDFCApiAdapter();
            }else if(BankName.equals("ICICI")){
                bankAPI = new ICICIApiAdapter();
            }

            PhonePay phonePay = new PhonePay(bankAPI);
            phonePay.availLoan(30);
            phonePay.fastTagRecharge(40);
    }
}
