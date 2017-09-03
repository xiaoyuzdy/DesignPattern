package SingletonPattern;

import java.io.ObjectStreamException;

/**
 * ����ģʽ
 * 
 * @author he
 *
 */
public class Signleton {
	// private volatile static Signleton signleton;

	// private static Signleton signleton = new Signleton();// ��Ӧ�����з�ʽ

	private Signleton() {
	}

	// /**
	// * ��һ�з�ʽ��ȱ�㣬���̷߳���ʱ����ȫ
	// *
	// * @return
	// */
	// public static Signleton getInstance() {
	// if (signleton == null) {
	// signleton = new Signleton();
	// }
	// return signleton;
	// }

	/**
	 * �ڶ��з�ʽ ����ͬ���ؼ��֣�����˶��̷߳��ʰ�ȫ������
	 * ȱ�㣺�ή�����ܣ���Ϊһ�����ú�signleton�������Ͳ���Ҫͬ���ˣ�֮��ÿ�ε��ø÷����ή������
	 * 
	 * @return
	 */
	// public static synchronized Signleton getInstance() {
	// if (signleton == null) {
	// signleton = new Signleton();
	// }
	// return signleton;
	// }

	/**
	 * �����ַ�ʽ�� ˫�ؼ����������ȼ��ʵ���Ƿ��Ѿ����������δ�����Ž���ͬ�����ƣ� ����ֻ�е�һ�λ�ͬ�������������
	 * 
	 * @return //
	 */
	// public static Signleton getInstance() {
	// if (signleton == null) {
	// synchronized (Signleton.class) {
	// if (signleton == null) {
	// signleton = new Signleton();
	// }
	// }
	// }
	// return signleton;
	// }
	//
	/**
	 * �����ַ�ʽ�����Ӧ�ó������Ǵ�����ʹ�õ���ʵ���������ھ�ͷ��ʼ�����д��������� ʹ��ʱֱ�ӷ���
	 *
	 * @return
	 */

	// public static Signleton getInstance() {
	//
	// return signleton;
	// }
	//
	/**
	 * �����ַ�ʽ��ʹ�þ�̬�ڲ���ʵ�ֵ���,��ȶ���ģʽ�����ڵ�һ�μ���Signleton��ʱ�ͳ�ʼ��sInstance,
	 * ֻ���ڵ���getInstanceʱ�Ż��ʼ��
	 */

	public static Signleton getInstance() {
		return SignletonHolder.sInstance;
	}

	private static class SignletonHolder {
		private static final Signleton sInstance = new Signleton();
	}

	/**
	 * �����ַ�ʽ��ͨ��ö��ʵ�ֵ������ô���Ĭ���̰߳�ȫ�����κ�����¶��ǵ�������ʹ�ڷ����л���ʱ��
	 */

//	public enum SingletonEnum {
//		INSTANCE;
//		// TODO һЩ��ķ���
//		public void doSomthing() {
//
//		}
//	}

	/**
	 * ����÷����ž��ڷ����л�ʱ��д���ɶ���
	 *
	 * @return
	 * @throws ObjectStreamException
	 */
	private Object readResolve() throws ObjectStreamException {
		return SignletonHolder.sInstance;

	}

}
