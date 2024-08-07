package multithreading;

import java.io.IOException;

public class RuntimeExec {
    public static void main(String[] args) throws IOException {
        Runtime.getRuntime().exec("notepad");
    }
}
