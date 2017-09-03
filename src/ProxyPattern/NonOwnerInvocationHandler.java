package ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * InvocationHandler 的工作是响应代理的任何调用， 
 * 可把InvocationHandler当作代理收到方法调用后，请求做实际工作的对象
 * 
 * @author he
 *
 */
public class NonOwnerInvocationHandler implements InvocationHandler {

	PersonBean person;

	public NonOwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			if (method.getName().startsWith("get")) {
				return method.invoke(person, args);
			} else if (method.getName().equals("setHotOrNotRating")) {
				return method.invoke(person, args);
			} else if (method.getName().startsWith("set")) {
				return new IllegalAccessException();
			}
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

}
