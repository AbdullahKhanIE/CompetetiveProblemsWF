#include <iostream>
using namespace std;

int main() {
    int letter[26] = {0}; 
    int count = 0;
    string input;
    cin >> input;
    cout << input << endl;

    for (int i = 0; i < input.length(); i++) {
        cout << input[i] << endl;
        if (input[i] >= 'a' && input[i] <= 'z' && letter[input[i] - 'a'] == 0) {
            letter[input[i] - 'a'] = 1;
            count++;
        }
    }

    cout << "Count of distinct lowercase letters: " << count << endl;
    return 0;
}

