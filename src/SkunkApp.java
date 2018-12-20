
public class SkunkApp
{
	public SkunkUI UserInterfaceSkunk;
	public SkunkDomain DomainSkunk;
	public int playerNumber;
	public String[] playerNames;
	
	public SkunkApp()
	{
		UserInterfaceSkunk = new SkunkUI();
		DomainSkunk = new SkunkDomain(UserInterfaceSkunk);
		UserInterfaceSkunk.setDomain(DomainSkunk); 
		this.playerNumber = 0;
		this.playerNames = new String[20];
		
	}

	/**
	 * Runs the app within an event loop
	 * @return
	 */
	public boolean run()
	{
		return DomainSkunk.run();	
	}
	
	public static void main(String[] args)
	{
		new SkunkApp().run();
	}
	
	

}
