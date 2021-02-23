
public class ArrayList {

	public String[] array;
	public int size;

	public ArrayList (){
		
		this.array = new String[10];
		this.size = 0;//i think this is the problem?
	}
	
	public String get (int i) {
		
		if (i>=size) {
			System.out.println("There is no value");
		}
	
			return array[i];
		
	}
	
	public void remove (int i) {
		for (int j = i; j < size-1; j++) {
			array[j] = array [j+1];
		}
		
		array[size-1] = null;
		
		size --;
	}
	
	public void set (int i, String entry) {
		array [i] = entry;
	}
	
	public void add(int i, String entry) {
		for (int j = size - 1; j > i ; j--) {
			array [j + 1] = array [j];//what does this means?
		}
		array [i] = entry;
		size ++;
	}
	
	public void resize() {
		String[] newArray = new String [20];
		for (int i = 0; i < array.length; i++) {
			newArray [i] = array [i];
		}
		array = newArray;
	}
}
