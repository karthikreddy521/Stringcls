import java.util.Scanner;

public class Stringcls {
	static String s="hello hi.bye.BYe.";
	static String s1="hello hi... bye bye";
	static String t;
	
	public static void main(String[] args) {
	
	String str=revers(s);
//System.out.println(s.compareTo(s1));
//System.out.println(s.compareToIgnoreCase(s1));
//System.out.println(s.lastIndexOf("BYe"));
//System.out.println(removeCharAt(s,4));
//System.out.println(str);
//exist("hi");
alpha();
//split(".");
twos("0000010101010000");
//comple("001110110000");
	}
	public static String removeCharAt(String a, int l)
	{
		return a.substring(0,l)+a.substring(l+1);
	}
	public static String revers(String k)
	{
		String rev= new StringBuffer(k).reverse().toString();
		return rev;
	}

	public static void exist(String m)
	{
		for(int i=0;i<s.length()-1;i++)
		{   
			//System.out.println(s.length()+"str"+m.length());
			if(i<((s.length()-m.length())+1))
			t=s.substring(i,(i+(m.length())));
			if((t.compareToIgnoreCase(m))==0)
			System.out.println("Found");
			//for(int j=0;j<m.length();j++)
			//{
			//System.out.println(s.substring(i,i+m.length()));
			//}
			//}
		}
		
	}

	public static void split(String c)
	{
		String temp=s;
		int l=0,p=0;
		int i = 0;
		while(i!=-1 && i<=s.length())
		{
			i=temp.indexOf(c);
		//System.out.println(i);
		//System.out.println(temp);
		if(i!=-1)
		{
		System.out.println(temp.substring(0,i));
		temp=temp.substring(i+1);
		//System.out.println(temp);
		l=l+i;
		}
		else
		System.out.println(temp);
		//p=p+1;
		}
		
	}
	static void alpha()
	{ 
		//String z="110000";
		char[] a={'1','b','c','d','e','f'};
		char[] b={'A','B','C','D','E','F'};
		System.out.println(a[2]+b[3]);
	}
	
	static String comple(String k)
	{
		 String temp="",two="";
		//String s="1010";
		 //Scanner sc=new Scanner(System.in);
		// StringBuilder sb=new StringBuilder(temp);
		 
		
			    for(int i=0;i<(k.length());i++)
			    {
			    //System.out.println(k.substring(i,i+1));
			    if((k.substring(i,i+1)).equals("0"))
			    //"==" doesn't work for comparing two strings,if we use compareTo method
			    //it returns int type not boolean.So we should use equals method
			    {
			    	temp+="1";
			    	
			    }
			    else
			    {
			    	temp+="0";
			    }
			    
			    }
			    
		return temp;
			    //System.out.println("\n"+temp);	   
			    
	}
	//we can do it using stringbuilder which can be accessed as an array
	
	static void twos(String d)
	
	{
	
	System.out.println(comple(d));
	String h=comple(d);
	int n=h.lastIndexOf('0');
	if(n==-1)
	{
		System.out.println("1"+d);
	}
	else
	{
	//System.out.println(h.lastIndexOf('0'));
	h=h.substring(0,n)+"1"+comple(h.substring(n+1));
	System.out.print(h);
	}
	}


}