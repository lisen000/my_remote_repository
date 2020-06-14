package cn.lisen.factory.simple_factory.order;

import cn.lisen.factory.simple_factory.SimpleFactory;

public class PizzaStore {
	public static void main(String[] args) {
		//new OrderPizza();
		//使用简单工厂模式
		new OrderPizza(new SimpleFactory());
		System.out.println("退出程序！");
	}
}
