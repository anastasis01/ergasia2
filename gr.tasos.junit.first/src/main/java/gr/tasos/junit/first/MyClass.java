package gr.tasos.junit.first;

public class MyClass {
	public static String sub(int a,int b) {
		   String result="";
		   if (a-b>0) {
			   result="POSITIVE";
		   }
		   if (a-b<0) {
			   result="NEGATIVE";
		   }
		   return result;
	   }
}
