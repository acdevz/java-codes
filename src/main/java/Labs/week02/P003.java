package Labs.week02;

public class P003 {
    public static void main(String[] args) {

        Department d = new Department("IT", "Mrs. Sarla", "NITJ", 100);
        d.Display();
        System.out.println(d.getRanking());
    }
}

class University{
    private String name;
    private int ranking;

    public String getRanking(){
        return "University Ranking: " + ranking;
    };

    public University(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }
}

class Faculty extends University{
    private String name;
    public String details(){
        return "Faculty Name: " + name;
    };

    public Faculty(String name, String universityName, int ranking) {
        super(universityName, ranking);
        this.name = name;
    }
}

class Department extends Faculty{
    private String name;
    private String chairman;

    public Department(String name, String facultyName, String universityName, int ranking) {
        super(facultyName, universityName, ranking);
        this.name = name;
    }

    public String details(){
        return "Department Name: " + name;
    };

    public void Display(){
        System.out.println(details());
        System.out.println(super.details());
    }
}