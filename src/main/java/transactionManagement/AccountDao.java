package transactionManagement;

public interface AccountDao {

	public void add(String in, double money);
	public void del(String out, double money);
	
}
