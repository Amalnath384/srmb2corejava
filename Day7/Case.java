package input;

import java.io.*;

class Case{

    public static void main (String[] args) {
        try
        {
            FileReader fr = new FileReader("C:\\Users\\Lenovo\\Desktop\\case.txt");
            BufferedReader br = new BufferedReader(fr);
            PrintWriter upc = (new PrintWriter(new FileWriter("C:\\Users\\Lenovo\\Desktop\\abc.txt")));
            PrintWriter lrc = (new PrintWriter(new FileWriter("C:\\Users\\Lenovo\\Desktop\\def.txt")));
            String s="";
            while((s = br.readLine()) != null)
            {
                upc.write(s.toUpperCase()+"\n");
                lrc.write(s.toLowerCase()+"\n");
                
            }
            br.close();
            upc.close();
            lrc.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}