package ProxyPattern;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 远程代理需要实现的接口,
 * Remote属于RMI，该接口支撑远程调用
 * 
 * @author he
 *
 */
public interface MyRemote  extends Remote{
    /**
     * 远程调用有很大的风险，需要为每个方法声明该异常
     * @return
     * @throws RemoteException
     */
	public String sayHello() throws RemoteException;
}
