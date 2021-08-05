package Abstract;

public abstract class ParentAirCraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//mehtod with implementation
    public void SafetyGuidelines()
    {
    	System.out.println("Follow Safety Guidelines");
    	
    }
    public void EngineGuidelines()
    {
    	System.out.println("Follow Engine Guidelines");
    }
    //method with implementation called abstract we have to place cursor on error place and change the absstract keyword into it
    public abstract void  BodyColor();
}
