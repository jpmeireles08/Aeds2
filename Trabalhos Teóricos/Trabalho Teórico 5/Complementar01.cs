using System;
using System.Collections.Generic;

namespace FilaExemplo
{
    class Fila
    {
        private Queue<object> elementos;

        public Fila()
        {
            elementos = new Queue<object>();
        }

        public void Inserir(object elemento)
        {
            elementos.Enqueue(elemento);
        }

        public object Remover()
        {
            if (elementos.Count == 0)
            {
                throw new InvalidOperationException("A fila está vazia.");
            }

            return elementos.Dequeue();
        }

        public void Mostrar()
        {
            Console.WriteLine("Elementos da fila:");

            foreach (object elemento in elementos)
            {
                Console.WriteLine(elemento);
            }
        }
    }

    class Complementar01
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
