#include <iostream> //importado uma galeria C++
#include <stdlib.h>//importado uma galeria C++
using namespace std;

int main() //metodo main
{
    int i=0; //criando uma variavel inteira que sera usada no While
   float h , e ;//criando uma variavel do tipo Float pra ser usada no calculo N=h/e
  while(i < 3){ //iniciado estrutura de repeti��o While
cout << "Informe a altura:" << endl; //m�todo que imprime mensagem no console
cin >> h; // m�todo que captura informa��es do console e abriga na vari�vel H

cout << "Informe o tamanho do espaco:" << endl; //m�todo que imprime mensagem no console
cin >> e; // m�todo que captura informa��es do console e abriga na vari�vel E

cout << "Numero de escadas e:" << endl; //m�todo que imprime mensagem no console
cout << h/e << endl;//m�todo que imprime mensagem no console e tamb�m e feito o calculo

 i++; // vari�vel e soma mais um para ser usada no While
    }
system("pause"); //m�todo que indica fim do programa
    return 0; //retorno o valor 0 que significa que o programa rodou tudo normalmente
}
