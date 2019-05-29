package important_Programs;

public class MethodOveridding {
	void BankIntrest(){System.out.println("GDOL....");}
	
}
class sbiintrest extends MethodOveridding {
	void BankIntrest(){System.out.println("Claims....");}
}
class ICICintrest extends MethodOveridding {
	void BankIntrest(){System.out.println("Self-Service....");;}
}
class BFIintrest extends MethodOveridding {
	void BankIntrest(){System.out.println("Payments....");}
}
