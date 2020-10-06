package Session48;

public class Transaction {
    String txId;
    String accNo;
    String accHolderName;
    String accType;
    String txType;
    String txStatus;
    int initialBalance;
    int totalBalance;
    int wdAmt;



    public Transaction(String tx_Id,String acc_No,String acc_HolderName,String acc_Type,
                       int initial_Balance,int total_Balance,int wd_Amt)
    {
        txId = tx_Id;
        accNo = acc_No;
        accHolderName = acc_HolderName;
        accType = acc_Type;
        initialBalance = initial_Balance;

    }
    public void withdraw(int wd_Amt)
    {
        totalBalance = initialBalance - wd_Amt;
        txType = "withdraw";
        wdAmt = wd_Amt;
        txStatus = "Success";
    }
    public String toString() {
        System.out.println("Transaction Details");
        System.out.println("---------------------------------");
        System.out.println("Transaction Id           : " + txId);
        System.out.println("Account Number           : " + accNo);
        System.out.println("Account Holder Name      : " + accHolderName);
        System.out.println("Account Type             : " + accType);
        System.out.println("Transaction Type         : " + txType);
        System.out.println("Initial Balance          : " + initialBalance);
        System.out.println("Withdarw Amount          : " + wdAmt);
        System.out.println("Total Balance            : " + totalBalance);
        System.out.println("Transaction Status       : " + txStatus);
        return "";
    }
}

class Test8
{
    public static void main(String[] args)
    {
   // Transaction tx = new Transaction("T-111","abc-123","Durga",
           //  "Savings",25000);
              //  tx.withdraw(10000);
      //  System.out.println(tx);
    }

}
