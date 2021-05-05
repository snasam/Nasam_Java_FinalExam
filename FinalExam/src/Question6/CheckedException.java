/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author S541997
 */
public class CheckedException {
    
    public static void main(String args[]) throws FileNotFoundException, IOException 
   {
	FileInputStream f = null;
	
        f = new FileInputStream("input.txt"); 
	int n; 

	/* Method read() of FileInputStream class also throws 
	 * a checked exception: IOException
         */
	while(( n = f.read() ) != -1) 
	{ 
		System.out.print((char)n); 
	} 

	/*The method close() closes the file input stream
	 * It throws IOException*/
	f.close(); 	
   }
}
    

