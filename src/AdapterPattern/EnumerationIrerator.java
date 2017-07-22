package AdapterPattern;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * ÊÊÅäÆ÷£¬½«EnumerationÊÊÅäÎªIterator
 * 
 * @author he
 * @param <T>
 *
 */
public class EnumerationIrerator<T> implements Iterator<T> {

	private Enumeration<T> enumeration;

	public EnumerationIrerator(Enumeration<T> enumeration) {
		this.enumeration = enumeration;
	}
 
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return enumeration.hasMoreElements();
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		return enumeration.nextElement();
	}
	
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
	

}
