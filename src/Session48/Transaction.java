package Session48;

public class Transaction {
    String txId;
    String accNo;
    String accHolderName;
    String accType;
    String txType;
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
        wdAmt = wd_Amt;
    }
}
class Test8
{
    public static void main(String[] args)
    {
   //  Transaction tx = new Transaction("T-111","abc-123","Durga",
             "Savings",25000);
                tx.withdraw(10000);
        System.out.println(tx);
    }

}
