
 /* Find the Second Largest Element 
	Find the second-largest element in the given array.  */

	class Assignment3_3{
		public static void main(String args[]){
			
			int []arr={12,45,334,233,68,34};
			
			int max1=arr[0];
			int max2=arr[0];
			for(int i=0;i<arr.length;i++){
				if(max1<arr[i]){
					max2=max1;
					if(max2<arr[i]){
						max2=arr[i];
					}
				}
				
			}
			System.out.println(max2);
		}
	}