using System;
using System.Text;

using static System.Console;

namespace example4_csharp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");

            // This will cause a compilation error due to static type checking.
            // var stringBuilder = new StringBuilder();
            // stringBuilder = 45;

            // Mark it as dynamic to turn off static type checking.
            dynamic stringBuilder = new StringBuilder("some string");
            WriteLine("Is this a StringBuilder? {0}", stringBuilder is StringBuilder);
            WriteLine("Value: {0}", stringBuilder);
            
            // Assign it to a different type.
            stringBuilder = 45;
            WriteLine("Is this a StringBuilder? {0}", stringBuilder is StringBuilder);
            WriteLine("Value: {0}", stringBuilder);            
        }
    }
}
