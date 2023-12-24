package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        try{
            createException();
            throw new MyException("My Exception");
        }
        catch(MyException e){
            System.out.println("My Exception caught!");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Don't divide by zero!");
        }
        catch(Exception e){
            System.out.println("Exception caught: " + e.getMessage());
        }
//        createException();
    }

    private static void createException() throws ArithmeticException{
        // throws keyword is used to tell the compiler that this method can throw an exception
        throw new ArithmeticException("Arithmetic Exception");
    }
}
