package ProxyPattern;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * �����ʵ�ʹ������࣬�����о���ʵ��Զ�̷��� Ҫ���ΪԶ�̷��������ҪĳЩԶ�̹��ܣ���򵥵ķ�ʽ������չUnicastRemoteObject
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
			//ע�����
			Naming.rebind("RemoteHello", remote);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
