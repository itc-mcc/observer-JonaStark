package wsStockMarket;

public interface Subject {
    void registroObservadores(Observer o);
    String notificarObservdores(Observer t, String tipo_transaccion, Double precio);
}
