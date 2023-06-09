// Building is the leaf node for the composite pattern, Square's can have MULTIPLE Buildings
// Buildings cannot have children.
public class Building extends BoardComponent implements Observer
{
	private int buildingHealth;
	
	public Building()
	{
		super();
		buildingHealth = 2;
		Subject.Instance().attach(this);
	}

	@Override
	public void Operation()
	{
		// Buildings just stand there, they don't do anything.
	}

	@Override
	public void Add(BoardComponent child)
	{
		// Do nothing, I'm a leaf.
	}

	@Override
	public void Remove(BoardComponent child)
	{
		// Do nothing, I'm a leaf.
	}

	@Override
	public void update(BoardComponent boardComponent) {
		GameBoard.Instance().DecrementBuildingCount();
		if(GameBoard.Instance().GetBuildingCount() == 0) {
			this.Remove(this.parent);
			Subject.Instance().detach(this.parent);
		}
		
	}

}