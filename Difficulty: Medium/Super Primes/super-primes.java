class Solution{
	int superPrimes(int n) {
		// Create a boolean array to store the prime numbers
		boolean isPrime[] = new boolean[n+1];
		
		// Mark all numbers as prime initially
		Arrays.fill(isPrime, true);

		// 0 and 1 are not prime numbers, so mark them as false
		isPrime[0] = isPrime[1] = false;

		// Loop through all numbers starting from 2
		for(int i = 2; i <= n; i++)
		{
			// If the number is prime
			if(isPrime[i])
			{
				// Mark all multiples of the number as non-prime
				for(int j = i*2; j <= n; j += i)
				{
					isPrime[j] = false;
				}
			}
		}

		// Initialize a counter for the number of super primes
		int ans = 0;

		// Check if each number from 4 to n is a super prime
		for(int i = 4; i <= n; i++)
		{
			// If both the number and its predecessor are prime,
			// increment the counter
			if(isPrime[i] && isPrime[i-2])
			{
				ans++;
			}
		}
		// Return the number of super primes
		return ans;
    }
}