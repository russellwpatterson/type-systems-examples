#include <stdio.h>
#include <stdlib.h>

// Declare a union with a bunch of different types in it.
typedef union {
    int someNumber;                 // 4 bytes
    float someRealNumber;           // 4 bytes
    double someReallyRealNumber;    // 8 bytes
    char someCharacter;             // 1 byte
} someUnion;

int main() {
    // Declare an instance of the union. No need to malloc().
    someUnion t;

    // Print out some info about the union and the types within.
    printf("Union Size:\t\t%ld bytes\n", sizeof(someUnion));
    printf("---------------------------\n");
    printf("Int Size:\t\t%ld bytes\n", sizeof(int));
    printf("Float Size:\t\t%ld bytes\n", sizeof(float));
    printf("Double Size:\t\t%ld bytes\n", sizeof(double));
    printf("Char Size:\t\t%ld byte\n\n", sizeof(char));

    t.someNumber = 10;
    printf("Int:\t%d\t\tMemory Address: %p\n", t.someNumber, &t.someNumber);

    t.someRealNumber = 45.6;
    printf("Float:\t%f\tMemory Address: %p\n", t.someRealNumber, &t.someRealNumber);

    t.someReallyRealNumber = 45.6;
    printf("Double:\t%f\tMemory Address: %p\n", t.someReallyRealNumber, &t.someReallyRealNumber);

    t.someCharacter = 'f';
    printf("Char:\t%c\t\tMemory Address: %p\n", t.someCharacter, &t.someCharacter);

	return 0;
}
