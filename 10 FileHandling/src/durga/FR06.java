package durga;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FR06
{
	public static void main(String[] args)
	{
		File f = new File("test.txt");
		
		FileReader fr = null;
		try
		{
			fr = new FileReader(f);
			
			char[]c1 = new char[(int)f.length()];
			fr.read(c1);
			
			for(char c2:c1)
			{
				System.out.println(c2);
			}
			
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			try
			{
				if(fr !=null)
				{
					fr.close();
					fr = null;
				}
			} 
			catch (IOException e2)
			{
				
			}
		}
		
	}
}
