using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Template
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int w = int.Parse(Console.ReadLine());
            if (w % 2 == 0 && w >= 4)
            {
                Console.WriteLine("YES");
            }
            else
            {
                Console.WriteLine("NO");
            }
        }
    }
}42
