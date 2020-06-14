package cn.lisen.factory.simple_factory;

import cn.lisen.factory.simple_factory.pizza.ChainPizza;
import cn.lisen.factory.simple_factory.pizza.CheesePizza;
import cn.lisen.factory.simple_factory.pizza.GreekPizza;
import cn.lisen.factory.simple_factory.pizza.PepperPizza;
import cn.lisen.factory.simple_factory.pizza.Pizza;

public class SimpleFactory {
	
	public Pizza createPizza(String orderType) {
		Pizza pizza = null;
		System.out.println("使用简单工程模式");
		if(orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName("希腊披萨");
		}else if(orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName("奶酪披萨");
		}else if(orderType.equals("pepper")) {
			pizza = new PepperPizza();
			pizza.setName("胡椒披萨");			
		}else if(orderType.endsWith("chain")) {
			pizza = new ChainPizza();
			pizza.setName("中国披萨");
		}
		return pizza;
	}
}
