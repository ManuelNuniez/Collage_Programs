package ExamenParcial;

import algoritmos.MetodosColaPrioridad;
import algoritmos.MetodosDiccMultiple;
import algoritmos.MetodosPila;

public class ProgramaDePrueba {
    public static void main(String[] args) {
        ExamenTDA agencia= new Examen();
        agencia.inicializar();

        //carga de datos----------------------------------------------------------------------------
        agencia.AgregarReserva(1, 1, 1, 12, 12052024);
        agencia.AgregarReserva(2, 2, 2, 15, 12052024); 
        agencia.AgregarReserva(3, 3, 2, 14, 12052024);
        agencia.AgregarReserva(4, 2, 3, 17, 14052023);
        agencia.AgregarReserva(5, 4,1, 13, 15021344);
        agencia.AgregarReserva(6, 6, 2, 16, 3242242);
        agencia.AgregarReserva(7, 7, 3, 65, 32423);
        agencia.AgregarReserva(8, 8, 6, 454, 45);
        //------------------------------------------------------------------------------------------------
        agencia.ObtenerReserva(2);
        System.out.println();

        agencia.ActualizarAsiento(2, 1);
        agencia.ActualizarFecha(2, 26062026);
        agencia.ActualizarVuelo(2, 25);
        System.out.println(" Pasajero 2 con los datos actualizados");
        agencia.ObtenerReserva(2);

        System.out.println();
        System.out.println("---------pila de reservas");
        MetodosPila.ImprimirPila(agencia.ListaReservas());

        agencia.EliminarReserva(2);
        System.out.println("eliminamos la reserva 2:");
        MetodosPila.ImprimirPila(agencia.ListaReservas());

        System.out.println("------------Cola prioridad reservas por el vuelo 2");
        MetodosColaPrioridad.Imprimir(agencia.ReservasPorVuelo(2));

        System.out.println("--------------Reservas por la fecha 12-05-2024");
        MetodosPila.ImprimirPila(agencia.ReservasPorFecha(12052024));

        System.out.println("------------Diccionario de reservas por numero de vuelo");
        MetodosDiccMultiple.ImprimirMultipleDiccionario(agencia.ListarPorVuelo());

        System.out.println("-------------Diccionario de reservas por fecha");
        MetodosDiccMultiple.ImprimirMultipleDiccionario(agencia.ListarPorFecha());




    }

}
