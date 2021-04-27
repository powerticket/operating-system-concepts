#include <stdio.h>
#include <unistd.h>
#include <wait.h>

int value = 5;

int main() {
    pid_t pid;
    pid = fork();
    // parent process
    if (pid > 0) {
        wait(NULL);
        printf("Parent: value = %d\n", value);
    }
    else if (pid == 0) {
        value += 15;
    }

    return 0;
}