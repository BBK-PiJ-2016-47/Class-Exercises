//Print all primes up to 1000
boolean prime = false;
println "all prime numbers up to 1000"
	for (int num = 1; num < 20; num++) {
		for (int i = 2; i < 10; i++){
			if (i != num) {
				int remainder = (num % i);
					if (remainder != 0) {
						prime = true;
						break;
					}
			}
			if (prime){
				println "Prime: " + num;
			} 
			num++;
		}
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