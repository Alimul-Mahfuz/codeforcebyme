#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main(){

    int arr[]={6,1,2,4,5};
    int n=sizeof(arr)/sizeof(arr[0]);
    sort(arr,arr+n);
    for(int i:arr){
        cout<<i;
    }
    
}
