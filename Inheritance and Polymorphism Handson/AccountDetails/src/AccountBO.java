
public class AccountBO {
		String details;
		public FixedAccount getAccountDetail(String detail)
		{
			String a[]  = detail.split(",");
			FixedAccount f = new FixedAccount();
			System.out.println("Account detials:");
			System.out.format("%-20s %-10s %-20s %-20s %s\n","Account Number","Balance","Account holder name","Minimum balance","Locking period");
			System.out.println("\t"+a[0]+"\t"+"\t"+a[1]+"\t"+"\t"+a[2]+"\t"+"\t"+a[3]+"\t"+"\t"+a[4]+"\t"+"\t");
			return f;
		}
}
