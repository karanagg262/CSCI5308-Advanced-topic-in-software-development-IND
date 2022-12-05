public class Shield extends ShieldDecorator implements Observer {

	private Square square;
	
	public Shield() {
		
	}

	public Shield(Square square) {
		super();
	}
	
	@Override
	public void Add(BoardComponent child) {
		GameBoard.Instance().InitializeShieldCount();
		
	}
    
	@Override
	public void Operation() {
		if(GameBoard.Instance().GetShieldCount() < 1) {
			square.Remove(this);	
		}
	}
	
	@Override
	public void Remove(BoardComponent child) {
		if(this.square != null) {
			square.Remove(this);
		}
	}
	
	@Override
	public void update() {
		GameBoard.Instance().DecrementShieldCount();
		if(GameBoard.Instance().GetShieldCount() == 0) {
			Remove(this);
		}
	}

}
