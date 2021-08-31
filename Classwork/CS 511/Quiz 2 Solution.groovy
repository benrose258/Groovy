/*
Ben Rose

Quiz 2C - 25 Sep 2020

You may not add print statements nor additional semaphores.
Add only acquire and release operations to the following code so that the output is:

aabcaabcaabc....

*/

import java.util.concurrent.Semaphore;
Semaphore a = new Semaphore(2);
Semaphore b = new Semaphore(0);
Semaphore c = new Semaphore(0);



Thread.start { // P

    while (true) {
          a.acquire();
	print("a");
          b.release();
    }
}

Thread.start { // Q

    while (true) {
          b.acquire(2);
	print("b");
	c.release();

    }
}


Thread.start { // R

    while (true) {
          c.acquire();
	print("c");
          a.release(2);
    }
}
