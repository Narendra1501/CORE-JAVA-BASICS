package javabasicsday11;

public class TextEditor {

	public static void main(String[] args) {
		
          Word word = new Word();
          
          word.write("hello");
          word.formattext(true);
          word.write("World !");
          word.displayContent();
          
          word.spellCheck();
          
          System.out.println("Is text in Wordpad bold?" + word.isBold());
          System.out.println("Disabling spell check in word.");
          word.enableSpellCheck(false);
          word.spellCheck();
	}

}
