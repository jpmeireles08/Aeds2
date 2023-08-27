using System;
using System.Collections.Generic;

namespace PilhaExemplo
{
    class Pilha
    {
        private Queue<object> entrada;
        private Queue<object> auxiliar;

        public Pilha()
        {
            entrada = new Queue<object>();
            auxiliar = new Queue<object>();
        }

        public void Inserir(object elemento)
        {
            entrada.Enqueue(elemento);
        }

        public object Remover()
        {
            if (entrada.Count == 0)
            {
                throw new InvalidOperationException("A pilha está vazia.");
            }

            while (entrada.Count > 1)
            {
                auxiliar.Enqueue(entrada.Dequeue());
            }

            Queue<object> temp = entrada;
            entrada = auxiliar;
            auxiliar = temp;

            return auxiliar.Dequeue();
        }

        public void Mostrar()
        {
            Console.WriteLine("Elementos da pilha:");

            foreach (object elemento in entrada)
            {
                Console.WriteLine(elemento);
            }

            foreach (object elemento in auxiliar)
            {
                Console.WriteLine(elemento);
            }
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Pilha pilha = new Pilha();

            pilha.Inserir(10);
            pilha.Inserir(20);
            pilha.Inserir(30);

            pilha.Mostrar();

            Console.WriteLine("Removendo elemento: " + pilha.Remover());
            pilha.Mostrar();
        }
    }
}
