package arrays;
import java.util.Random;
public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] test = {"bob","Jeff","me","hi","okay"};
		//2. print the third element in the array
		System.out.println(test[3]);
		//3. set the third element to a different value
		test[3]= "change";
		//4. print the third element again
		System.out.println(test[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i=0;i< 5;i++){
			System.out.println(test[i]);
		}
		//6. make an array of 50 integers
		int test1[];
		test1 = new int[51];
		for (int i=0;i< test1.length;i++){
			test1[i] = i;
			System.out.print(test1[i] + " ");
		}
		//7. use a for loop to make every value of the integer array a random number
		Random r = new Random();
		 int[] test2 = new int[51];
		 for (int i = 0; i < test2.length; i++) {
			 test2[i] = r.nextInt(100);
			 System.out.println(test2[i]);
			 
		 }
		 int min = test2[0];
		//8. without printing the entire array, print only the smallest number in the array
		 for(int j=0; j< test2.length; j++) {
			 if(test2[j]<min) {
				 min=test2[j];
			 }
		 }
		 System.out.println(min);
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
		 int max = test2[50];
		 for(int j=0; j< test2.length; j++) {
			 if(test2[j]>max) {
				 max=test2[j];
			 }
		 }
		 System.out.println(max);
	}
}
