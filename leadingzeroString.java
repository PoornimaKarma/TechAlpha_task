package basic_program;

public class leadingzeroString {

	public static void main(String[] args) {
		String st ="000012345";
		String newst = " ";
		int index = 0;
		for(int i=0;i<st.length();i++)
		{
			char ch = st.charAt(i);
			if(ch!='0')
			{
				index=i;
				break;
			}
			
		}
        newst = st.substring(index,st.length());
        System.out.println(newst);
	}

}
