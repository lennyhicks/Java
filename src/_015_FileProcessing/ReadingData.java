package _015_FileProcessing;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lennyhicks on 10/7/16.
 */
public class ReadingData{
    ArrayList<Integer> num = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        ReadingData read = new ReadingData();
        read.start();
    }

    private void start() throws IOException {
        String filename = "bananas.txt";
        Scanner inFile = new Scanner(new FileReader(filename));
        int toNum =0;
        while (inFile.hasNextLine()){
            toNum = Integer.parseInt(inFile.nextLine());
            System.out.println(toNum);
            num.add(toNum);

        }
        System.out.println(num);
    }
}