package ch05_2;

public class ArrayExer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		int[] array = {1,8,3,4,2};
		
		for(int i = 0;i < array.length;i++){
			if (max < array[i]) {
					max = array[i];
				}
			}
		System.out.println("max : "+max);
		
		
		}
		
	}


