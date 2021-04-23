package ventas;

import prendas.Prenda;

import java.util.Date;
import java.util.List;

public class Venta {

  List<Prenda> prendas;
  Date fechaDeVenta;
  FormaDePago formaDePago;

  Double precioTotal() {
    return formaDePago.precioConRecargo(precioVenta(), precioPrendas());
  }

  private Double precioVenta() {
    return prendas.stream().mapToDouble(prenda -> prenda.precioFinal()).sum();
  }

  List <Double> precioPrendas() {
    return (List<Double>) prendas.stream().mapToDouble(prenda -> prenda.precioFinal());
  }


}
