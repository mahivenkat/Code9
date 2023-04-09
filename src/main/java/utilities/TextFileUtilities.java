package utilities;

import java.io.*;

public class TextFileUtilities {


    public String readTextFile(String filePath){
        System.out.println("read texting file...........");
        File file = new File(filePath);
        FileReader fr;
        try {
            fr = new FileReader(file.getAbsolutePath());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader br = new BufferedReader(fr);
        String line;
        StringBuilder builder = new StringBuilder();
        while (true){
            try {
                if ((line = br.readLine()) == null) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            builder.append(line);
        }

        return String.valueOf(builder);
    }

    public void writeToTextFile(String filePath, String fileContent){
        System.out.println("write to text file...........");
        File file = new File(filePath);
        FileWriter fw;
        try {
            fw = new FileWriter(file.getAbsolutePath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            bw.write(fileContent);
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
