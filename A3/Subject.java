import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Square is a composite, making up the Composite pattern (contains components)
public class Subject implements ISubject {
	
	private ArrayList<BoardComponent> observers;
	private static Subject instance = null;
	
	public static Subject Instance()
	{
		if (null == instance)
		{
			instance = new Subject();
		}
		return instance;
	}
	
	public Subject() {
		observers = new ArrayList<BoardComponent>();
	}

	@Override
	public void attach(BoardComponent attachObserver) {
		
		observers.add(attachObserver);
	}

	@Override
	public void detach(BoardComponent detachObserver) {
		int i  = observers.indexOf(detachObserver);
		observers.remove(i);
	}

	@Override
	public void notifyAttack(BoardComponent boardcomponent) {
		List<BoardComponent>  abc = new CopyOnWriteArrayList(observers);
		for (BoardComponent obj : abc) {
			obj.update(boardcomponent);
		}
		
	}


}
