import java.util.ArrayList;

public interface ISubject {
	
	public void attach(Observer asteroidAttack);
	public void detach(Observer asteroidAttack);
	public void notifyAttack();
		
}


