public abstract class ShieldDecorator extends Square{
	
	ShieldDecorator(){
		super();
	}
	
    @Override
    public abstract void Add(BoardComponent child);
    
	@Override
	public abstract void Operation();
	
	public abstract void Remove(BoardComponent child);
	
}