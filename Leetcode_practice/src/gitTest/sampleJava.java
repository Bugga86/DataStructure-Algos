package gitTest;

public class sampleJava {
	
	public String textDisplay(int n){
		String msg1 = "Hello!! how are you doing";
		String msg2 = "Ola!!";
		if (n ==1 ){
			return msg1;
		}
		else{
			return msg2;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sampleJava s1 = new sampleJava();
		System.out.println(s1.textDisplay(1));
	}

}
