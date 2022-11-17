/**
 * @author      : Fabiola Tapara (ftapara@unsa.edu.pe)
 * @created     : 15/11/2022
 * @filename    : Cuadrado
 */
public class Cuadrado extends Figura implements Libro {
  private double lado;
  public void leer(){
    System.out.println("Aprendiendo areas y perimetros de un cuadrado");
  }

  public Double area(){
    return lado * lado;
  }

  public Double perimetro(){
    return lado + lado + lado + lado;
  }
}
