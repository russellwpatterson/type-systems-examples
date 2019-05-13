#include <stdio.h>
#include <stdlib.h>

int main() {
	// Think of this like `var someInts = new int[3];`
	int* someInts = (int*)malloc(sizeof(int) * 3);

	// Let's fill this array with different numbers that were "randomly chosen"
	someInts[0] = 1953063255;
	someInts[1] = 1752637484;
	someInts[2] = 4158561;

	// Let's pretend that array is really a string.
	printf("%s\n", (char*)someInts);

	// Preventing memory leaks starts at home.
	free(someInts);

	return 0;
}
