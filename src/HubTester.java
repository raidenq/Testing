import java.util.Arrays;


public class HubTester {

	public static int arrayAdd(int[] arr){
		int sum = 0;
		for(int a: arr){
			sum+= a;
		}
		return sum;
	}
	public static int doom[][] = {{2,3,4},
							  	  {5,6,7},
							  	  {8,9,10}};
	public static int[] dimArrayAdd(int[][] arr1){
		
		int[] amm = new int[arr1.length];
		for(int i = 0; i < arr1.length; i++){
			amm[i] = arrayAdd(arr1[i]);			
		}
		return amm;
	}
	
	
	

	public static int count(int counts){
		
		if(counts == 0){
			return 0;
		}
		else if(counts == 1){
			return 1;
		}
		else{
			return count(counts - 1) + count(counts - 2);
	}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int food[] = {7, 2, 19, 4, 9};
		System.out.println(food.length);
		if(food.length> food[3]){
		}
		for(int num: food){
			if(num % 2 == 0){
				System.out.println(num);
			}else{
				System.out.println("nay");
			}
			}
		String foodNames[] = {"bananna" , "apple" , "orange"};
		for(String name: foodNames){
			if (name.length() % 2 >= 1){
				System.out.println(name);
			}else if(name.length() % 2 == 0){
				System.out.println(name); 
			}else{
				System.out.println("problem");
			}
		}
		int numbers[] = {7,4,9,27,2};
		Arrays.sort(numbers);
		System.out.println(numbers[0]);
		for(int counter : numbers){
			System.out.println(counter);
		}
		int[] ne = dimArrayAdd(doom).clone();
		System.out.println(ne[1]);
		for(int i = 0; i<3; i++){
			System.out.println("it ran"+ i);
			
		}
		}


}
