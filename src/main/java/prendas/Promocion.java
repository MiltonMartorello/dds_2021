package prendas;

public class Promocion extends Estado {

  Double descuentoPromocional = 100.0;

  public Double getDescuentoPromocional() {
    return descuentoPromocional;
  }

  public void setDescuentoPromocional(Double descuentoPromocional) {
    this.descuentoPromocional = descuentoPromocional;
  }

  @Override
  Double precioSegunEstado(Double precioBase) {
    return precioBase - descuentoPromocional;
  }
}
