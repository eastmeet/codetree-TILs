#include <iostream>
#include <array>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    array<int, 10> arr{};
    int sum = 0;
    int count = 0;
    for (int i = 0; i < arr.size(); i++) {
        cin >> arr[i];
        if (arr[i] >= 250) {
            break;
        }
        sum += arr[i];
        count++;
    }

    double avg = (double) sum / count;

    cout << fixed;
    cout.precision(1);
    cout << sum << " " << avg << endl;
    return 0;
}