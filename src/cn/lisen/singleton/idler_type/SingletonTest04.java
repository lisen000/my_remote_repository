package cn.lisen.singleton.idler_type;

public class SingletonTest04 {
public static void main(String[] args) {
	Single instance1 = Single.getInstance();
	Single instance2 = Single.getInstance();
	System.out.println(instance1==instance2);
	System.out.println("instance1.hashCode:"+instance1.hashCode());
	System.out.println("instance2.hashCode:"+instance2.hashCode());
}
}

//懒汉式（线程安全型）
class Single{
	private static volatile Single singleton;
	private Single() {}
	//提供一个静态的共有方法，当使用到该方法时，才去instance
	//即懒汉式
	public static Single getInstance() {
		if(singleton == null) {
		synchronized (Single.class) {
			if(singleton==null) {		
				singleton = new Single();
			}
		}			
	}
		return singleton;//如果存在则直接返回实例
	}
}