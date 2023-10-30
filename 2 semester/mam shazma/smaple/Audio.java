class Audio extends Song{
	
	private int volume;

	public Audio(){

	}
	public Audio(String title ,int duration,String artist,int volume){
		super( title , duration, artist);
		this.volume = volume;
	}

	public String toString(){
		super.toString();
		return "\nVolume : " + volume;
	}

}