#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    // 1ft = 30.48cm
    double x;
    const double ft = 30.48; // cm
    cin >> x;
    cout << fixed;
    cout.precision(1);
    cout << x * ft;
    return 0;
}