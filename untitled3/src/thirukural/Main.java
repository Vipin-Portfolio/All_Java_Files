package thirukural;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static ArrayList<String> detailsList = new ArrayList<>();
    public static ArrayList<String> kuralList = new ArrayList<>();
//    static {
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\NANDHAKUMAR\\Downloads\\Thirukural (1)\\Thirukural\\src\\resources\\details.json"));
//            String line;
//            StringBuilder stringBuilder = new StringBuilder();
//            while((line= bufferedReader.readLine())!=null){
//                stringBuilder.append(line);
//            }
//            detailsList.add(stringBuilder.toString());
//            System.out.println(detailsList);
//            bufferedReader.close();
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try{
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\NANDHAKUMAR\\Downloads\\Thirukural (1)\\Thirukural\\src\\resources\\thirukural.json"));
//            String line;
//            StringBuilder stringBuilder = new StringBuilder();
//            while((line=bufferedReader.readLine())!=null){
//                stringBuilder.append(line);
//            }
//            kuralList.add(stringBuilder.toString());
//            System.out.println(kuralList);
//            bufferedReader.close();
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
      ThirukuralPojo thirukuralPojo = new ThirukuralPojo();
    }
}
