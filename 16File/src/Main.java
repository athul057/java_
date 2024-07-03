import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    File file=createFile("src/foo.txt");
        try {
            Scanner scanner=new Scanner(file);
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static File createFile(String path){
        try {
            File file=new File(path);
            if(!file.exists()){
                file.createNewFile();
            }
            return file;
//        if(file.exists()){
//            file.delete();
//        }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }
    }

    private  static void writetoFile(File file){
        try{
            FileWriter fileWriter=new FileWriter(file,true);
            PrintWriter writer=new PrintWriter(fileWriter);
            writer.println("hello");
            writer.println("world");
            writer.flush();
            writer.close();

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}