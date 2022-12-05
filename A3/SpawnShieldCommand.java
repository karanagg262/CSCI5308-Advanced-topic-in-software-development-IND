public class SpawnShieldCommand extends Command {

	public SpawnShieldCommand(Object receiver, String[] args) {
		super(receiver, args);
	}

	@Override
	public void Execute() {
		Square shield = new Shield((Square) receiver);

		IAsteroidGameFactory factory = GameBoard.Instance().GetFactory();
		System.out.println("Spawning shield at (" + args[0] + "," + args[1] + ")");
		shield.Add(factory.MakeSquare());	

	}

}
