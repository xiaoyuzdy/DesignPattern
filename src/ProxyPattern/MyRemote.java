package ProxyPattern;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Զ�̴�����Ҫʵ�ֵĽӿ�,
 * Remote����RMI���ýӿ�֧��Զ�̵���
 * 
 * @author he
 *
 */
public interface MyRemote  extends Remote{
    /**
     * Զ�̵����кܴ�ķ��գ���ҪΪÿ�������������쳣
     * @return
     * @throws RemoteException
     */
	public String sayHello() throws RemoteException;
}
