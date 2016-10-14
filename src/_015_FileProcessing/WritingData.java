package _015_FileProcessing;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by lennyhicks on 10/7/16.
 */
public class WritingData {
    public static void main(String[] args) throws IOException{
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 11; i < 21; i++){
            arr.add(i);
        }
        String no = "no";
        String fileName = "bananas.txt";
            PrintWriter outFile = new PrintWriter(fileName);
        for (int i = 1; i < 11; i++){
            outFile.println(i);
        }
        for (int object : arr){
           // System.out.println(object);
            outFile.println(arr.get(object-arr.size()-1));
        }
            outFile.close();
    }

}