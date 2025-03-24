package Actividad_12_5_aplicación;

import java.util.Comparator;

public class comparadorEdad implements Comparator<Cliente> {

    @Override
    public int compare(Cliente o1, Cliente o2) {
        return o1.fechaNacimiento.compareTo(o2.fechaNacimiento);
    }


}
