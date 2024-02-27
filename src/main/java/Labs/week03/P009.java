package Labs.week03;

public class P009 {
    public static void main(String[] args) {
        PaymentUPI upi = new PaymentUPI();
        upi.setPaymentID(1001);
        upi.setUPIID("upi@okaxis");

        PaymentNB nb = new PaymentNB();
        nb.setPaymentID(1002);
        nb.setAccountNumber("1234567890");
        nb.setIFSC("SBIN0000001");

        PaymentDD dd = new PaymentDD();
        dd.setPaymentID(1003);
        dd.setBankName("SBI");
        dd.setBranchName("SBI Branch");
        dd.setDDNumber("123456");

        System.out.println("UPI Payment ID: " + upi.PaymentID);
        System.out.println("UPI ID: " + upi.UPIID);

        System.out.println();
        System.out.println("NB Payment ID: " + nb.PaymentID);
        System.out.println("Account Number: " + nb.AccountNumber);
        System.out.println("IFSC: " + nb.IFSC);

        System.out.println();
        System.out.println("DD Payment ID: " + dd.PaymentID);
        System.out.println("Bank Name: " + dd.BankName);
        System.out.println("Branch Name: " + dd.BranchName);
        System.out.println("DD Number: " + dd.DDNumber);
    }
}

abstract class Payment{
    protected int PaymentID;

    public abstract void setPaymentID(int PaymentID);
    public abstract int getPaymentID();
}

class PaymentUPI extends Payment{
    protected String UPIID;

    public void setPaymentID(int PaymentID) { this.PaymentID = PaymentID; }
    public void setUPIID(String UPIID) { this.UPIID = UPIID; }

    public int getPaymentID() { return PaymentID; }
}

class PaymentNB extends Payment{
    protected String AccountNumber;
    protected String IFSC;

    public void setPaymentID(int PaymentID) { this.PaymentID = PaymentID; }
    public void setAccountNumber(String AccountNumber) { this.AccountNumber = AccountNumber; }
    public void setIFSC(String IFSC) { this.IFSC = IFSC; }

    public int getPaymentID() { return PaymentID; }
}

class PaymentDD extends Payment{
    protected String BankName;
    protected String BranchName;
    protected String DDNumber;

    public void setPaymentID(int PaymentID) { this.PaymentID = PaymentID; }
    public void setBankName(String BankName) { this.BankName = BankName; }
    public void setBranchName(String BranchName) { this.BranchName = BranchName; }
    public void setDDNumber(String DDNumber) { this.DDNumber = DDNumber; }

    public int getPaymentID() { return PaymentID; }
}