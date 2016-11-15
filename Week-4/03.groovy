/*Create a program in which you define the following methods:
power(int, int): Takes a base b and an exponent e from the user, and returns the result of b
e
.
power2(int): Takes an exponent e from the user and returns the result of 2e
. This method must call the previous
one to find out the result.
binary2decimal(String): Takes from the user a binary number (with digits 0 and 1) and returns the corresponding
number in decimal (base-10, with digits between 0 and 9). Hint: in the same way that you know that
35 = 3 · 10 + 5 · 1
, you can find that 100011 = 1 · 2
5 + 1 · 2
1 + 1 · 2
0
. This method must call the previous
one to find out the result.
decimal2binary(int): The opposite of the previous one: takes a decimal number and returns the corresponding
binary number. Hint: instead of multiplying by 2, you will need to divide by two this time (the quotients and
the last remainder will give you the binary number).
The program must offer a menu to the user with two options. The first one takes a binary number from the
user and returns the corresponding decimal number. The second one does the opposite: takes a decimal number
and returns a binary number. The program should use the methods defined.*/

//power (int, int)
void power(int b, int e) {
  int i=0;
  int x = 1;
    while (i<e){
      x = x*b;
      i++
    }
  return x;
}


int first = 2;
int second = 3;
power(first, second);

//power2(int)
void power2(int n) {
  power(2,n);
 }

int x = 3;
power2(x);
/*takes from the user a binary number (with digits 0 and 1) and returns the corresponding
number in decimal (base-10, with digits between 0 and 9). Hint: in the same way that you know that
35 = 3 · 101 + 5 · 100
, you can find that 100011 = 1 · 2*/
binary2decimal(String binary) {
  int size = binary.length();
  int i = 0;
  int result = 0;
  while(i<size) {
    if (binary.charAt(i) == 1){
    result = result + power2(i);
    }
    i++
  }
 print binary + " into decimal is " + result;
    
  
}

