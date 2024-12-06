import ir.freeland.model.Account;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class accountscomparetor implements java.util.Comparator<Account>{
	@Override
	public int compare(Account a, Account b) {
		return a.getBalance() - b.getBalance();
	}
}

public class Application {
	
	public static void main(String[] args) {
		//new
		Account Account1 = new Account("Account1", "t1", 10000);
		Account Account2 = new Account("Account2", "t2",20000);
		Account Account3 = new Account("Account3", "t3", 15000);
		Account Account4 = new Account("Account4", "t4", 2000);
		Account Account5 = new Account("Account5", "t5", 15800);
		Account Account6 = new Account("Account6", "t6", 10000);
		//add to list
		List<Account> account = new ArrayList<>();
		account.add(Account1);
		account.add(Account2);
		account.add(Account3);
		account.add(Account4);
		account.add(Account5);
		account.add(Account6);
		//print
		for (Account Account : account) {
			System.out.println("Account name is : " + Account.getName() + " , branch code is : " + Account.getBranch() + " , balance is :" + Account.getBalance() + "$");
		}
		System.out.println("-----------------------------------------------");

		// compare
		Collections.sort(account, new accountscomparetor());
		System.out.println(account);
		System.out.println("-----------------------------------------------");

		
		System.out.println(account.reversed());
		System.out.println("-----------------------------------------------");

		//map
		Map<String, Account> map = new HashMap<>();
		for(int i =0; i<account.size();i++) {
			map.put("i"+ i + " : ", account.get(i));
		}
		
		map.forEach((key,value)->System.out.println(key+" "+value));
		

		
		

	}

}
