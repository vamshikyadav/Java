package important_Programs;

public class Bass_Class {
	public void BubbleSort(int[] Arr){
		
		int i, j, num;
		int Lenght = Arr.length;
		
		for (i=0;i <Lenght; i++ ){
			for (j=1;j<(Lenght-i);j++){
				
				if( Arr[j-1] > Arr[j]){
					num = Arr[j-1];
					Arr[j-1] = Arr[j];
					Arr[j] = num;
				}
				
				
			}
		}
	}
	
	public void selectionSort(){
		
	}

	public static void main(String[] args) {

		// below is check the overidding function from super class to base class
		
		MethodOveridding MO = new MethodOveridding();
		sbiintrest sbi = new sbiintrest();
		BFIintrest bfi = new BFIintrest();
		MO.BankIntrest();
		sbi.BankIntrest();
		bfi.BankIntrest();
		

	}

}
