public class Primes {
    public static void main(String[] args) {

        int n =  Integer.parseInt(args[0]);
          
        boolean[] isPrime = new boolean[n + 1];

        // initialize the boolean array to `true` values from index=2 till index = n

        for(int i = 2; i < n + 1; i++) {

            isPrime[i] = true;

        }

        int p = 2;

        // cross out all thr multiples of p (p is always have to be prime number and for him the boolean will be true)

        while (p * p <= n) {

            if (isPrime[p]) {
                
                int j = p * p;
                
                while (j <= n) {
                    
                    isPrime[j] = false;

                    j += p;
                
                }

            p++;

            //now we want to make sure before the next croosing, that it will be done for a `prime` p; for exemple, p = 4 will not cross out is multiples
            // so this loop is searching the next prime p by "break" the loop once isPrime[p] (meaning :isPrime[p] = true)

            while (p <= n && !isPrime[p]) {
                
                p++;
        
            }

    // now we can surelly start the new crossing session
            
            }
        
        }
    
    System.out.println("Prime numbers up to " + n + ":");

    int count  = 0;

    for(int k = 2; k < n + 1; k++) {

        if(isPrime[k] == true) {

            System.out.println(k);

            count++;

        }

    }

    double percentOfprimes = 100 * ((double) count / n);

    System.out.println("There are " +  count + " primes between 2 and " + n  + " (" + (int) percentOfprimes + "% are primes)");

    }
}