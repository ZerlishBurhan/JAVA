class Videosong extends Song{
	
	private String resolution;

	public Videosong(){

	}
	public Videosong(String title ,int duration,String artist,String resolution){
		super( title , duration, artist);
		this.resolution = resolution;
	}

	public String toString(){
		super.toString();
		return "\nResolution: " + resolution;
	}

}