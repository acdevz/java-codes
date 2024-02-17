package Labs.week02;

public class P004 {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        sbi.setInterest(5.5);
        System.out.println("SBI Interest: " + sbi.interest);

        Bank icici = new ICICI();
        icici.setInterest(6.5);
        System.out.println("ICICI Interest: " + icici.interest);

        Bank hdfc = new HDFC();
        hdfc.setInterest(7.5);
        System.out.println("HDFC Interest: " + hdfc.interest);

//        downcasting
        SBI sbi1 = (SBI) sbi;
        ICICI icici1 = (ICICI) icici;
        HDFC hdfc1 = (HDFC) hdfc;

        sbi1.setInterest(8.5);
        icici1.setInterest(9.5);
        hdfc1.setInterest(10.5);

        System.out.println("SBI Interest: " + sbi1.interest);
        System.out.println("ICICI Interest: " + icici1.interest);
        System.out.println("HDFC Interest: " + hdfc1.interest);

    }
}

class Bank{
    protected double interest;

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