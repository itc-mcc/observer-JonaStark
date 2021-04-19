package wsStockMarket;

import java.util.HashMap;
import java.util.Map;

public class Trader implements Observer {

	String name;
	StockMarket mercado_acciones;
	private Map<Stock,Double> stocks;

	public Trader(String nombre, StockMarket mercado_acciones) {
		this.stocks = new HashMap<>();
		this.name = nombre;
		this.mercado_acciones = mercado_acciones;
	}

	public String getName() {
		return this.name;
	}

	public void update(Subject p, String transaccion, Double precio) {
		if (p instanceof Stock) {
			Stock stock = (Stock) p;
			if (transaccion == "buy") {
				this.stocks.put(stock, precio);
			}
			if (transaccion == "sell")
				this.stocks.remove(stock);
		}
	}

}
