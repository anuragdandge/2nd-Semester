#include <stdio.h>
#include <fcntl.h>
int main(){
    int fd;
    char buffer[80];
    static char message[] = "Hello Mom !!! ";
    fd = open("D:\\MCA (Modern)\\2nd Semester\\OS(Bash)\\Assignments\\demo.txt", O_RDWR);
    if (fd != -1)
    {
        printf("demo.txt opened with read/write access\n");
        write(fd, message, sizeof(message));
        lseek(fd, 0, 0);
        read(fd, buffer, sizeof(message));
        printf("%s — was written to demo.txt \n", buffer);
        close(fd);
    }
}