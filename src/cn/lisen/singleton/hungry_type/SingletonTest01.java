package cn.lisen.singleton.hungry_type;

public class SingletonTest01 {
	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance1==instance2);
		System.out.println("instance1.hashCode:"+instance1.hashCode());
		System.out.println("instance2.hashCode:"+instance2.hashCode());
	}
}

//饿汉式(静态变量)
class Singleton {
	//1、私有构造成员
	private Singleton() {
		
	}
	//2、私有静态成员并直接初始化
	private final static Singleton instance = new Singleton();
	//3、提供一个对外访问的公共方法，返回对象实例
	public static Singleton getInstance() {
		return instance;
	}
}
