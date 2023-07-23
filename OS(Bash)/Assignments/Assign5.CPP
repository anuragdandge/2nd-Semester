
#include <iostream>
#include <fstream>
#include <string>
using namespace std;
int main() {
    string filename = "test.txt";

    ofstream outfile;
    outfile.open(filename);

    if (!outfile) {
        cerr << "Error opening file for writing." << endl;
        return 1;
    }

    string content = "Hello, World!";
    outfile << content << endl;

    outfile.close();

    ifstream infile;
    infile.open(filename);

    if (!infile) {
        cerr << "Error opening file for reading." << endl;
        return 1;
    }

    string readContent;
    getline(infile, readContent);

    infile.close();


    cout << "Read content: " << readContent << endl;

    return 0;
}
