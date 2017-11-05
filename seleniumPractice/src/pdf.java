import java.io.IOException;
import java.util.List;

public class pdf {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		pdfReadeer pdfManager = new pdfReadeer();
		pdfManager.setFilePath("C:\\Users\\DELL\\Desktop\\Amazon.pdf");
	       System.out.println(pdfManager.ToText());   
	       
	       

	}

}
