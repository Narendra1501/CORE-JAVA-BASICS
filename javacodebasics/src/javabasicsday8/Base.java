package javabasicsday8;

public class Base {

      int varDefault=10;
      public int varPublic=20;
      private int varPrivate=30;
      protected int varProtected=40;
      
      
      void methodDefault()
      {
    	  System.out.println("Deafault access Base class");
    	  System.out.println("Deafault Variable :"+varDefault);
      }	  
	
      public void methodpublic()
      {
    	  System.out.println("Public access Base class");
    	  System.out.println("Public Variable :"+varPublic);
      }
      
      public void methodPrivate()
      {
    	  System.out.println("Private access Base class");
    	  System.out.println("Public variable :"+varPrivate);
      }
      protected void methodProtected()
      {
    	  System.out.println("Protected access Base class");
    	  System.out.println("protected varaible :"+varProtected);
      
      
	}

}
