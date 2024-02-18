#include <cstring>
#include <iostream>
using namespace std;

int main(){
    int input;
    char word[101];
    cin>>input;
    if (input > 0 && input < 101){
        for (int i = 0; i < input; i++){
            cin>>word;
            int x = strlen(word);
            if (x > 10){
                cout<<word[0]<<x - 2<<word[x - 1]<<endl;
            }
            else{
                cout<<word<<endl;
            }
        }
    }
    return 0;
}

