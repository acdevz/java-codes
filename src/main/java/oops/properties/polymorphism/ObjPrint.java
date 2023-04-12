package oops.properties.polymorphism;

public class ObjPrint {
    String code;

    public ObjPrint(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "ObjPrint{" +
                "code='" + code + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ObjPrint obj = new ObjPrint("ALXP196540");
        System.out.println(obj.toString());
    }
}
