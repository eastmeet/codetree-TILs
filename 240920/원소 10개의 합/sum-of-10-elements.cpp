#include <iostream>
#include <array>
using namespace std;

int main() {
    array<int, 10> arr;

    int sum = 0;
    for (int i = 0; i < arr.size(); i++) {
        cin >> arr[i];
        sum += arr[i];
    }

    cout << sum << endl;
    return 0;
}