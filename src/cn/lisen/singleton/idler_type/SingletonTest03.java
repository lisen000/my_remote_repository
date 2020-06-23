package cn.lisen.singleton.idler_type;


public class SingletonTest03 {
    public static void main(String[] args) {
    	Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance1==instance2);
		System.out.println("instance1.hashCode:"+instance1.hashCode());
		System.out.println("instance2.hashCode:"+instance2.hashCode());
}
}

class Singleton{
	private static Singleton instance;
	private Singleton() {}
	//提供一个静态的共有方法，当使用到该方法时，才去instance
	//即懒汉式，并发下不安全
	public static Singleton getInstance() {
		if(instance==null) {
			instance = new Singleton();
		}
		return instance;//如果存在则直接返回实例
	}
}
