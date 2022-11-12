import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<String> detailsList = new ArrayList<>();
    public static List<String> kuralList = new ArrayList<>();
    static {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\NANDHAKUMAR\\Downloads\\Thirukural (1)\\Thirukural\\src\\resources\\details.json"));
            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while((line=bufferedReader.readLine())!=null){
                stringBuilder.append(line);
            }
            //System.out.println(stringBuilder.toString());
            detailsList.add(stringBuilder.toString());
            System.out.println(detailsList);
            bufferedReader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\NANDHAKUMAR\\Downloads\\Thirukural (1)\\Thirukural\\src\\resources\\thirukural.json"));
            String line;
            StringBuilder stringBuilder1 = new StringBuilder();
            while((line=bufferedReader.readLine())!=null){
                stringBuilder1.append(line);
            }
            kuralList.add(stringBuilder1.toString());
            System.out.println(kuralList);
            bufferedReader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws FileNotFoundException {

    }
}
