#include <iostream>
#include <array>
#include <string>
using namespace std;

int main() {
    array<string, 10> arr{};

    for (string &i: arr) {
        cin >> i;
    }

    for (auto it = arr.rbegin(); it != arr.rend(); ++it) {
        cout << *it;
    }
    cout << endl;

    return 0;

}