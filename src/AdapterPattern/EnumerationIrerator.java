package AdapterPattern;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	
	
	public static boolean check(){
		String s="a:2£ºef";
//		String s="123,45";
		String str=s.replaceAll("(:|£º)+", "Ìæ»»");
		System.out.println(str);
		Pattern pattern=Pattern.compile("\\w+(£º|:)\\w+(£º|:)\\w+");
		Matcher matcher=pattern.matcher(s);
		return matcher.matches();
		
	}
	
	public static void main(String[] args) {
		System.out.println(check());
	}
	
	
	

}
