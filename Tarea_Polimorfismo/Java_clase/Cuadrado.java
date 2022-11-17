/**
 * @author      : Fabiola Tapara (ftapara@unsa.edu.pe)
 * @created     : 15/11/2022
 * @filename    : Cuadrado
 */
public class Cuadrado extends Figura{
  private int lado;

  public Cuadrado(String name, int lado){
    super(name);
    this.lado = lado;
  }
  
  public int getLado(){
    return lado;
  }

  public double getArea(){
    return lado * lado;
  }

  public String toString(){
    return "Soy un cuadrado de lado: "+ lado + " mi area es de: " +getArea() + "metros cuadrados";
  }
}
