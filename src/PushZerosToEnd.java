import java.io.*;
  
class PushZerosToEnd
{
 
    static void pushZerosToEnd(int myArray[])
    {
        int count = 0;  // Count of non-zero elements
        
        int len = myArray.length;
        for (int i = 0; i < len; i++)
            if (myArray[i] != 0)
            	myArray[count++] = myArray[i]; 
        while (count < len)
        	myArray[count++] = 0;
    }
  
   
}