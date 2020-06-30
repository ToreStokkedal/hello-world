import java.util.Iterator;
import java.util.Map;

public class GetEnv {

	public GetEnv() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		System.out.println("PATH = " + System.getenv("PATH"));
		
		Map env = System.getenv();
		for (Iterator it=env.entrySet().iterator(); it.hasNext(); ) {
		   Map.Entry entry = (Map.Entry)it.next();
		   System.out.println(entry.getKey() + " = " + entry.getValue());
		}

	}

}
