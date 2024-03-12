#include <stdio.h>

int main() {
    // Inicializar una variable y un contador
    int variable = 0;
    int contador = 1;

    // Usar un bucle while con el operador && y +=
    while (contador <= 5 && variable < 10) {
        // Sumar el valor del contador a la variable usando +=
        variable += contador;
        // Incrementar el contador
        contador++;
    }

    // Imprimir el resultado
    printf("El valor final de la variable es: %d\n", variable);

    return 0;
}
