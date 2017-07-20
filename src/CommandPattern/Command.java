package CommandPattern;

/**
 * 命令接口
 * @author he
 *
 */
public interface Command {
	/**
	 * 执行
	 */
	public void execute();
	
	/**
	 * 撤销
	 */
	public void undo();
}
