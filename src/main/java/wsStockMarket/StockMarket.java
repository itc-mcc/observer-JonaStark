package wsStockMarket;

public class StockMarket {

	public void register(Trader t, Stock s) {
		s.registroObservadores(t);
	}

	public String trade(Trader t, Stock s, String tipo_transaccion, double precio) {
		t.update(s, tipo_transaccion, precio);
		String Transaction_Log = s.notificarObservdores(t, tipo_transaccion, precio);
		return Transaction_Log;
	}

}
