package ProxyPattern;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * �����ʵ�ʹ������࣬�����о���ʵ��Զ�̷���
 * Ҫ���ΪԶ�̷��������ҪĳЩԶ�̹��ܣ���򵥵ķ�ʽ������չUnicastRemoteObject
 * @author he
 *
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{

	public MyRemoteImpl() throws RemoteException {
		super();
	}

	@Override
	public String sayHello() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
