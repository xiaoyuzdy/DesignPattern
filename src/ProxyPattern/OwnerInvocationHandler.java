package ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * InvocationHandler 的工作是响应代理的任何调用，
 * 可把InvocationHandler当作代理收到方法调用后，请求做实际工作的对象
 * @author he
 *
 */
public class OwnerInvocationHandler implements InvocationHandler{

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

}
