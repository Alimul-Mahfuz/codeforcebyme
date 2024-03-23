#include <iostream>

using namespace std;

int main()
{
    int n;

    cin>>n;

    int arr[n];

    for(int i=0; i<n; i++){
        cin>>arr[i];
    }

    for(int i=0;i<n; i++){
        int sum =0, total=0;
        int x= arr[i]/2;

        if(x%2!=0){
            cout<<"NO"<<endl;
        }
        else{
            cout<<"YES"<<endl;
            for(int j=2; j<=arr[i];j++){
                if(j%2!=0){
                    continue;
                }
                else{
                    sum=sum+j;
                    cout<<j<<" ";
                }
            }
            for(int j=2; j<=arr[i]-1;j++){
                if(j%2!=0){
                    continue;
                }
                else{
                    total=total+j-1;
                    cout<<j-1<<" ";
                }
            }
            for(int k=arr[i]; k<=arr[i]; k++){
                cout<<sum-total;
            }
            cout<<endl;
        }
    }
}