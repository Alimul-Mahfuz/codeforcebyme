#include <iostream>
using namespace std;

int main()
{
    int t;
    cin >> t;
    int i = 0;
    while (i < t)
    {
        int n;
        int count = 0;
        cin >> n;
        if (n >= 1 && n <= 9)
        {
            printf("%d\n", n);
        }
        else
        {
            for (int i = 10; i <= n; i++)
            {
                int num = i;
                bool isSame = true;
                int prev = num % 10;
                num/=10;
                while (num / 10 != 0)
                {
                    if (num % 10 != prev)
                    {
                        isSame = false;
                        break;
                    }
                    prev = num % 10;
                    num = num / 10;
                }
                if (isSame)
                {
                    count++;
                }
            }
            cout << count << endl;
        }

        i++;
    }

    return 0;
}