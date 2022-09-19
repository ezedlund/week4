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
public class scrambleWord {
	private String word;
	private String scrambledWord = "";

	public scrambleWord() {
		super();
	}

	public scrambleWord(String word) {
		this.word = word;
	}

	// Scramble word with very simply case
	public void activateScramble() {

		for (int i = 0; i < this.word.length(); i++) {

			char c = Character.toLowerCase(this.word.charAt(i));

			switch (c) {
			case 'a':
				scrambledWord = scrambledWord + "0";
				break;
			case 'b':
				scrambledWord = scrambledWord + "e";
				break;
			case 'c':
				scrambledWord = scrambledWord + "1";
				break;
			case 'd':
				scrambledWord = scrambledWord + "f";
				break;
			case 'e':
				scrambledWord = scrambledWord + "2";
				break;
			case 'f':
				scrambledWord = scrambledWord + "g";
				break;
			case 'g':
				scrambledWord = scrambledWord + "3";
				break;
			case 'h':
				scrambledWord = scrambledWord + "h";
				break;
			case 'i':
				scrambledWord = scrambledWord + "4";
				break;
			case 'j':
				scrambledWord = scrambledWord + "i";
				break;
			case 'k':
				scrambledWord = scrambledWord + "5";
				break;
			case 'l':
				scrambledWord = scrambledWord + "j";
				break;
			case 'm':
				scrambledWord = scrambledWord + "6";
				break;
			case 'n':
				scrambledWord = scrambledWord + "k";
				break;
			case 'o':
				scrambledWord = scrambledWord + "7";
				break;
			case 'p':
				scrambledWord = scrambledWord + "l";
				break;
			case 'q':
				scrambledWord = scrambledWord + "8";
				break;
			case 'r':
				scrambledWord = scrambledWord + "m";
				break;
			case 's':
				scrambledWord = scrambledWord + "9";
				break;
			case 't':
				scrambledWord = scrambledWord + "n";
				break;
			case 'u':
				scrambledWord = scrambledWord + "a";
				break;
			case 'v':
				scrambledWord = scrambledWord + "o";
				break;
			case 'w':
				scrambledWord = scrambledWord + "b";
				break;
			case 'x':
				scrambledWord = scrambledWord + "p";
				break;
			case 'y':
				scrambledWord = scrambledWord + "c";
				break;
			case 'z':
				scrambledWord = scrambledWord + "q";
				break;
			default:
				scrambledWord = scrambledWord + "d";
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

	public String getScrambledWord() {
		return scrambledWord;
	}

	// print
	public String print() {
		return "Your word has been scrambled to: " + this.scrambledWord;
	}

}
