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