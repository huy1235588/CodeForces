#include <iostream>
#include <regex>
using namespace std;

int main()
{
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        string cell;
        cin >> cell;
        if (cell[0] == 'R' && isdigit(cell[1]) && cell.find('C') != string::npos)
        {
            int col = 0, row = 0;
            int cPos = cell.find('C');
            row = stoi(cell.substr(1, cPos - 1));
            col = stoi(cell.substr(cPos + 1));

            string column;
            while (col > 0)
            {
                col--;
                column += 'A' + (col % 26);
                col /= 26;
            }
            reverse(column.begin(), column.end());
            cout << column << row << '\n';
        }
        else
        {
            int col = 0, row = 0, j = 0;
            while (isalpha(cell[j]))
            {
                col = col * 26 + (cell[j] - 'A' + 1);
                j++;
            }
            row = stoi(cell.substr(j));

            cout << "R" << row << "C" << col << '\n';
        }
    }
}