
public class splitempnameandid {

	public static void main(String[] args) 
	{
		String[] s={"#Mona@M501/","#kamala@k502/","#Sowjanya@S503/"};
		for(int i=0;i<s.length;i++)
		{
			splitstr(s[i]);
		}
	}
	private static void splitstr(String s) 
	{
		String s1="";
		String s2="";
		int l=s.indexOf('@');
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int k=i;
			while(i<ch.length-1 && ch[i]!='@')
			{
				i++;
			}
			int j=i;
			while(k<=j)
			{
				if(k<l && ch[k]!='#')
				{
					s1=s1+ch[k];
				}
				else if(k>l && ch[k]!='/')
				{
					s2=s2+ch[k];
				}
				k++;
			}
		}
		
		System.out.println(s1+"     "+s2);
	}

}
