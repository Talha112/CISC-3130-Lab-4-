import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Assignment {

    public static void main(String[] args) throws IOException {

        Queue<String> names = new LinkedList<String>(); // Queue created using Queue Class

        PrintStream ps = new PrintStream("sortedArtistNames.txt");   // Printer to write sorted list into txt


        String splitBy = ",";
        BufferedReader br = new BufferedReader(new FileReader                      //Buffered reader created to read from csv file
                ("/Users/lollol/Downloads/regional-global-weekly-latest.csv"));
        String line;
        while((line = br.readLine()) !=null){
            String[] b = line.split(splitBy);
            names.add((b[1]));  // This makes it read only the column 2 containing artist names and adds it to Queue
        }
        br.close();

        BufferedReader br2 = new BufferedReader(new FileReader                      //Buffered reader 2 created to read from csv file
                ("/Users/lollol/Downloads/regional-global-weekly-2020-10-09--2020-10-16.csv"));
        String line1;
        while((line1 = br2.readLine()) !=null){
            String[] b = line1.split(splitBy);
            names.add((b[1]));  // This makes it read only the column 2 containing artist names and adds it to Queue
        }



        br2.close();
        BufferedReader br3 = new BufferedReader(new FileReader                      //Buffered reader 3 created to read from csv file
                ("/Users/lollol/Downloads/regional-global-weekly-2020-10-09--2020-10-16.csv"));
        String line2;
        while((line2 = br3.readLine()) !=null){
            String[] b = line2.split(splitBy);
            names.add((b[1]));  // This makes it read only the column 2 containing artist names and adds it to Queue
        }
        br3.close();



        BufferedReader br4 = new BufferedReader(new FileReader                      //Buffered reader 4 created to read from csv file
                ("/Users/lollol/Downloads/regional-global-weekly-2020-10-09--2020-10-16.csv"));
        String line3;
        while((line3 = br4.readLine()) !=null){
            String[] b = line3.split(splitBy);
            names.add((b[1]));  // This makes it read only the column 2 containing artist names and adds it to Queue
        }
        br4.close();



        System.out.println(names); // prints unsorted Queue
        Collections.sort((LinkedList<String>) names);// Sorts Queue
        System.out.println(names);//Prints sorted
        for(int x=0;x<800;x++) {              //loop for writing Queue into txt file
            ps.println(((LinkedList<String>) names).get(x));        // Using loop to write line by line
        }                                   // made it easier to read the txt file




    }

    }
