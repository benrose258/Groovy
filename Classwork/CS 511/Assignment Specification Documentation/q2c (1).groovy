
/*
Quiz 2C - 25 Sep 2020

You may not add print statements nor additional semaphores.
Add ONLY acquire and release operations to the following code so that the output is:

aabcaabcaabc....

*/

import java.util.concurrent.Semaphore;
Semaphore a = new Semaphore(??);
Semaphore b = new Semaphore(??);
Semaphore c = new Semaphore(??);



Thread.start { // P

    while (true) {

	print("a");

    }
}

Thread.start { // Q 

    while (true) {

	print("b");

    }
}


Thread.start { // R

    while (true) {

	print("c");

    }
}
