class ButtonGroup{
	private int activeButton;
	private final Button button;


	public ButtonGroup(int activeButton, Button b1){
		this.activeButton = activeButton;
		this.button = b1;
	}

	public void setActiveButton(int activeButton){
		this.activeButton = activeButton;
	}
	
	public int getActiveButton(){
		return activeButton;
	}

	public void selectedMsg(){
		if(button.getSelected() == true){
		System.out.println("The selected button is true");
		}else{
		System.out.println("The selected button is false");			
		}
	}

}