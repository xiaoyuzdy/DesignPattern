package ProxyPattern;

/**
 * 动态代理需要用到的bean
 * 
 * @author he
 *
 */
public interface PersonBean {
	String getName();

	String getGender();

	String getInterests();

	int getHotOrNotRating();

	void setName(String name);

	void setGender(String gender);

	void setInterests(String interests);

	void setHotOrNotRating(int rating);

}
