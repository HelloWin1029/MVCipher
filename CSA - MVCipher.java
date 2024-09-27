public class Main{
    
    public static final int LOWER_CASE_MAX = 122;
    public static final int LOWER_CASE_MIN = 97;
    public static final int UPPER_CASE_MAX = 90;
    public static final int UPPER_CASE_MIN = 65;
    
	public static void main(String[] args) {
		String key = "FRUIT", input = "Attackathours", output = "";
		for (int i = 0, j = 0; i < input.length(); i++, j = (j + 1) % key.length()){
		    int shift = key.charAt(j) - 'A' + 1;
		    int newCharNum = input.charAt(i) + shift;
		    if (Character.isUpperCase(input.charAt(i)) && newCharNum > 90){
		        newCharNum = newCharNum - UPPER_CASE_MAX - 1 + UPPER_CASE_MIN;
		    }
		    else if (Character.isLowerCase(input.charAt(i)) && newCharNum > 122){
		        newCharNum = newCharNum - LOWER_CASE_MAX - 1 + LOWER_CASE_MIN;
		    }
		    output += (char)(newCharNum);
		}
		System.out.println(output);
		
		String decrypt = "";
		for (int i = 0, j = 0; i < output.length(); i++, j = (j + 1) % key.length()){
		    int shift = key.charAt(j) - 'A' + 1;
		    int newCharNum = output.charAt(i) - shift;
		    if (Character.isUpperCase(output.charAt(i)) && newCharNum < 65){
		        newCharNum = newCharNum - UPPER_CASE_MIN + 1 + UPPER_CASE_MAX;
		    }
		    else if (Character.isLowerCase(output.charAt(i)) && newCharNum < 97){
		        newCharNum = newCharNum - LOWER_CASE_MIN + 1 + LOWER_CASE_MAX;
		    }
		    decrypt += (char)(newCharNum);
		}
		System.out.println(decrypt);
	}
}
