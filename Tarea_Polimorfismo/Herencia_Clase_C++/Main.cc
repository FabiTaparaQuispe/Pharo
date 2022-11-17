#include "Mamifero.h"
#include "Perro.h"
#include "Gato.h"
#include <iostream>
int main(){
  Mamifero* mam = new Mamifero();
  mam -> tipo();
  mam -> onomatopeya();

  mam = new Gato();
  mam -> tipo();
  mam -> onomatopeya();

  mam = new Perro();
  mam -> tipo();
  mam -> onomatopeya();
  
  //delete mam;  
}
