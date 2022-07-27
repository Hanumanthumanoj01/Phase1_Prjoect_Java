package Git;

public class StringConversion {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String strs[] = {"string", "conversion", "method", "to", "string", "builder" };
		     StringBuilder sb = new StringBuilder();
		     sb.append(strs[0]);
		     sb.append(" "+strs[1]);
		     sb.append(" "+strs[2]);
		     sb.append(" "+strs[3]);
		     sb.append(" "+strs[4]);
		     sb.append(" "+strs[5]);
		     System.out.println(sb.toString());
		    
		     String str1 = "This is string. ";
		     StringBuffer sbf = new StringBuffer();
		     sbf.append(str1);  
		     String str2 = "This is string buffer.";   
		     sbf.append(str2);   
		     String str3 = "conversion of string to stringbuffer.";
		     sbf.append("\n" + str3);  
		     System.out.println("String to StringBuffer"+ " using append() method : \n\n" + sbf);

		}

	}


