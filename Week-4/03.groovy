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

print "Please enter a binary number: "
String binary = System.console().readLine();
binary2decimal(binary); 