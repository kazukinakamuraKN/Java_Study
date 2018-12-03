package study;

public class Study_this {
	int a = 0;

	public boolean hikaku(Object o) {
		if(this == o) {
			return true;
		}else {
			return false;
		}
	}
	//mainメソッドしかインスタンス生成できないのかと思ったけどそんなことはなかった。
	MainInstance ins = new MainInstance();


}
