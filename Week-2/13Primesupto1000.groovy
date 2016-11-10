//Print all primes up to 1000

int num = 0;
println "all prime numbers up to 1000"
/*
for (num = 0;num < 1000;num++) {
  while (i < 10) {
        if ((num % i) != 0) {
          println "Prime: " + num
          i++
        } else {
          i++
        } 
      } 
    } 

*/

while (num < 20) {
  for (int i=2;i < 10;i++) {
       if ((num % i) != 0) {
          println num     
          num++
        } else {
          num++
        }
  }

}
