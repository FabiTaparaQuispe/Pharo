/**
 * @author      : Fabiola Tapara (ftapara@unsa.edu.pe)
 * @created     : 15/11/2022
 * @filename    : Triangulo
 */
public class Triangulo extends Figura implements Libro {
  private double base;
  private double altura;

  public void leer(){
    System.out.println("Aprendiendo areas y perimetros de un triangulo");
  }

  public Double area(){
    return base * altura / 2;
  }

  public Double perimetro(){
    return base + base + base ;
  }
}
