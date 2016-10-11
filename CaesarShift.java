public class CaesarShift {

	public static void main(String[] args) {
		String message = "Hello World!"; //Create standard message to test
		String encoded = encode(message, 5); //Encoding the message
		System.out.println(encoded);
		String decoded = encode(encoded, -5); //Decoding is just Encoding with a negative shift so no need for an extra method
		System.out.println(decoded);
	}

	public static String encode(String message, int shift) {
		String finalString = ""; //This is necessary so the characters have somewhere to go
		for (char c : message.toCharArray()) finalString += ((c >= 65 && c <= 90) ? (char) ((((c - 65 + shift) % 26 < 0) ? ((c - 65 + shift + 26) % 26) : (c - 65 + shift) % 26) + 65) : ((c >= 97 && c <= 122) ? (char) ((((c - 97 + shift) % 26 < 0) ? ((c - 97 + shift + 26) % 26) : (c - 97 + shift) % 26) + 97) : c)); //This is where the magic happens. It loops through every character then does some checks to see if it is upper or lower case, then checks if the shift pushes it over the limits, accounts for it, then adds them to the finalString
		return finalString;
	}
}
