package ExamenParcial;

import api.ColaPrioridadTDA;
import api.DiccionarioMultipleTDA;
import api.PilaTDA;

public interface ExamenTDA {
    void inicializar();
    void AgregarReserva(int id_reserva,int id_pasajero,int nro_vuelo, int nro_asiento, int fecha);
    void EliminarReserva(int id_reserva);
    void ActualizarAsiento(int id_reserva, int nro_asiento);
    void ActualizarVuelo(int id_reserva,int nro_vuelo);
    void ActualizarFecha(int id_reserva, int fecha);
    void ObtenerReserva(int id_reserva);
    PilaTDA ListaReservas();
    ColaPrioridadTDA ReservasPorVuelo(int nro_vuelo);
    PilaTDA ReservasPorFecha(int fecha);
    DiccionarioMultipleTDA ListarPorVuelo();
    DiccionarioMultipleTDA ListarPorFecha();
    

}
