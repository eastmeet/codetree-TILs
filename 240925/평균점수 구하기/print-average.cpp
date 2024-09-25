#include <iostream>
#include <array>
#include <iomanip>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    array<double, 8> arr;

    double sum = 0;
    for (auto &i : arr) {
        cin >> i;
        sum += i;
    }

    cout << fixed << setprecision(1);
    cout << sum / arr.size();
    return 0;
}