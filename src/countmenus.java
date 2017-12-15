
public class countmenus {

	public static void main(String[] args) 
	{
		String s="Qspiders to testyantra";
		char[] ch=s.toCharArray();
		s="";
		for(int i=0;i<ch.length;i++)
		{
			int k=i;
			while(ch[i]!=' ' && i<ch.length-1)
			{
				i++;
			}
			int j=i;
			while(j>=k)
			{
				s=s+ch[j];
				j--;
			}
			
			if(i<ch.length-1)
			{
				s=s+ch[i];
			}
		}
		System.out.println(s);
System.out.println();
System.out.println(s);
	}

}
