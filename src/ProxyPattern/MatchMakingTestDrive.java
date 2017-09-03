package ProxyPattern;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * 动态代理测试
 * 
 * @author he
 *
 */
public class MatchMakingTestDrive {

	private Map<String, PersonBean> dataBase;

	public MatchMakingTestDrive() {
		initializeDataBase();
	}

	public static void main(String[] args) {
		MatchMakingTestDrive test = new MatchMakingTestDrive();
		test.drive();
	}

	
	public void drive(){
		PersonBean joe=getPersonFromDatabase("Joe Javabean");
		PersonBean ownerProxy=getOwnerProxy(joe);
		System.out.println("Name is "+ownerProxy.getName());
		try {
			ownerProxy.setHotOrNotRating(10);
		} catch (Exception e) {
			System.out.println("Can't set rating from owner proxy");
		}
		System.out.println("Rating is "+ownerProxy.getHotOrNotRating());	
	}
	
	private PersonBean getPersonFromDatabase(String name) {
		return dataBase.get(name);
	}

	private void initializeDataBase() {
		dataBase = new HashMap<>();
		PersonBeanImpl joe = new PersonBeanImpl();
		joe.setName("Joe Javabean");
		dataBase.put("Joe Javabean", joe);
	}

	// 创建动态代理
	PersonBean getOwnerProxy(PersonBean pBean) {
		return (PersonBean) Proxy.newProxyInstance(pBean.getClass().getClassLoader(), pBean.getClass().getInterfaces(),
				new OwnerInvocationHandler(pBean));
	}

	// 创建动态代理
	PersonBean getNonOwnerProxy(PersonBean pBean) {
		return (PersonBean) Proxy.newProxyInstance(pBean.getClass().getClassLoader(), pBean.getClass().getInterfaces(),
				new NonOwnerInvocationHandler(pBean));
	}

}
