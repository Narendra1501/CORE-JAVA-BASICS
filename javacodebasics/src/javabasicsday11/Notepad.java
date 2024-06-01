package javabasicsday11;

public class Notepad {

	 protected String content;
	 
	 public Notepad() 
	 {
		 this.content = "";
     }
	 
	 public void displayContent()
	 {
		 System.out.println("Notepad Content:" + content);
	 }

}
