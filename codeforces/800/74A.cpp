#include <iostream>
using namespace std;

int main(){
    int n;
    cin>>n;
    while (n--) {
        string word;
        cin>>word;
        int z = word.length();
        if (z>10) {
            cout<<word[0]<<z-2<<word[z-1]<<endl;
        }
        else {
            cout<<word<<endl;
        }
    }
    return 0;
}
