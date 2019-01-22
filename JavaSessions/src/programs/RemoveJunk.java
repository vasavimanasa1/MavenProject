package programs;

public class RemoveJunk {

	public static void main(String[] args)
	{
		String str = "\u0000\u001f hi \n";
		str = str.replaceAll("[\u0000-\u001f]", "");
	System.out.println(str);
	}

}
