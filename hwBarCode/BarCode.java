public class BarCode implements Comparable {
   private String _zip;
   private int _checkDigit;
   private static final String[] code = {"||:::", "::::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};

    // constructors
    //precondtion: zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public BarCode(String zip) {
	try {
	    if (zip.length() != 5) {
		throw new RuntimeException();
	    }
	    else {
		int newZip = Integer.parseInt(zip);
		_zip = zip;
		_checkDigit = checkSum();
	    }
	}
	catch (RuntimeException e) {
	    System.out.println("Invalid Zip");
	}	
    }

    // postcondition: Creates a copy of a bar code.
    public BarCode(BarCode x) {
	_zip = x._zip;
	_checkDigit = checkSum();
    }


    //post: computes and returns the check sum for _zip
    private int checkSum() {
	int newIntZip = Integer.parseInt(_zip);
	String newStrZip = _zip;
	int sum = 0;
	for (int counter = _zip.length(); counter > 0; counter --) {
	    sum += newIntZip / Math.pow(10, counter - 1);
	    if (counter > 1) {
		newStrZip = newStrZip.substring(1, newStrZip.length());
		newIntZip = Integer.parseInt(newStrZip);
	    }
	}
	sum = sum % 10;
	return sum;
    }

    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString() {
	String combinedZip = _zip + _checkDigit;
	String barcode = "";
	for (int counter = 0; counter < combinedZip.length(); counter ++) {
	    barcode += code[counter];
	}
	return _zip + _checkDigit + " " + barcode;
    }

    public boolean equals(Object other) {
	// postcondition: false if the object is not a BarCode, 
	// false if it is a non-matching barcode
	// true when they match.
	if (other instanceof Comparable) {
	    return other.toString().equals(toString());
	}
	else {
	    return false;
	}
    }

    public int compareTo(Object other) {
	// postcondition: compares the zip + checkdigit
	int thisCombinedZip = Integer.parseInt( _zip + _checkDigit);
	int otherCombinedZip = Integer.parseInt(((BarCode)other)._zip + ((BarCode)other)._checkDigit);
	return thisCombinedZip - otherCombinedZip;
    }

    public static void main(String[] args) {
	BarCode a = new BarCode("11373");
	System.out.println(a);
    }
}
