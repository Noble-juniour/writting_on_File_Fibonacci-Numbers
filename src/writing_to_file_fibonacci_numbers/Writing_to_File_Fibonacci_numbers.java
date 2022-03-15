package writing_to_file_fibonacci_numbers;

import java.io.*;

public class Writing_to_File_Fibonacci_numbers {

    public static void main(String[] args) throws IOException{
        BufferedWriter out = null;
        try{
        out = new BufferedWriter(new FileWriter("mypractice.dat" , true));
       
        for(long number : Fibonacci())
        {
        out.write(String.valueOf(number) + "\r\n");
        }
        }
        catch(IOException e)
        {
            System.err.println(1);
        }
        finally{
        out.close();
        }
    }
    public static long[] Fibonacci()
    {
        long[] fibnumbers = new long[50];
        fibnumbers[0] = 0;
        fibnumbers[1] = 1;
        
       for(int i = 2; i < 50; i++)
       {
           fibnumbers[i] = fibnumbers[i-1] + fibnumbers[i-2];
       }
       
       return fibnumbers;
    }
    
}
