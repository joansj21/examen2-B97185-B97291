package cr.ac.ucr.paraiso.analisis.demohibenate.entity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class OrdenTest {

    @Test
public void prueba_orden_assertion(){

        Cliente cliente =new Cliente(1,"Carlos","Salmeron");

        ProductoHardware producto=new ProductoHardware(1,"Disco hdd",20000,"paraiso");
        ProductoHardware producto2=new ProductoHardware(2,"Teclado",25000,"paraiso");

        ItemOrden itemOrden=new ItemOrden(1,4,producto.getPrecio(),producto);
        ItemOrden itemOrden2=new ItemOrden(2,6,producto2.getPrecio(),producto2);

        Date fechaOrden = new Date(2022, 12,6);

        List<ItemOrden> itemes = new ArrayList<ItemOrden>();
        itemes.add(itemOrden);
        itemes.add(itemOrden2);



        Orden orden=new Orden(1,fechaOrden,cliente,itemes);

        float totalOrden=orden.getItemes().get(0).getCantidad()*orden.getItemes().get(0).getPrecioUnitario();
        float totalEsperado=230000;
        assertTrue(totalOrden==totalEsperado);



}


}
