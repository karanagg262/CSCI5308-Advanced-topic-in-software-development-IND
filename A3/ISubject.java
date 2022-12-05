import java.util.ArrayList;

public interface ISubject {
	
	public void attach(BoardComponent asteroidAttack);
	public void detach(BoardComponent asteroidAttack);
	public void notifyAttack(BoardComponent asteroidAttack);
		
}


