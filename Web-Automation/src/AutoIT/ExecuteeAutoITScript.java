package AutoIT;

public class ExecuteeAutoITScript {

	public static void main(String[] args) {
		executeAutoITScript();		
	}

	static void executeAutoITScript()
	{
		try
		{
			Runtime.getRuntime().exec("E:\\AutoIT\\sample2.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
