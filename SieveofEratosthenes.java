/*optimal way to find the primes
Explanation
Initially we mark all the values of the array as true and then we go on modifying the array boolean values by marking the multiples as false suppose the pointer is on 2 then we mark all the numbers which are multiple of 2 as false starting from the square of 2 ie 4,4+2=6,6+2=8…in this way only primes are left in the end

Let us take an example when n = 50. So we need to print all prime numbers smaller than or equal to 50. 
We create a list of all numbers from 2 to 50.  

According to the algorithm we will mark all the numbers which are divisible by 2 and are greater than or equal the square of it. 

Now we move to our next unmarked number 3 and mark all the numbers which are multiples of 3 and are greater than or equal to the square of it.  

We move to our next unmarked number 5 and mark all multiples of 5 and are greater than or equal to the square of it.  

We continue this process and our final table will look like below:  

So the prime numbers are the unmarked ones: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47.*/

import java.util.Scanner;
public class SeiveofErathobess {
    static void primes(int n)
    {
        boolean p[]=new boolean[n+1];
        for(int i=0;i<n+1;i++)
        {
            p[i]=true;
        }
        for(int i=2;i*i<=n;i++)
        {
            if(p[i]==true) {
                for(int j=i*i;j<=n;j+=i)
                {
                    p[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++)
        {
            if(p[i]==true) {
                System.out.println(i);
            }
        }
        }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int x=in.nextInt();
        primes(x);
    }
    }

