package oops.statics;

public class InnerClasses {
    //static / non-static
    class Test{
        int code;

        public Test(int code) {
            this.code = code;
        }

        @Override
        public String toString() {
            return "code = " + this.code;
        }
    }

    public void instantiateTest(){
        /* for non-static Test */
        Test a = new Test(22124009);
        Test b = new Test(22124045);
        System.out.println(b);
    }
    public static void main(String[] args) {
        /* for static Test */
//        Test a = new Test(22124009);
//        Test b = new Test(22124045);

        InnerClasses obj = new InnerClasses();
        obj.instantiateTest();
    }

}
