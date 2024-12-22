package Files;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Scanner;

public class ReadingFiles {
    public static void main(String[] args) throws IOException {
        /* method 1 */
//        InputStream stream = null;
//        try {
//            ClassLoader classLoader = Main.class.getClassLoader();
//            stream = classLoader.getResourceAsStream("Files/file.txt");
//            String content = readFromFile(stream);
//            System.out.println(content);
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found!");
//        } catch (IOException e) {
//            System.out.println("Error reading file!");
//        } finally {
//            if(stream != null){
//                try {
//                    stream.close();
//                } catch (IOException ignored) {}
//            }
//        }

        /* method 2 */
        String file = "src/main/java/Files/file.txt";
        BufferedReader br = new BufferedReader(new FileReader(file));
//        BufferedReader br2 = Files.newBufferedReader(new File(file).toPath());
        String line;
        while((line = br.readLine()) != null){
            System.out.print(line);
            System.out.print(System.lineSeparator());
        }
        br.close();

        /* method 3 */
        Scanner scanner = new Scanner(new File(file));
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();

        /* method 4 : for reading binary files */
        DataInputStream dis = new DataInputStream(new FileInputStream(file));
        while(dis.available() > 0){
            System.out.println(dis.readUTF());
        }
        dis.close();

        /* method 5 */
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
        System.out.println(reader.readLine());
        reader.close();
    }

    private static String readFromFile(InputStream stream) throws FileNotFoundException, IOException {
        StringBuilder sb = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(stream))){
            String line;
            while((line = br.readLine()) != null){
                sb.append(line);
            }
            return sb.toString();
        }
    }
}
