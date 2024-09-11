using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace Problem_2B
{
    internal class Program
    {
        static string ConvertToAlphabet(int num)
        {
            StringBuilder result = new StringBuilder();

            while (num > 0)
            {
                num--;
                int remaider = num % 26;
                result.Insert(0, (char)(remaider + 'A'));
                num /= 26;
            }

            return result.ToString();
        }

        static int ConvertToNumber(string s)
        {
            int result = 0;

            foreach (char ch in s)
            {
                result = result * 26 + (ch - 'A' + 1);
            }

            return result;
        }

        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            Regex regex = new Regex(@"^R([1-9]\d{0,6})C([1-9]\d{0,6})$", RegexOptions.Compiled);

            string[] array = new string[n];

            for (int i = 0; i < n; i++)
            {
                array[i] = Console.ReadLine();
            }

            foreach (string cell in array)
            {
                Match match = regex.Match(cell);

                if (match.Success)
                {
                    int row = int.Parse(match.Groups[1].Value);
                    int column = int.Parse(match.Groups[2].Value);

                    string columnString = ConvertToAlphabet(column);

                    Console.WriteLine($"{columnString}{row}");
                }
                else
                {
                    StringBuilder row = new StringBuilder();
                    StringBuilder column = new StringBuilder();

                    foreach (char ch in cell)
                    {
                        if (char.IsLetter(ch))
                        {
                            column.Append(ch);
                        }
                        else
                        {
                            row.Append(ch);
                        }
                    }
                    int columnNumber = ConvertToNumber(column.ToString());
                    Console.WriteLine($"R{row}C{columnNumber}");
                }
            }
        }
    }
}
