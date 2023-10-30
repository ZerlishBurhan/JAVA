class PImageButton extends Button{
	
	private int pImageId;
	private String pImageName;

	public PImageButton(){

	}

	public PImageButton(int pImageId, String pImageName){
		this.pImageId = pImageId;
		this.pImageName = pImageName;
	}

	public PImageButton(int pImId, String pImName , int a ,int b , String c , boolean s ){
		super(a ,b, c, s);
		pImageId = pImId;
		pImageName = pImName;
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