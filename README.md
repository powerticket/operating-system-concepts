# powerticket's study of [Operating System Concepts Tenth Edition](https://codex.cs.yale.edu/avi/os-book/OS10/index.html)
- [Table of Contents](https://codex.cs.yale.edu/avi/os-book/OS10/toc-dir/toc.pdf)
- [Preface](https://codex.cs.yale.edu/avi/os-book/OS10/preface-dir/preface.pdf)
- [Slides](https://codex.cs.yale.edu/avi/os-book/OS10/slide-dir/index.html)
- [Regular Exercises](https://codex.cs.yale.edu/avi/os-book/OS10/regular-exercises/index-exer.html)
- [Solutions to Practice Exercises](https://codex.cs.yale.edu/avi/os-book/OS10/practice-exercises/index-solu.html)
- [Bibliography](https://codex.cs.yale.edu/avi/os-book/OS10/bib-dir/index.html)
- [Model Course Syllabi](https://codex.cs.yale.edu/avi/os-book/OS10/syllabi-dir/index.html)
- [Study Guide](https://codex.cs.yale.edu/avi/os-book/OS10/study-guide/Study-Guide.pdf)
- [Review Questions](https://codex.cs.yale.edu/avi/os-book/OS10/review-dir/index.html)
- [Errata](https://codex.cs.yale.edu/avi/os-book/OS10/errata-dir/index.html)
- [Linux Virtual Machine](http://cs.westminstercollege.edu/~greg/osc10e/vm/index.html)
- [C and Java Source Code](http://people.westminstercollege.edu/faculty/ggagne/osc10e/index.html)
- [A brief history of the textbooks](http://www.galvin.info/history-of-operating-system-concepts-textbook/)
- [Important Operating System Papers](https://codex.cs.yale.edu/avi/os-book/OS10/important-papers.pdf)
- [Frequently asked questions](https://codex.cs.yale.edu/avi/os-book/OS10/faq.html)



## Ch.3 Processes



## Ch.4 Thread & Concurrency



## Ch.5 CPU Scheduling

### Non-preemptive

#### FCFS

First Come First Served



#### SJF

Shortest Job First



### Preemptive

#### SRTF

Shortest Remaining Time First

Preemptive version of SJF



#### RR

Round Robin

preemptive FCFS with a time quantum(time slice)

The ready queue is circular queue



#### Priority-based

##### Problem

###### starvation(indefinite blocking)

It can be solved by aging - gradually increase the priority of processes.



#### MLQ

Multi-Level Queue

RR + Priority



#### MLFQ

Multi-Level Feedback Queue

MLQ + aging



### Real-Time Operating System

#### Soft Realtime

It guarantee only that a critical process is preferred to noncritical one.



#### Hard Realtime

A task must be serviced by its deadline.



## Ch.6 Synchronization Tools

### Race condition

#### The Critical Section Problem

##### Sections of codes

- Entry section
- Critical section
- Exit section
- Remainder section



##### Three requirements for the solution

- Mutual exclusion
- Progress(avoid deadlock)
- Bounded waiting(avoid starvation)



### Peterson's solution

### Atomic variable

### Mutex(Mutual Exclusion) Lock

The simplest tools for synchronization

- Protect critical section and prevent race condition.

- A process must acquire the lock before entering a critical section.

- Releases the lock when  it exits the critical section.



Two functions and one variable for the Mutext Lock

- `acqure()`, `release()`
- `available`: Boolean

```c
acqure() {
    while (!available); // busy wait
    available = false;
}

release() {
    available = true;
}
```



#### Spinlock

The type of metex lock using the method of busy waiting

- In certain circumstances **on multicore systems**, spinlocks are the preferable choice for locking.

- One thread can spin on one processing core while another thread performs its critical section on another core.



#### Implementation

```c
void *counter(void * param) {
    for (int k = 0; k < 10000; k++) {
        // entry section(acquire a lock)
        pthread_mutex_lock(&mutex);
        
        // critical section
        sum++;
        
        // exit section(release the lock)
        pthread_mutex_unlock(&mutex);
        
        //remainder section
    }
    pthread_exit(0);
}
```



### Semaphore

More robust, convenient, and effective tool.

Two functions and one variable for the semaphore

- `wait()`(`P()`), `signal()`(`V()`)
- `S`: Integer

```c
wait(S) {
    while (s <= 0); // busy wait
	S--;
}

signal(S) {
    S++;
}
```



#### Binary Semephore

- range only between 0 and 1 - similar to mutex lock.

#### Counting Semaphore

- range over an unrestricted domain.
- can be used to resources with a finite number of instances.



### Monitor

Overcomes the demerits of metex and semaphore.



### Liveness

Ensures for processes to make progress.
