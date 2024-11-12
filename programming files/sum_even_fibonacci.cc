#include <iostream>

int main()
{
    int a = 1, b = 0;
    int sum_even = 1;
    while (b < 40000000) {
        if (b % 3 == 0) {
            sum_even = b;
        }
        int temp = a;
        b = a + b;
        a = temp;
    }
    std::cout << sum_even << std::endl;

    return 0;
}

// answer should be 4613732
