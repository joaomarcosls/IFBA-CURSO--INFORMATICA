#include <iostream> //importado uma galeria C++
#include <stdlib.h>//importado uma galeria C++
using namespace std;

int main() //metodo main
{
    int i=0; //criando uma variavel inteira que sera usada no While
   float h , e ;//criando uma variavel do tipo Float pra ser usada no calculo N=h/e
  while(i < 3){ //iniciado estrutura de repetição While
cout << "Informe a altura:" << endl; //método que imprime mensagem no console
cin >> h; // método que captura informações do console e abriga na variável H

cout << "Informe o tamanho do espaco:" << endl; //método que imprime mensagem no console
cin >> e; // método que captura informações do console e abriga na variável E

cout << "Numero de escadas e:" << endl; //método que imprime mensagem no console
cout << h/e << endl;//método que imprime mensagem no console e também e feito o calculo

 i++; // variável e soma mais um para ser usada no While
    }
system("pause"); //método que indica fim do programa
    return 0; //retorno o valor 0 que significa que o programa rodou tudo normalmente
}
