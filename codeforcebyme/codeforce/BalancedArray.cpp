#include <iostream>
#include <vector>

using namespace std;

int main() {
    int t;
    cin >> t;
    for (int i = 0; i < t; ++i) {
        int n;
        cin >> n;
        if ((n / 2) % 2 != 0) {
            cout << "NO" << endl;
        } else {
            vector<int> arr(n);
            int k = 1;
            int fsum = 0, lsum = 0;
            for (int j = 0; j < n - 1; ++j) {
                if (j < n / 2) {
                    arr[j] = 2 * j + 2;
                    fsum += arr[j];
                } else {
                    arr[j] = k;
                    lsum += arr[j];
                    k += 2;
                }
            }
            while (lsum + k != fsum) {
                if (lsum + k > fsum) {
                    break;
                }
                k += 2;
            }
            if (fsum == lsum + k) {
                arr[n - 1] = k;
                cout << "YES" << endl;
                for (int q : arr) {
                    cout << q << " ";
                }
                cout << endl;
            } else {
                cout << "NO" << endl;
            }
        }
    }
    return 0;
}
