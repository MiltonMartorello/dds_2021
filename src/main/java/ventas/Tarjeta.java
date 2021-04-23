package ventas;

import java.util.List;

public class Tarjeta implements FormaDePago {

  Integer cuotas;
  Double COEFICIENTE_FIJO = 1.15;

  @Override
  public Double precioConRecargo(Double precioVenta, List<Double> precioPrendas) {
    return precioVenta + recargo(precioPrendas);
  }

  private Double recargo(List<Double> precioPrendas) {
    return cuotas * COEFICIENTE_FIJO + precioPrendas.stream().mapToDouble( precio -> precio * 0.01 ).sum();
  }
}
