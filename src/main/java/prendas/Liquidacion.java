package prendas;

public class Liquidacion extends Estado {

  @Override
  Double precioSegunEstado(Double precioBase) {
    return precioBase / 2;
  }
}
