package study;

public class Keisan {
	public static void main(String[]args) {
		Logic a = new Logic();
		a.tasizan(12, 32);
	}
}

class Logic extends mainSuuji implements mainLogic {
	public void tasizan(int a, int b) {
		System.out.println(a + b);
	}
	public void hikizan(int a, int b) {

	}
	int warizan() {
		return 4 / 3;
	}
}

interface mainLogic{
	void tasizan(int a, int b);
	void hikizan(int a, int b);
}

abstract class mainSuuji{
	abstract int warizan();
}