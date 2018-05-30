package by.epampretraining.kleshchenko.task03;

public class Vowel {
	
	public static boolean isVowel(char vowel) {
		return vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u'
			|| vowel == 'A' || vowel == 'E' || vowel == 'I' || vowel == 'O' || vowel == 'U';
	}
	
	public static boolean isVowel1(char vowel) {
		
		boolean result = false;
		
		switch (vowel) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U': result = true; break; 
		}
		
		return result;
	}
	
	public static boolean isVowel2(char vowel) {
		
		boolean result = false;
		
		if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u'
				|| vowel == 'A' || vowel == 'E' || vowel == 'I' || vowel == 'O' || vowel == 'U') {
			result = true;
		}
		
		return result;
	}
	
	public static boolean isVowel3(char vowel) {
		
		boolean result = false;
		
		if (vowel == 'a' || vowel == 'A') {
			result = true;
		}else if (vowel == 'e' || vowel == 'E') {
			result = true;
		}else if (vowel == 'i' || vowel == 'I') {
			result = true;
		}else if (vowel == 'o' || vowel == 'O') {
			result = true;
		}else if (vowel == 'u' || vowel == 'U') {
			result = true;
		}
		
		return result;
	}
}
