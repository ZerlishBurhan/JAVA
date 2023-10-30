import java.io.FileWriter;


public class FileOutputLab4{
	public static void main(String[] args) throws Exception{
		FileWriter fw=new FileWriter("output.txt");
		
		fw.write("Ahmed"+"\n");
		fw.write("123456789"+"\n");
		fw.write("BS Computer Science"+"\n");
		fw.close();
		
		

	}//main
}//class