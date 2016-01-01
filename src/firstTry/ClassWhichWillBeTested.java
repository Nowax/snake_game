package firstTry;

public class ClassWhichWillBeTested {

	private int waznoscPana;
	
	public int add(int n1, int n2) {
		return n1 + n2;
	}
	
	public int sub(int n1, int n2) {
		return n1 - n2;
	}
	
	public int zbierzPlonyZFolwarku(int numerChlopka) {
		if (numerChlopka == 5 && waznoscPana > 10) {
			// ile koszyków jagód
			// SadJagów.zbierz()
			return 6;
		}
		if (numerChlopka == 8) {
			// ile jak z kurnika
			return 7;
		}
		if (numerChlopka == 10) {
			// ilet litrów mleka
			return 9;
		}
	
		return 0;
	}
	
	public void ustawPana(int nowaWaznoscPana) {
		waznoscPana = nowaWaznoscPana;
	}
	
	public int jakiPanWazny() {
		return waznoscPana;
	}
}
