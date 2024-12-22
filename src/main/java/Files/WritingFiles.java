package Files;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WritingFiles {
    public static void main(String[] args) throws IOException {
        String fileName = "src/main/java/Files/test.txt";
        String content = "Hello World!";

        /* method 1 */
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            writer.append("\ndone.");
            writer.flush();
            writer.close();
        } catch (Exception e) {
            System.out.println("File not found!");
        }

        /* method 2 */
        try (FileOutputStream outputStream = new FileOutputStream(fileName)){
            outputStream.write(content.getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (Exception e) {
            System.out.println("File not found!");
        }

        /* method 3 : write and edit inside an existing file */
        try (RandomAccessFile writer = new RandomAccessFile(fileName, "rw")) {
            writer.seek(3);
            writer.writeChar('\n');
            writer.close();
        } catch (Exception e) {
            System.out.println("File not found!");
        }

        /* cool method 4 : Files */
        Path path = Paths.get(fileName);
        Files.write(path, content.getBytes());

        /* lock file before writing */
        RandomAccessFile stream = new RandomAccessFile(fileName, "rw");
        FileChannel channel = stream.getChannel();

        FileLock lock = null;
        try {
            lock = channel.tryLock();
        } catch (final OverlappingFileLockException e) {
            stream.close();
            channel.close();
        }
        stream.writeChars("test lock");
        assert lock != null;
        lock.release();

        stream.close();
        channel.close();
    }
}
