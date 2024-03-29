import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PigLatin {
    
    public void tester() {
        //String[] lines = loadStrings("words.txt");
        String[] lines = new String[8]; 
        try{
            File myFile = new File("words.txt");
            Scanner myReader = new Scanner(myFile);
            int counter = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                lines[counter] = data;
                counter++;
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
	    System.out.println("there are " + lines.length + " lines");
	    for (int i = 0 ; i < lines.length; i++) {
	        System.out.println(pigLatin(lines[i]));
	    }
    }
public int findFirstVowel(String word)
{
   for(int i=0;i<word.length();i++){
  if(word.substring(i,i+1).equals("a")||word.substring(i,i+1).equals("e")||word.substring(i,i+1).equals("i")||word.substring(i,i+1).equals("o")||word.substring(i,i+1).equals("u")){
    return i;
  }
}
return -1;
}


   public String pigLatin(String word)
{
  if(findFirstVowel(word) == -1)
  {
    return word + "ay";
  }
  else
  {
    if(findFirstVowel(word)==0){
      return word + "way";
    }else if(word.substring(0,2).equals("qu")){
    return word.substring(2,word.length())+"quay";
    }else if (findFirstVowel(word.substring(0,1))==-1){
     return word.substring(findFirstVowel(word),word.length())+word.substring(0,findFirstVowel(word))+"ay";
    }else{
    return "ERROR!";
    }
  }
}
}//end PigLatin class
