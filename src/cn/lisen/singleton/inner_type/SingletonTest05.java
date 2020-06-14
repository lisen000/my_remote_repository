package cn.lisen.singleton.inner_type;


public class SingletonTest05 {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance1==instance2);
		System.out.println("instance1.hashCode:"+instance1.hashCode());
		System.out.println("instance2.hashCode:"+instance2.hashCode());
	
    
	}
}

//静态内部类完成单例
class Singleton{
	
	private static volatile Singleton instance;
	//私有构造
	private Singleton() {}
	//静态内部类加载实例
	private static class SingletonInstance {
		private static final Singleton INSTANCE =new Singleton();
	}
	//提供一个静态公共方法，JVM加载class只进行一次
	public static Singleton getInstance() {
		return SingletonInstance.INSTANCE;
	}
}
