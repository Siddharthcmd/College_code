package javaproject;

public class split3 {

	public static void main(String[] args) {
		String s = "   !! !He is  a        v@@@@ery very good______????????? ... boy,!!!!!! isn!!!???''',,!!!!'t he!!!!!!?ert      ";
		String s1[]=s.split("[!, '?@._]+");
		String s2=String.join("\n", s1);
		if(s1[0]>"a" && s1[0]<="z" || s1[0]=="A" && s1[0]<="Z" )
		{
			int x=s1.length;
		}
		System.out.print(s1.length);
		System.out.println(s2+"\n");

	}

}
