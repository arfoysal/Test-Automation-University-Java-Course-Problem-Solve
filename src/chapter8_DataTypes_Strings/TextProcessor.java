package chapter8_DataTypes_Strings;

public class TextProcessor {

	public static void main(String[] args) {
		countWords("I love Test Automation University", " ");
		System.out.println("--------------------------");
		countWords("avacado", "a");
		System.out.println("--------------------------");
		reverseString("Hello TAU!");
		System.out.println();
		System.out.println("--------------------------");
		addSpaces("HeyWorld!It'sMeAngie");
	}

	/**
	 * Splits a String into an array by tokenizing it. Counts words and prints them
	 * 
	 * @param text      Full string to be split
	 * @param delimiter where to split
	 */
	public static void countWords(String text, String delimiter) {
		var words = text.split(delimiter);
		int numberOfWords = words.length;

		String message = String.format("Your text contains %d words:", numberOfWords);
		System.out.println(message);

		for (int i = 0; i < numberOfWords; i++) {
			System.out.println(words[i]);
		}

	}

	/**
	 * Prints a String in reverse order
	 * 
	 * @param text String to reverse
	 */
	public static void reverseString(String text) {
		for (int i = text.length() - 1; i >= 0; i--) {
			System.out.print(text.charAt(i));
		}
	}
	/**
     * Adds spaces before each uppercase letter
     * @param text jumbled text
     */
    public static void addSpaces(String text){

        var modifiedText = new StringBuilder(text);

        for(int i=0; i< modifiedText.length(); i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }

        System.out.println(modifiedText);
    }

}
