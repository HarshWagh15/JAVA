package principlesOfOOP;

public class LateSim {
	String networkProvider;
	String networkType;
	String type;
	long simNo;
	
	public LateSim() {
		// Auto Generate Constructor
	}
	
	LateSim(String networkProvider, String networkType, String type, long simNo){
		
		this.networkProvider=networkProvider;
		this.networkType=networkType;
		this.type=type;
		this.simNo=simNo;
	}
	
	public void displaySim() {
		
			System.out.println(networkProvider);
			System.out.println(networkType);
			System.out.println(type);
			System.out.println(simNo);
		}
		
	
	
}
