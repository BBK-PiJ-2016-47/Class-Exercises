//power (int, int)


void power(int b, int e) {
  int i=0;
  int x = 1;
  while (i<e){
    x = x*b;
    i++
  }
println b + " to the power of " + e + " is " + x;
}


int first = 2;
int second = 3;
power(first, second);


//power2(int)

void power(int n) {
int pow=0;
n = n+2;
println "2 to the power of " + n + " = " + pow;
}

int x = 3;
power(x);

