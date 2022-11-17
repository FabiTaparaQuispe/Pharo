/**
 * @author      : Fabiola Tapara (ftapara@unsa.edu.pe)
 * @created     : 15/11/2022
 * @filename    : Main
 */
class Main {
  public static void main(String [] args){
    
    Figura fig = new Figura("Figura");
    System.out.println(fig.toString()); 
    
    //Triangulo
    fig = new Triangulo("Triangulo", 9, 5);
    System.out.println(fig.toString()); 

    //Cuadrado
    fig = new Cuadrado("Triangulo", 10);
    System.out.println(fig.toString()); 
  }
}
