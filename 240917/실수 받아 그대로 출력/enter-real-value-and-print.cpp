#include <iostream>
#include <cmath>
#include <iomanip>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    double n;
    cin >> n;
    double rounded = round(n * 100.0) / 100.0;
    cout << fixed << setprecision(2) << rounded << endl;
    return 0;
}