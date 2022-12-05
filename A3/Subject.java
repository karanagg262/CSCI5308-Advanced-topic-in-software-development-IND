import java.util.ArrayList;

// Square is a composite, making up the Composite pattern (contains components)
public class Subject implements ISubject {
	
	private ArrayList<Observer> observers;
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
		observers = new ArrayList<Observer>();
	}

	@Override
	public void attach(Observer attachObserver) {
		
		observers.add(attachObserver);
	}

	@Override
	public void detach(Observer detachObserver) {
		int i  = observers.indexOf(detachObserver);
		observers.remove(i);
	}

	@Override
	public void notifyAttack() {
		for (Observer obj : observers) {
			obj.update();
		}
		
	}


}
