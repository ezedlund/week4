/**
 * @author Elijah Edlund - ezedlund
 * CIS175 - Fall 2021
 * Sep 18, 2022
 */
package model;

/**
 * @author 3li
 *
 */
public class unscrambleWord {
	private String word;
	private String unscrambledWord = "";

	public unscrambleWord() {
		super();
	}

	public unscrambleWord(String word) {
		this.word = word;
	}

	// descramble word with reverse of scramble word simple case
	public void activateUnscramble() {

		for (int i = 0; i < this.word.length(); i++) {

			char c = Character.toLowerCase(this.word.charAt(i));

			switch (c) {
			case '0':
				unscrambledWord = unscrambledWord + "a";
				break;
			case 'e':
				unscrambledWord = unscrambledWord + "b";
				break;
			case '1':
				unscrambledWord = unscrambledWord + "c";
				break;
			case 'f':
				unscrambledWord = unscrambledWord + "d";
				break;
			case '2':
				unscrambledWord = unscrambledWord + "e";
				break;
			case 'g':
				unscrambledWord = unscrambledWord + "f";
				break;
			case '3':
				unscrambledWord = unscrambledWord + "g";
				break;
			case 'h':
				unscrambledWord = unscrambledWord + "h";
				break;
			case '4':
				unscrambledWord = unscrambledWord + "i";
				break;
			case 'i':
				unscrambledWord = unscrambledWord + "j";
				break;
			case '5':
				unscrambledWord = unscrambledWord + "k";
				break;
			case 'j':
				unscrambledWord = unscrambledWord + "l";
				break;
			case '6':
				unscrambledWord = unscrambledWord + "m";
				break;
			case 'k':
				unscrambledWord = unscrambledWord + "n";
				break;
			case '7':
				unscrambledWord = unscrambledWord + "o";
				break;
			case 'l':
				unscrambledWord = unscrambledWord + "p";
				break;
			case '8':
				unscrambledWord = unscrambledWord + "q";
				break;
			case 'm':
				unscrambledWord = unscrambledWord + "r";
				break;
			case '9':
				unscrambledWord = unscrambledWord + "s";
				break;
			case 'n':
				unscrambledWord = unscrambledWord + "t";
				break;
			case 'a':
				unscrambledWord = unscrambledWord + "u";
				break;
			case 'o':
				unscrambledWord = unscrambledWord + "v";
				break;
			case 'b':
				unscrambledWord = unscrambledWord + "w";
				break;
			case 'p':
				unscrambledWord = unscrambledWord + "x";
				break;
			case 'c':
				unscrambledWord = unscrambledWord + "y";
				break;
			case 'q':
				unscrambledWord = unscrambledWord + "z";
				break;
			default:
				unscrambledWord = unscrambledWord + "0";
				break;
			}
		}
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getUnscrambledWord() {
		return unscrambledWord;
	}

	// print
	public String print() {
		return "Your word has been unscrambled to: " + this.unscrambledWord;
	}

}
