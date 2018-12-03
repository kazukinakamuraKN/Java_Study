package framework;

public class MessageBox implements Product {
	private char decochar;
	public MessageBox(char decochar) {
		//デコレーションする文字列
		this.decochar = decochar;
	}
	@Override
	//デコレーションする
	public void use(String s) {
		int length = s.getBytes().length;
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
		System.out.println(decochar + " " + s + " " + decochar);
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");

	}

	@Override
	//クローンを作り、return、、Managerとおんなじ？？
	public Product createClone() {
		Product p = null;
		try {
			p = (Product)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}

}
