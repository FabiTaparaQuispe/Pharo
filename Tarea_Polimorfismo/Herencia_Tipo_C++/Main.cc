#include "Mamifero.h"
#include "Carro.h"
#include "Perro.h"
#include "Gato.h"
#include <iostream>
int main(){
  Perro*p1= new Perro();
  p1->onomatopeya(); 
  Carro* c1 = new Carro();
  c1->onomatopeya();
}
