using System;
using System.Collections;

namespace PilhaExemplo
{
    class Pilha
    {
        private ArrayList elementos;

        public Pilha()
        {
            elementos = new ArrayList();
        }

        public void Inserir(object elemento)
        {
            elementos.Add(elemento);
        }

        public object Remover()
        {
            if (elementos.Count == 0)
            {
                throw new InvalidOperationException("A pilha está vazia.");
            }

            int lastIndex = elementos.Count - 1;
            object elementoRemovido = elementos[lastIndex];
            elementos.RemoveAt(lastIndex);
            return elementoRemovido;
        }

        public void Mostrar()
        {
            Console.WriteLine("Elementos da pilha:");

            for (int i = elementos.Count - 1; i >= 0; i--)
            {
                Console.WriteLine(elementos[i]);
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
