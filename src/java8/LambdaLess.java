package java8;
// without the Lambda Expression 

	interface Drawable{  
	    public void draw();  
	}  
	public class LambdaLess {  
	    public static void main(String[] args) {  
	        int width=10;  
	  
	        //without lambda, Drawable implementation using anonymous class  
	        Drawable d=new Drawable(){  
	            public void draw(){System.out.println("Drawing "+width);}  
	        };  
	        d.draw();  
	    }  
	}  
