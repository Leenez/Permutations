import java.util.Arrays;
import java.util.ArrayList;

class Permutator {
	
	ArrayList<int[][]> palautettava = new ArrayList<>();
	
	ArrayList<int[][]> returnPermutationsList(int[][] permuted){
		palautettava.clear();
		this.permute2Darray(permuted);
		return this.palautettava;
	}
	
     void permute(int[] arr){
	    permuteHelper(arr, 0);
	}

	private static void permuteHelper(int[] arr, int index){
		
	    if(index >= arr.length - 1){
	    	System.out.println(Arrays.toString(arr));
	        return;
	    }

	    for(int i = index; i < arr.length; i++){ 

	        int t = arr[index];
	        arr[index] = arr[i];
	        arr[i] = t;
	        
	        permuteHelper(arr, index + 1);

	        t = arr[index];
	        arr[index] = arr[i];
	        arr[i] = t;
	    }
	}
	
	void permute2Darray(int[][] arr2d) {
		helper2d(arr2d, 0);
	}
	
	private void helper2d(int[][] arr, int index) {
		if(index >= arr.length - 1){ 
			palautettava.add(arr.clone());
			return;
	    }

	    for(int i = index; i < arr.length; i++){ 

	        int[] t = arr[index];
	        arr[index] = arr[i];
	        arr[i] = t;
	        
	        helper2d(arr, index + 1);

	        t = arr[index];
	        arr[index] = arr[i];
	        arr[i] = t;
	    }
	}

}
