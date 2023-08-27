using System;
using System.Collections.Generic;

namespace FilaExemplo
{
    class Fila
    {
        private Stack<object> entrada;
        private Stack<object> saida;

        public Fila()
        {
            entrada = new Stack<object>();
            saida = new Stack<object>();
        }

        public void Inserir(object elemento)
        {
            entrada.Push(elemento);
        }

        public object Remover()
        {
            if (saida.Count == 0)
            {
                while (entrada.Count > 0)
                {
                    saida.Push(entrada.Pop());
                }

                if (saida.Count == 0)
                {
                    throw new InvalidOperationException("A fila está vazia.");
                }
            }

            return saida.Pop();
        }

        public void Mostrar()
        {
            Console.WriteLine("Elementos da fila:");

            foreach (object elemento in entrada)
            {
                Console.WriteLine(elemento);
            }

            foreach (object elemento in saida)
            {
                Console.WriteLine(elemento);
            }
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Fila fila = new Fila();

            fila.Inserir(10);
            fila.Inserir(20);
            fila.Inserir(30);

            fila.Mostrar();

            Console.WriteLine("Removendo elemento: " + fila.Remover());
            fila.Mostrar();
        }
    }
}
