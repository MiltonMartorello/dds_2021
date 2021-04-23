package prendas;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static prendas.Tipo.CAMISA;

class PrendaTest {
  @Test
  public void test()
  {
    Prenda prenda = new Prenda(
        150.00,
        new Liquidacion(),
        CAMISA);

    assertEquals(prenda.precioFinal(),150.00);
  }
}
