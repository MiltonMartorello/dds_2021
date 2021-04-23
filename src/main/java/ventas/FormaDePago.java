package ventas;

import java.util.List;

interface FormaDePago {

  Double precioConRecargo(Double precioVenta, List<Double> precioPrendas);
}
