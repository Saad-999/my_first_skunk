
public class SkunkApp
{
	public SkunkUI skunkUI;
	public SkunkDomain skunkDomain;
	public int playerNumber;
	public String[] playerNames;
	
	public SkunkApp()
	{
		skunkUI = new SkunkUI();
		skunkDomain = new SkunkDomain(skunkUI);
		skunkUI.setDomain(skunkDomain); 
		this.playerNumber = 0;
		this.playerNames = new String[20];
		
	}

	/**
	 * Runs the app within an event loop
	 * @return
	 */
	public boolean run()
	{
		return skunkDomain.run();	
	}
	
	public static void main(String[] args)
	{
		new SkunkApp().run();
	}
	
	

}
