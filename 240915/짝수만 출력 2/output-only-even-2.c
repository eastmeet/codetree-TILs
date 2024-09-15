#include <stdio.h>

int main() {
    // 여기에 코드를 작성해주세요.
    int b;
    int a;
    scanf("%d %d", &b, &a);
    while (b >= a) {
        if (b % 2 == 0) {
            printf("%d ", b);
        }

        b--;
    }
    return 0;
}