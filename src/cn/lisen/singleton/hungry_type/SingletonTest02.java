package cn.lisen.singleton.hungry_type;

public class SingletonTest02 {
public static void main(String[] args) {
	Single instance1 = Single.getInstance();
	Single instance2 = Single.getInstance();
	System.out.println(instance1==instance2);
	System.out.println("instance1.hashCode:"+instance1.hashCode());
	System.out.println("instance2.hashCode:"+instance2.hashCode());
}
}

//静态代码块方式
class Single {
	//1、私有构造成员
	private Single() {
		 
	}
	//2、私有成员
	private static Single instance;
	//3、静态代码块初始化
	static {
		instance = new Single();
	}
	//4、提供一个对外访问的公共公共方法，返回对象实例
	public static Single getInstance() {
		return instance;
	}
}
