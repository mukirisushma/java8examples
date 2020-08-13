package codesignal;

	public class duplicate {
		private static void removeduplicate(String name)
		{   
			char[] arr = name.toCharArray();
		    StringBuffer modified =new StringBuffer();
		    for(char a:arr)
		    {
		        if(! modified.contains(Character.toString(a)))
		        {
		            modified = modified.append(Character.toString(a)) ;
		        }
		    }
		    System.out.println(modified);
		}
	}


