package drawGraphics;

public class OutsideBounds extends Exception { 
	private static final long serialVersionUID = 42L;
	
    public OutsideBounds(String errorMessage) {
        super(errorMessage);
    } 

}
