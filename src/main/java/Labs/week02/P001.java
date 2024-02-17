package Labs.week02;

public class P001 {
    public static void main(String[] args) {
        Room r1 = new Room();
        r1.setData(101, 'A', "1000 sqft", true);
        Room r2 = new Room();
        r2.setData(102, 'B', "2000 sqft", false);

        r1.displayData();
        r2.displayData();
    }
}

class Room{
    private int roomNo;
    private char roomType;
    private String roomArea;
    private boolean ACMachine;

    public void setData(int roomNo, char roomType, String roomArea, boolean ACMachine){
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.roomArea = roomArea;
        this.ACMachine = ACMachine;
    }

    public void displayData(){
        System.out.println("Room No: " + roomNo + "\nRoom Type: " + roomType + "\nRoom Area: " + roomArea + "\nAC Machine: " + ACMachine);
    }
}