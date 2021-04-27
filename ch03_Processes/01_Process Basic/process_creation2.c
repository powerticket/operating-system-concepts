#include <stdio.h>
#include <unistd.h>
#include <wait.h>

int main() {
    pid_t pid;
    pid = fork();
    // parent process
    if (pid > 0) {
        wait(NULL);
    }
    printf("hello, Process%d!\n", pid);

    return 0;
}