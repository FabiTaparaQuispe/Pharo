/**
 * @author      : Fabiola Tapara (ftapara@unsa.edu.pe)
 * @created     : 15/11/2022
 * @filename    : Main
 */
class Main {
  public static void aprender(Libro x){
    x.leer();
  }

  public static void main(String [] args){
    Figura fig1 = new Triangulo();
    System.out.println("Area = "+ fig1.getArea()); 
    System.out.println("Perimetro = "+ fig1.getPerimetro()); 

    Libro fig = new Triangulo();
    fig = new Cuadrado();
    aprender(fig);
  }

}
