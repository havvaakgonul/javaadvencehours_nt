package day02;

public class Advance_2_CamelCase {
	
	/*
	 Write a return method that accepts a sentence as parameter
     * Then converts it to Camelcase
     * (without any space or specialCharacter)
     *
     * Input : I am writing code easily, it is great
     * Output : IAmWritingCodeEasilyItIsGreat
	 */

	public static void main(String[] args) {
		String input = "I am writing code easily, it is great";
		camelCase1(input);
		camelCase2(input);
	}
	private static void camelCase2(String input) {
		StringBuilder camelCase=new StringBuilder();
		String words[]=input.split(" ");
		for(int i=0; i<words.length; i++) {
			camelCase.append(words[i].substring(0, 1).toUpperCase())
					.append(words[i].substring(1).toLowerCase());
		}
		System.out.println(camelCase);
		
	}
	private static void camelCase1(String input) {
		String words[]=input.split(" ");
		String output="";
		for(int i=0; i<words.length; i++) {
			String word=words[i].replaceAll("[^a-zA-Z]", "");
			output+=word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
			
		}
		System.out.println(output);
	}
}
