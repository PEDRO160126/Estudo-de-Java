public class Quadrados {
    // exemplo de execução:
    // java Quadrados.class 19
    public static void main(String[] linhaDeComando)
    {
        if (linhaDeComando.length > 0)
        {
            // linhaDeComando é um vetor de Strings
            // linhaDeComando[0] é uma string, precisa
            // ser convertida para inteito
            int numeroPassado = Integer.parseInt(linhaDeComando[0]);
            for (int contador = 1;              // inicia contador
                 contador <= numeroPassado;     // condição de repetição
                 contador++)                    // passo do contador
            {
                System.out.printf("%d^2 = %d\n",
                        contador, contador*contador);
            }

//            int contador = 1;              // inicia contador
//            while (contador <= numeroPassado)   // condição de repetição
//            {
//                System.out.printf("{0}^2 = {1}\n",
//                        contador, contador*contador);
//                contador++;   // passo do contador
//            }
            System.out.println("\nFim.\n");
        }
        else
            System.out.println("\nSem valor fornececido na linha de comando\n");
    }
}


