public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		new Report(user).report();
		new Persister(user).save();

	}
}