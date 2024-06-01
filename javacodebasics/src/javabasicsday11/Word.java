package javabasicsday11;

public class Word extends Wordpad {
	private boolean spellCheckEnabled = true ;
	
	public Word ()
	{
		super();
		this.spellCheckEnabled = true;
	}
    
	public void spellCheck() {
		if(spellCheckEnabled) {
			System.out.println("Running spell check...");
			
		}else {
			System.out.println("spell check is disabled.");
		}
	}

	public void enableSpellCheck(boolean enable)
	{
	}

	public void write(String string) {
		// TODO Auto-generated method stub
		
	}
}