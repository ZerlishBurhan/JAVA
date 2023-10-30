class ButtonGroup{

	private int activeButton;
	private final Button button;

	public ButtonGroup(int activeButton, Button b){
		this.activeButton = activeButton;
		this.button = b;
	}

	public void setActiveButton(int activeButton){
		this.activeButton = activeButton;
	}
	public int getActiveButton(){
		return activeButton;
	}
	
	public void selectedMsg(){
		if(button.getSelected() == true){
		System.out.println("button is Seleccted true");
		}else{
		System.out.println("button is Selected false");			
		}
	}

}