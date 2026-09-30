import java.io.*;
import java.util.*;

class program662
{
    public static void main(String A[])
    {
        boolean bRet = false;
        String Fname = null;
        Scanner sobj = null;
        System.out.println("Enter name of file : ");
        File fobj = null;
        try
        {
            fobj = new File(Fname);
            

            bRet = fobj.exists();
            if(bRet == true)
            {
                System.out.println("File already present");
            }
            else
            {
                fobj.createNewFile();
                System.out.println("File gets successfully created");
            }
            
        }
        catch(IOException iobj)
        {
            System.out.println(iobj);
        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }
    }
}