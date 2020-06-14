package cn.lisen.factory.factorymethod.pizza;

public abstract class Pizza {
	protected String name;
	//准备原材料，不同的披萨不一样，所有使用抽象方法
	public abstract void prepare();
	
	public void bake() {
		System.out.println(name+" "+"backing;");
	}
	public void cut() {
		System.out.println(name+" "+"cutting;");
	}
	public void box() {
		System.out.println(name+" "+"boxing");
	}

	public void setName(String name) {
		this.name = name;
	}
}
