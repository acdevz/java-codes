package Labs.week02.P005;

public class P005 {
    public static void main(String[] args) {
        RBI sbi = new SBI();
        RBI hdfc = new HDFC();
        RBI icici = new ICICI();

        sbi.setInterest(5.5);
        hdfc.setInterest(6.0);
        icici.setInterest(6.5);

        System.out.println("SBI Interest: " + sbi.interest);
        System.out.println("HDFC Interest: " + hdfc.interest);
        System.out.println("ICICI Interest: " + icici.interest);

//        downcasting to Bank
        Bank sbi1 = (Bank) sbi;
        Bank hdfc1 = (Bank) hdfc;
        Bank icici1 = (Bank) icici;

        sbi1.setInterest(5.5);
        hdfc1.setInterest(6.0);
        icici1.setInterest(6.5);

        System.out.println("SBI Interest: " + sbi1.interest);
        System.out.println("HDFC Interest: " + hdfc1.interest);
        System.out.println("ICICI Interest: " + icici1.interest);

    }
}

class RBI{
    protected double interest;

    public void setInterest(double interest) {
        this.interest = interest;
    }
}

class Bank extends RBI{
    public void setInterest(double interest) {
        this.interest = interest;
    }
}

class SBI extends Bank{
    public void setInterest(double interest) {
        this.interest = interest;
    }
}

class ICICI extends Bank{
    public void setInterest(double interest) {
        this.interest = interest;
    }
}

class HDFC extends Bank{
    public void setInterest(double interest) {
        this.interest = interest;
    }
}
