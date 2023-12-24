package oops.constructors;

public class SecureObject {
    private SecureObject(){
        System.out.println("SecureObject created");
    }

    public static SecureObject createInstance(String password){
        boolean isPasswordCorrect = authenticate(password);
        if(isPasswordCorrect){
            return new SecureObject();
        }else{
            throw new SecurityException("Incorrect password!");
        }
    }

    private static boolean authenticate(String password) {
        // check credentials against a database or external service
        return true; // if valid, false otherwise
    }
}
