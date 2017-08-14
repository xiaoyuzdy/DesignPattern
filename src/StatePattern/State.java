package StatePattern;
 
/**
 * 状态接口，每种状态都要实现该接口
 * 有四种状态：
 * 1、可以售卖
 * 2、卖光
 * 3、购买给的钱不够
 * 4、购买给的钱够
 * @author he
 *
 */
public interface State {
  public void insertQuarter();
  public void ejectQuarter();
  public void turnCrank();
  public void dispense();
}
