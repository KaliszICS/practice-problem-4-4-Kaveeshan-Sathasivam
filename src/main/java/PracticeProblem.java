/**
	* File: Lesson 4.4 - Boolean functions with loops
	* Author: Kaveeshan Sathasivam
	* Date Created: April 15, 2026
	* Date Last Modified: April 15, 2026
	*/
public class PracticeProblem {

	public static void main(String args[]) {

	}
public static boolean hasCapital(String str) {
    for (int i = 0; i < str.length(); i++) {
        if (Character.isUpperCase(str.charAt(i))) {
            return true;
        }
    }
    return false;
}
public static boolean isPrime(int num) {
    if (num <= 1) {
        return false; 
    }

    for (int i = 2; i < num; i++) {
        if (num % i == 0) {
            return false; 
        }
    }

    return true; 
}
}
