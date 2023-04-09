package utilities;

import java.io.IOException;

public class Sampler {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\91891\\Code9\\Code9\\testdata\\SampleTextFile1.txt";
//        String dd = new TextFileUtilities().readTextFile(filePath);
//        System.out.println(dd);
        new TextFileUtilities().writeToTextFile(filePath, "hello sir");
    }
}
