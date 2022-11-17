/**
 * @author      : Fabiola Tapara (ftapara@unsa.edu.pe)
 * @created     : 15/11/2022
 * @filename    : Cuadrado
 */
public class Triangulo extends Figura{
  private int base;
  private int altura;

  public Triangulo(String name, int base, int altura){
    super(name);
    this.base = base;
    this.altura = altura;
  }
  
  public int getBase(){
    return base;
  }

  public int getAltura(){
    return altura;
  }

  public double getArea(){
    return base * altura / 2;
  }

  public String toString(){
    return "Soy un triangulo base: "+ base +  "mi altura es: "+altura+ " mi area es de: " +getArea() + "metros cuadrados";
  }
}
