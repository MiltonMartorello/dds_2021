package prendas;

public class Prenda {

  Double precioBase;
  Estado estado;
  Tipo tipo;

  public Prenda(Double precioBase, Estado estado, Tipo camisa) {
  }

  public Double precioFinal()  {
    return estado.precioSegunEstado(precioBase);
  }

}
