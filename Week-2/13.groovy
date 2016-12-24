//Print all primes up to 1000
boolean prime = true;
println "all prime numbers up to 1000"
	for (int num = 1; num < 1000; num++) {
		for (int i = (num-1); i > 1; i--){
			int remainder = (num % i);
			if (remainder == 0) {
				prime = false;
				break;						
			} 
			

		}
		if (prime) {
			println "Prime: " + num;
			}
			prime = true;
			
			
	}
	
			
			
			
			
			
/*
				if ((remainder = 0) && (i != num)){
					prime = false;
					break;	
				} else {
				i++;
				}
				println "Num: " + num + " i: " + i + " remainder " + remainder;
		}
		if (prime){
			println "Prime: " + num;
		}
		num++;
	}
	*/