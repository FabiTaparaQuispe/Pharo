/**
 * @author      : Fabiola Tapara (ftapara@unsa.edu.pe)
 * @created     : 15/11/2022
 * @filename    : Figura
 */
class Figura {
  private String name;
  private int numLados;
  private double area;
  
  public Figura(String name){
    this.name = name;
  }

  public Figura(int numLados){
    this.numLados = numLados;
  }

  public String getName(){
    return name;
  }
  
  public int getNumLados(){
    return numLados;
  }

  public double getArea(){
    return area;
  }

  public String toString(){
    return "Soy un: " + name + " y tengo: " + numLados + "lados";
  }
}
