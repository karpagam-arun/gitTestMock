package gitTestProject;

public class gitTest {
	//QA2
	//reverse String & palindrome
	public static void main(String[] args) {
		String s="malayalam";
		String r=" ";
		for(int i=s.length()-1;i>=0;i--) {
			r=r+s.charAt(i);
		}
		System.out.println("QA2 Reverse String"+r);
		System.out.println("hai my name is QA2");
		if(s.equals(r)) {
			
			System.out.println("palindrome");
			
			
		}else {
			System.out.println("not palindrome");
		}}}
