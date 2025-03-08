/*  Find the Largest and Smallest Element 
    Given an array, find the smallest and largest elements in it.*/
	
	class Assignment3_1{
		public static void main(String args[]){
			int[] arr={12,56,322,34,54,76};
			
			int smele=arr[0];
			int larele=arr[0];
			for(int i=0;i<arr.length;i++){
				if(arr[i]<smele){
					smele=arr[i];
				}
				
				if(arr[i]>larele){
					larele=arr[i];
				}
			}
			System.out.println(smele);
			System.out.println(larele);
			
		}
	}