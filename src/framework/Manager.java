package framework;

import java.util.HashMap;

public class Manager {
	//入れ物
	private HashMap<String,Product> showcase = new HashMap<String,Product>();
	//入れ物に入れる
	public void register(String name, Product proto) {
		showcase.put(name, proto);
	}
	//クローンを作り、return
	public Product create(String protoname) {
		Product p = (Product)showcase.get(protoname);
		return p.createClone();
	}
}
