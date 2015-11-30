
public class MainClass {

	public static void main(String[] args) {

		InputOutput streams = new InputOutput();
		HashTable hashtable = new HashTable();
		
		/*
		FulltimeEmployee apple = new FulltimeEmployee(123, "Apple", 50000.0f, 98.7f);
		FulltimeEmployee banana = new FulltimeEmployee(124, "Banana", 51000.0f, 97.7f);
		FulltimeEmployee cranberry = new FulltimeEmployee(125, "Cranberry", 52000.0f, 96.7f);
		FulltimeEmployee durian = new FulltimeEmployee(126, "Durian", 53000.0f, 95.7f);
		FulltimeEmployee watermelon = new FulltimeEmployee(127, "Watermelon", 54000.0f, 94.7f);
		
		streams.addFulltimeEmployee(apple, hashtable);
		streams.addFulltimeEmployee(banana, hashtable);
		streams.addFulltimeEmployee(cranberry, hashtable);
		streams.addFulltimeEmployee(durian, hashtable);
		streams.addFulltimeEmployee(watermelon, hashtable);
		*/
		
		streams.loadData(hashtable);
		hashtable.printTable();
	}

}
