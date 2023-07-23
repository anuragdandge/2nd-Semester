// Q1) To write C programs using the following system calls of UNIX operating system fork, exex, getpid, exit, wait,
// close, stat, opendir, closedir
#include <stdio.h>
#include <sys/stat.h>
int main()
{
    struct stat sb;
    if (stat("D:\\MCA (Modern)\\2nd Semester\\OS(Bash)\\Assignments\\test.txt", &sb) == 0)
    {
        printf("File size: %ld bytes\n", sb.st_size);
        printf("File mode: %o\n", sb.st_mode & 0777);
    }
    else
    {
        printf("Could not get file information\n");
    }
    return 0;
}

// #include <stdio.h>
// #include <dirent.h>
// int main()
// {
//     DIR *dir = opendir(".");
//     if (dir == NULL)
//     {
//         printf("Could not open directory\n");
//         return 1;
//     }
//     struct dirent *entry;
//     while ((entry = readdir(dir)) != NULL)
//     {
//         printf("%s\n", entry->d_name);
//     }
//     closedir(dir);
//     return 0;
// }

// #include <stdio.h>
// #include <unistd.h>
// #include <fcntl.h>
// int main()
// {
//     int fd = open("test.txt", O_RDONLY);
//     printf("File descriptor for test.txt is %d\n", fd);
//     close(fd);
//     printf("File descriptor has been closed\n");
//     return 0;
// }

// #include <stdio.h>
// #include <stdlib.h>
// int main()
// {
//     printf("This is the main program\n");
//     exit(0);
//     printf("This line will not be executed since exit() terminates the current process.\n");
//     return 0;
// }

// Online C compiler to run C program online

// #include <stdio.h>
// #include <unistd.h>
// #include <sys/wait.h>
// int main()
// {
//     pid_t pid = fork();
//     if (pid == 0)
//     {
//         printf("This is the child process with PID %d\n", getpid());
//         sleep(5);
//         printf("Child process is terminating\n");
//         return 0;
//     }
//     else
//     {
//         printf("This is the parent process with PID %d\n", getpid());
//         printf("Waiting for child process to terminate...\n");
//         wait(NULL);
//         printf("Child process has terminated\n");
//         return 0;
//     }
// }

#include <stdio.h>
#include <unistd.h>
int main()
{
    char *args[] = {"ls", "-l", NULL};
    execvp(args[0], args);
    printf("This line will not be executed since execvp replaces the current process.\n");
    return 0;
}
