using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Problem_1B
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int t = int.Parse(Console.ReadLine());

            for (int i = 0; i < t; i++)
            {
                string cell = Console.ReadLine().Trim();
                if (cell[0] == 'R' && char.IsDigit(cell[1]) && cell.Contains("C"))
                {
                    // Định dạng: RxCy
                    int cIndex = cell.IndexOf('C');
                    string row = cell.Substring(1, cIndex - 1);
                    int col = int.Parse(cell.Substring(cIndex + 1));

                    // Chuyển đổi số cột thành chữ cái
                    List<char> column = new List<char>();
                    while (col > 0)
                    {
                        col--; // Giảm cột đi 1 để chuyển sang chỉ số 0
                        column.Add((char)(col % 26 + 'A'));
                        col /= 26;
                    }

                    column.Reverse();
                    Console.WriteLine(string.Join("", column) + row);
                }
                else
                {
                    // Định dạng: AxY
                    int col = 0;
                    int j = 0;

                    while (j < cell.Length && char.IsLetter(cell[j]))
                    {
                        col = col * 26 + (cell[j] - 'A' + 1);
                        j++;
                    }

                    string row = cell.Substring(j);
                    Console.WriteLine($"R{row}C{col}");
                }
            }
        }
    }
}