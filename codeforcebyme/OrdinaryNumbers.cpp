#include <iostream>
#include <string>
using namespace std;

int main()
{
    int t;
    cin >> t;
    int i = 0;
    while (i < t)
    {
        int n;
        int count = 9;
        cin >> n;
        if (n >= 1 && n <= 9)
        {
            printf("%d\n", n);
        }
        else
        {
            if (n >= 10 && n < 100)
            {
                for (int i = 1; i <= n / 10; i++)
                {
                    if (n >= 11 * i)
                        count++;
                }
                cout << count << endl;
            }
            else if (n == 100)
            {
                cout << 18 << endl;
            }
            else if (n > 100)
            {
                count=0;
                int org = n;
                string oneplace = "1";
                string zeroplace = "1";
                int ldigit = 0;
                while (n /= 10)
                {
                    ldigit = n % 10;
                    oneplace += "1";
                    zeroplace += "0";
                }
                if (org >= ldigit * (std::stoi(oneplace)))
                {
                    count+=ldigit;
                }
                else
                    count+=ldigit-1;
                while(org/=10){
                    count+=9;
                }

                cout << count << endl;
            }
        }

        i++;
    }

    return 0;
}