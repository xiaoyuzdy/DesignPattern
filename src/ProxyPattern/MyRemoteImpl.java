package ProxyPattern;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 服务端实际工作的类，该类中具体实现远程方法 要想成为远程服务对象，需要某些远程功能，最简单的方式就是扩展UnicastRemoteObject
 * 
 * @author he
 *
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	public MyRemoteImpl() throws RemoteException {
		super();
	}

	@Override
	public String sayHello() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		
		try {
			MyRemote remote = new MyRemoteImpl();
			//注册服务
			Naming.rebind("RemoteHello", remote);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
