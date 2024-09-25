#include <iostream>
#include <array>
#include <iomanip> 
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    array<int, 10> arr;

    int cnt = 0;
    int sum = 0;
    for (auto &i : arr) {
        cin >> i;
        if (i == 0) {
            break;
        }
        cnt++;
        sum += i;
    }

    double avg = sum / cnt;
    cout << fixed << setprecision(1);
    cout << sum << " " << avg;
    return 0;
}