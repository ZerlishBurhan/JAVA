class engine{
	private int engineSize;
	private String engineType;
	private boolean engineRunning;
	public int topSpeed;

	public void setengineSize(int engineSize){
		this.engineSize = engineSize;
	}//set
	public int getengineSize(){
		return engineSize;
	}//get


	public void setengineType(String engineType){
		this.engineType = engineType;
	}//set
	public String  getengineType(){
		return engineType;
	}//get


	public void setengineRunning(boolean engineRunning){
		this.engineRunning = engineRunning;
	}//set
	public boolean getengineRunning(){
		return engineRunning;
	}//get


	public void settopSpeed(int topSpeed){
		this.topSpeed = topSpeed;
	}//set
	public int gettopSpeed(){
		return topSpeed;
	}//get

	public engine(){

	}//0-ARG


	public engine(int engineSize, String engineType, boolean engineRunning, int topSpeed){
			this.engineSize = engineSize;
			this.engineType = engineType;
			this.engineRunning = engineRunning;
			this.topSpeed = topSpeed;

	}//


	public engine(engine arg){
		this.engineSize = arg.engineSize;
			this.engineType = arg.engineType;
			this.engineRunning = arg.engineRunning;
			this.topSpeed = arg.topSpeed;
	}//

	public boolean startEngine(){

		// boolean isStarted = true;

		// if(!isEngineRunning()){
		// 	this.setengineRunning(true);
		// }
		// else{
		// isStarted = false;
		// }
		// return isStarted;

		this.engineRunning = true;
		return engineRunning;
	}

	public boolean stopEmgine(){
		this.engineRunning = false;
		return engineRunning;
	}
	public boolean isEngineRunning(){
		// if(this.startEngine() == true){
		// 	return true;
		// }else{
		// 	return false;
		// }
		return engineRunning;
	}

	public void currentEngineState(){
		System.out.println("the Engine Size is : " + this.getengineSize());
		System.out.println("the Engine TYPE is : " + this.getengineType());
		System.out.println("Is the Engine running : " + this.isEngineRunning());
		System.out.println("the top Speed of the car is " + this.gettopSpeed());
	}
}//engineila