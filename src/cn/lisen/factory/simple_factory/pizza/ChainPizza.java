package cn.lisen.factory.simple_factory.pizza;

public class ChainPizza extends Pizza{

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("给中国披萨加料：");
	}

}
