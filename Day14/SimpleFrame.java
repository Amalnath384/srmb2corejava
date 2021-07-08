package Day14;

	import java.awt.Component;
	import java.awt.Frame;
	import java.awt.TextArea;
	 
	public class SimpleFrame {
	 
	  public static void main(String[] args) {
	 
	Frame frame = new Frame("Simple Frame");
	 
	Component textArea = new TextArea("Sample text...");
	 	 
	frame.add(textArea);
	 
	frame.setSize(200, 300);
	 
	frame.setVisible(true);
	 
	  }
	}

