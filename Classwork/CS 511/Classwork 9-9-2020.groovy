// Can be fixed with semaphores/mutexes. The program should output 200 every time.

int counter = 0;

def P = 
  Thread.start { // P
   100.times {
       counter = counter + 1;
   }
  }


def Q = 
  Thread.start { // Q
   100.times {
     counter = counter + 1;
   }
 }
 
P.join();
Q.join();
println(counter);
return ;
