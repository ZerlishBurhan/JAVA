class PImageButton extends Button{
	
	private int pImageId;
	private String pImageName;

	public PImageButton(){

	}

	public PImageButton(int pImageId, String pImageName){
		this.pImageId = pImageId;
		this.pImageName = pImageName;
	}

	public PImageButton(int pImageId, String pImageName , int x ,int y , String color , boolean selected ){
		super(x , y , color , selected);
		this.pImageId = pImageId;
		this.pImageName = pImageName;
	}

	public void changeSelected(){
		if(getSelected()==true)
			setSelected(false);
		else
			setSelected(true);
	}

	public void display(){
		super.display();
		}

}