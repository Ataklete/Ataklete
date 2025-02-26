//source code from the jdk
package lesson3.javalabel;

public class Label  {
    public static final int LEFT 	= 0;
    public static final int CENTER 	= 1;
    public static final int RIGHT 	= 2;

    String text;
    int alignment = LEFT;
    public Label(String text, int alignment)  {
			this.text = text;
			setAlignment(alignment);
    }
    public int getAlignment() {
			return alignment;
    }
    public String getText() {
		return text;
    }

    public void setAlignment(int alignment) {
			switch (alignment) {
	  			case LEFT:
	  			case CENTER:
	  			case RIGHT:
	    			this.alignment = alignment;
 	    			return;
			}
			throw new IllegalArgumentException("improper alignment: " +
                                               alignment);
    }
    
    public void setText(String text) {
    		this.text = text;
    }  
    
    //Label class
    public static void main(String[] args)  {
    	
    	Label label = new Label("Hi there!", LEFT);
    	//Label label2 = new Label("text", 17);
    	
    	
    	label.setAlignment(RIGHT);
    	//Can access instance variables that 
    	//are visible with "dot" notation
    	System.out.println("Alignment: " + label.alignment);
    	//Better to access data using getters
    	System.out.println("Alignment: " + label.getAlignment());
    	System.out.println("Text: " + label.getText()); 
    	
    	//try creating a second label to see object reference effect
//    	Label l = new Label("Hello", LEFT);
//    	Label another = l;
//    	another.setText("Goodbye");
//    	System.out.println(another.getText());
//    	System.out.println(l.getText());
//    	
    	
    }
}
