package ventas;

import java.util.List;

class Efectivo implements FormaDePago {

  @Override
  public Double precioConRecargo(Double precioVenta, List<Double> precioPrendas) {
    return precioVenta;
  }
}
