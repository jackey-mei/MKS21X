public class Sorts {
    private static boolean debug = true;
    public static void printArray(int[] data) {
	String message = "[";
	for (int i = 0; i < data.length; i ++) {
	    message += data[i] + ", ";
	}
	message = message.substring(0, message.length() - 2);
	message += "]";
	System.out.println(message);
    }
    
    public static void insertionSort(int[] data) {
	// goes through each number one by one starting with the second number
	for (int eachElement = 1; eachElement < data.length; eachElement ++) {
	    if (debug) {
		printArray(data);
	    }
	    // starts from the number right before the current and starts counting back to the first
	    for (int checkBack = eachElement - 1; checkBack >= 0; checkBack --) {
		// checks to see if the current number is less than any of the numbers right before it
		if (data[eachElement] < data[checkBack]) {
		    int saveNumber = data[eachElement];
		    boolean isLower = false;
		    int lowestNumber = checkBack;
		    // finds the correct slot for where to put the number/ move all the numbers up to free its slot
		    while (lowestNumber >= 0 && isLower == false) {
			if (data[lowestNumber] <= saveNumber) {
			    isLower = true;
			    lowestNumber ++;
			}
			else {
			    lowestNumber --;
			    if (lowestNumber < 0) {
				lowestNumber = 0;
				isLower = true;
			    }
			}
		    }
		    // moves all the numbers up one slot so it frees to the slot where to put the number that is out of place
		    for (int originalPlace = eachElement; originalPlace > lowestNumber; originalPlace --) {
			data[originalPlace] = data[originalPlace - 1];
		    }
		    data[lowestNumber] = saveNumber;
		}
	    }
	}
    }

    public static void selectionSort(int[] data) {
	for (int eachElement = 0; eachElement < data.length - 1; eachElement ++) {
	    int currentNumber = data[eachElement];
	    int numberToReplaceWith = data[eachElement];
	    int numberToReplaceWithIndex = eachElement;
	    if (debug) {
		printArray(data);
	    }
	    for (int otherElement = eachElement + 1; otherElement < data.length; otherElement ++) {
		if (data[otherElement] < numberToReplaceWith) {
		    numberToReplaceWith = data[otherElement];
		    numberToReplaceWithIndex = otherElement;
		}
	    }
	    if (numberToReplaceWith < data[eachElement]) {
		int savedNumber = data[eachElement];
		data[eachElement] = numberToReplaceWith;
		data[numberToReplaceWithIndex] = savedNumber;
	    }
	}
    }

    public static void bubbleSort(int[] data) {
	for (int eachElement = 0; eachElement < data.length - 1; eachElement ++) {
	    if (data[eachElement] >= data[eachElement + 1]) {
		int savedNumber = data[eachElement];
		data[eachElement] = data[eachElement + 1];
		data[eachElement + 1] = savedNumber;
	    }
    }

    public static void main(String[] args) {
	int[] a = {1 , 2,  9, 5, 0, 3};
	selectionSort(a);
    }
}
		    
