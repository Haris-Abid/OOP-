public class SystemUnit{

	private String cpuName,lcdModel;
	private int discSize, ramSize,systemId;
	private static int counter=1; 

	public SystemUnit(String cpuName,String lcdModel,int discSize,int ramSize){
		this. cpuName=cpuName;
		this.lcdModel=lcdModel;
		this.discSize=discSize;
		this.ramSize=ramSize;
		systemId=counter;
		counter++;
	}

// setters
	public void setCpuName (String cpuName){
		this.cpuName=cpuName;	
	}

	public void setLcdModel (String lcdModel){
		this.lcdModel=lcdModel;	
	}

	public void setRamsize (int ramSize ){
		this.ramSize=ramSize;	
	}

	public void setDiscsize (int discSize){
		this.discSize=discSize;	
	}

//getters
	public String getCpuName (){
		return cpuName;	
	}

	public String getLcdModel (){
		return lcdModel;	
	}

	public int getRamsize (){
		return ramSize;	
	}

	public int getDiscsize (){
		return discSize;	
	}
	
		public int getSystemId (){
		return systemId;	
	}

}
