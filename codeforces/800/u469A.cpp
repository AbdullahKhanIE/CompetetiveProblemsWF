#include <iostream>
using namespace std;

int main(){

    int n, input, max=0, win=0;
    cin>>n;
    char a[100],b[100];
    
    cin>>a;
    cout<<a;
    for (int i = 0; a[i]!='\0'; i+=2) {
        if (a[i]-48>=max) {
            max = input;
        }
    }

    cin>>b;
    cout<<b;
    for (int i = 0; b[i]!='\0'; i+=2) {
        if (b[i]-48>max) {
            win = 1;
        }
    }

    if (win) {
        cout<<"I become the guy."<<endl;
    }
    else {
        cout<<"Oh, my keyboard!"<<endl;
    }
    return 0;
}
