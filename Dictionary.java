import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Dictionary {
	// Function Definetion 
	public static void doesFileExist(String path) {
		File fl = new File (path);
		if (fl.exists()) 
			System.out.println("File exists in the defined path");
		else
		System.out.println("File does not exists");
	}
	
public static void main(String[] args) {
		// File opening and reading
				String[] title;
				String[] definition;
				int counter = 0;
				File file = new File ("C:\\dictionary.txt");
				doesFileExist ("C:\\dictionary.txt");	
				try {
					Scanner sentence = new Scanner(new File("C:\\dictionary.txt"));
				    ArrayList<String> sentenceList = new ArrayList<String>();

				       while (sentence.hasNextLine())
				       {
				           sentenceList.add(sentence.nextLine());
				       }
				       
				       sentence.close();
				       
				       Iterator sentenceIt=sentenceList.iterator();
				       //  Splitting the text on the file and display
				      while(sentenceIt.hasNext())
				      {
				    	  title = sentenceIt.next().toString().split("-");
				    	  definition = title[1].split(",");
				    	  System.out.println("\n"+title[0]);
				    	  for (int i=0;i<definition.length;i++)
				           {	
				               System.out.println(definition[i]);
				           }
				    	  counter++;
				    	  
				      }
				       		  
				  }
				  catch(IOException e) {
						e.printStackTrace();

				  } 
			}  

	}


