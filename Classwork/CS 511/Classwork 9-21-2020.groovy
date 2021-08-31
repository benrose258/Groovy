import java.util.concurrent.Semaphore;

Semaphore done = new Semaphore(???);

int c=0;

Thread.start { // P
    c++; // atomic
}



Thread.start { // Q
    c++; // atomic
}

// Exercise: print counter only after P and Q have finished

// block until P and Q are done

done.acquire();

println(c);


return ;
