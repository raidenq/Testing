
public class factoring {
	public static int[] factor(int n){
		int[] factors = {};
		int counter = 0;
			for(int i = 0; i <= n/2; i++){
				int[] factorses = new int[counter];
				if(n % i == 0){
					counter++;
					
					factorses[counter] = i;
				}
				factors = factorses.clone();
			}
			
		return factors;
	}
}
