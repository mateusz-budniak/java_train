import java.util.ArrayList;
import java.util.Scanner;

public class contain {
    public static ArrayList<String> get_rows(String text)
    {
        String[] splitted = text.split("\n");
        ArrayList<String> R = new ArrayList<String>();

        for(int i = 0; i < splitted.length; i++)
        {
            R.add(splitted[i]);
        }
        return R;
    } 

    public static ArrayList<String> get_columns(String text)
    {
        ArrayList<String> C = new ArrayList<String>();

        Scanner base_scanner = new Scanner(text);
        String base_line = base_scanner.nextLine();
        base_scanner.close();

        String temp = new String();
        int n = 2;

        // Read one character at a time
        for(int i = 0; i < (base_line.length() - 1)/2 + 1; i++)
        {
            Scanner scanner = new Scanner(text);
            while (scanner.hasNextLine()) 
            {
                String line = scanner.nextLine();
                if (!line.isEmpty())
                { 
                    temp += line.charAt(i*n) + " ";
                }
            }
  
            C.add(temp);
            temp = "";
            scanner.close();
        }

        return C;
    }
}
