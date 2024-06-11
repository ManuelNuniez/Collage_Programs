package ExamenParcial;

import api.ColaPrioridadTDA;
import api.ConjuntoTDA;
import api.DiccionarioMultipleTDA;
import api.PilaTDA;
import impl.ColaPrioridadDinamica;
import impl.ConjuntoDinamico;
import impl.DiccionarioMultipleDinamico;
import impl.PilaDinamica;

public class Examen implements ExamenTDA{

    NodoExamen Primero;
    NodoExamen Ultimo;
    ConjuntoTDA reservas; //para revisar que las reservas no se repitan.

    @Override
    public void inicializar() {
        Primero=null;
        Ultimo=Primero;

        reservas= new ConjuntoDinamico();
        reservas.InicializarConjunto();
    }

    @Override
    public void AgregarReserva(int id_reserva, int id_pasajero, int nro_vuelo, int nro_asiento, int fecha) {
        NodoExamen aux= new NodoExamen();
        aux.Reserva= id_reserva;
        aux.asiento = nro_asiento;
        aux.fechaDeVuelo=fecha;
        aux.pasajero=id_pasajero;
        aux.vuelo=nro_vuelo;
        aux.sig=null;
        if (Primero==null) {
            Primero=aux;
            Ultimo=Primero;
            reservas.Agregar(id_reserva);

        }else if(!reservas.Pertenece(id_reserva)){
            Ultimo.sig=aux;
            Ultimo=aux;
            reservas.Agregar(id_reserva);
        }

    }

    @Override
    public void EliminarReserva(int id_reserva) {
        NodoExamen aux=Primero;

        while (aux.sig.Reserva!=id_reserva) {
            aux=aux.sig;
        }

        reservas.Sacar(id_reserva);
        aux.sig=aux.sig.sig;

    }

    @Override
    public void ActualizarAsiento(int id_reserva, int nro_asiento) {
        NodoExamen aux= Primero;
        while (aux.Reserva!=id_reserva) {
            aux=aux.sig;
        }
        aux.asiento=nro_asiento;
    }

    @Override
    public void ActualizarVuelo(int id_reserva, int nro_vuelo) {
        NodoExamen aux= Primero;
        while (aux.Reserva!=id_reserva) {
            aux=aux.sig;
        }
        aux.vuelo=nro_vuelo;
    }

    @Override
    public void ActualizarFecha(int id_reserva, int fecha) {
        NodoExamen aux= Primero;
        while (aux.Reserva!=id_reserva) {
            aux=aux.sig;
        }
        aux.fechaDeVuelo=fecha;
    }

    @Override
    public void ObtenerReserva(int id_reserva) {
        NodoExamen aux= Primero;
        while (aux.Reserva!=id_reserva) {
            aux=aux.sig;
        }
        System.out.printf("pasajero: %d - Numero de vuelo: %d - Asiento: %d",aux.pasajero,aux.vuelo, aux.asiento);
    }

    @Override
    public PilaTDA ListaReservas() {
        PilaTDA reservas = new PilaDinamica();
        reservas.InicializarPila();
        
        NodoExamen aux= Primero;
        while (aux!=null) {
            reservas.Apilar(aux.Reserva);
            aux=aux.sig;
        }

        return reservas;
    }

    @Override
    public ColaPrioridadTDA ReservasPorVuelo(int nro_vuelo) {
        ColaPrioridadTDA reservasXvuelo = new ColaPrioridadDinamica();
        reservasXvuelo.InicializarCola();

        NodoExamen aux= Primero;
        while (aux!=null) {
            if (aux.vuelo==nro_vuelo) {
                reservasXvuelo.Acolar(aux.Reserva, aux.Reserva);
            }
            aux=aux.sig;
        }

        return reservasXvuelo;
    }

    @Override
    public PilaTDA ReservasPorFecha(int fecha) {
        PilaTDA reservasXfecha = new PilaDinamica();
        reservasXfecha.InicializarPila();

        NodoExamen aux= Primero;
        while (aux!=null) {
            if (aux.fechaDeVuelo==fecha) {
                reservasXfecha.Apilar(aux.Reserva);
            }
            aux=aux.sig;
        }

        return reservasXfecha;
    }

    @Override
    public DiccionarioMultipleTDA ListarPorVuelo() {
        DiccionarioMultipleTDA pasajerosPorVuelo = new DiccionarioMultipleDinamico();
        pasajerosPorVuelo.InicializarDiccionario();

        NodoExamen aux= Primero;
        while (aux!=null) {
            pasajerosPorVuelo.Agregar(aux.vuelo, aux.Reserva);
            aux=aux.sig;
        }

        return pasajerosPorVuelo;

    }

    @Override
    public DiccionarioMultipleTDA ListarPorFecha() {
        DiccionarioMultipleTDA pasajerosPorFecha = new DiccionarioMultipleDinamico();
        pasajerosPorFecha.InicializarDiccionario();

        NodoExamen aux= Primero;
        while (aux!=null) {
            pasajerosPorFecha.Agregar(aux.fechaDeVuelo, aux.Reserva);
            aux=aux.sig;
        }

        return pasajerosPorFecha;
    }

}
