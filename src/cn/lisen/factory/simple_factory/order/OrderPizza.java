package cn.lisen.factory.simple_factory.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import cn.lisen.factory.simple_factory.SimpleFactory;
import cn.lisen.factory.simple_factory.pizza.CheesePizza;
import cn.lisen.factory.simple_factory.pizza.GreekPizza;
import cn.lisen.factory.simple_factory.pizza.Pizza;

public class OrderPizza {
/*	public OrderPizza() {
		Pizza pizza =null;
		String orderType;
		do {
			orderType=getType();
			if(orderType.equals("greek")) {
				pizza = new GreekPizza();
				pizza.setName("希腊披萨");
			}else if(orderType.equals("cheese")) {
				pizza = new CheesePizza();
				pizza.setName("奶酪披萨");
			}else {
				break;
			}
			//输出pizza制作流程
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.bake(); 
		}while(true);
	}*/
	
	
	//定义一个简单工厂对象
	SimpleFactory simpleFactroy;
	Pizza pizza = null;
	
	//构造器
	public OrderPizza(SimpleFactory simpleFactroy) {
		setFactory(simpleFactroy);
	}
	public void setFactory (SimpleFactory simpleFactroy) {
		String orderType = "";
		this.simpleFactroy = simpleFactroy;//设置简单工厂对象
		do {
			orderType = getType();
			pizza = this.simpleFactroy.createPizza(orderType);
			if(pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			}else {
				System.out.println("订购披萨失败");
				break;
			}
		}while(true);
	}
	
	//写一个方法，可以获取客户希望订购的披萨种类
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza type");
			String str = strin.readLine();
			return str;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}
	}
}

