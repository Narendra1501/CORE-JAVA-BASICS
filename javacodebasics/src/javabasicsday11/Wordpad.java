package javabasicsday11;

public class Wordpad extends Notepad {
   
	  private boolean isBold;
	  
	  public Wordpad()
	  {
		  super();
		  this.isBold = false;
	  }
	  
	  public void formattext(boolean bold)
	  {
		  if (bold) {
			  content = "<b>" + content + "</b>";
		  }
		  isBold = bold;
      }
	  
	  public boolean isBold() {
		  return isBold;
	  }
}

