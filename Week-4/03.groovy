int power(int b, int e) {
  int i=0;
  int x = 1;
    while (i<e){
      x = x*b;
      i++
    }
  return x;
}

int power2(int n) {
  return power(2,n);
 }

void binary2decimal(String x) {
  int size = x.length();
  int result = 0;
  for(int i = 0; i < size; i++) {
		if (x.charAt(i) == "1"){
			result = result + power2(i);
		}
  }
 print x + " into decimal is " + result;
}



void decimal2binary (int x) {
	String reverseBinaryNum = "";
		while (x > 0) {
			int remainder = x % 2;
			reverseBinaryNum = reverseBinaryNum + remainder;
			x = (x/2);
		}	
	length = reverseBinaryNum.length();
	String binaryNum = 0;
		for ( int i = length - 1 ; i >= 0 ; i-- ) {
			binaryNum = binaryNum + reverseBinaryNum.charAt(i);
		}
	println binaryNum;
}

println "What would you like to do?"
println "1. Covert a binary number to a decimal number"
println "2. Convert a decimal number to a binary number"
int choice = Integer.parseInt(System.console().readLine());

switch (choice) {
	case 1: 
		print "Please enter a binary number: "
		String binary = System.console().readLine();
		binary2decimal(binary); 
		break;
	case 2: 
		print "Please enter a decimal number: "
		int num = Integer.parseInt(System.console().readLine());
		decimal2binary(num);
		break;
	default:
		println "Sorry, that wasn't recognised. Please enter a number 1 or 2."
		break;
	}






