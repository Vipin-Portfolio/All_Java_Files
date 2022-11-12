import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.PriorityQueue;

public class FileCopying implements Comparator<Long>{
    static final String file = "C:\\Users\\NANDHAKUMAR\\TCS JAVA\\untitled\\QUERY1.txt";
    static final String file1 = "C:\\Users\\NANDHAKUMAR\\TCS JAVA\\untitled\\QUER2.txt";


    public static void main(String[] args) throws IOException {
        PriorityQueue<Long> priorityQueue = new PriorityQueue<>(new FileCopying());
        priorityQueue.add(printFileSizeNIO(file));
        priorityQueue.add(printFileSizeNIO(file1));
        while(!priorityQueue.isEmpty())
        {
            System.out.println(" " + priorityQueue.poll());
        }
        copyDirectory(new File("C:\\Users\\NANDHAKUMAR\\TCS JAVA\\untitled"), new File("C:\\Users\\NANDHAKUMAR"));
    }
    @Override
    public int compare(Long o1, Long o2) {
        return o1>o2?1:-1;
    }

    public static long printFileSizeNIO(String fileName) {

        Path path = Paths.get(fileName);
        long fileSize=0;

        try {
            fileSize = Files.size(path);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileSize;
    }
    public  static void copyDirectory(File sourceLocation , File targetLocation)
            throws IOException {

        if (sourceLocation.isDirectory()) {
            if (!targetLocation.exists()) {
                targetLocation.mkdir();
            }

            String[] children = sourceLocation.list();
            for (int i=0; i<children.length; i++) {
                copyDirectory(new File(sourceLocation, children[i]),
                        new File(targetLocation, children[i]));
            }
        } else {

            InputStream in = new FileInputStream(sourceLocation);
            OutputStream out = new FileOutputStream(targetLocation);
            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }

            in.close();
            out.close();
        }
    }

}
