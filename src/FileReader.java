import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class FileReader {
    /**
     * This will hold every sentence in the essay
     */
    private ArrayList<String> essay;

    /**
     * This holds the name of the file that wants to be read
     */
    private String fileName;

    /**
     * Creates fileReader Object
     */
    public void FileReader(String fileName){
        this.fileName = fileName;
        essay = new ArrayList<>();


    }

    /**
     * Read File and add every sentence into an 'essay'
     */
    public void parseEssay(){
        try{
            FileInputStream file = new FileInputStream(fileName);
            Scanner fileReader = new Scanner(file);
            fileReader.useDelimiter(". ");

            // While there is another sentence in the file...
            while(fileReader.hasNext()){
                String sentence = fileReader.next();
                essay.add(sentence);
            }

        } catch(FileNotFoundException e){
            System.out.println("The File you provided doesn't exist");
        }
    }

    /**
     * returns essay
     */
    public ArrayList<String> getEssay(){return essay;}
}
