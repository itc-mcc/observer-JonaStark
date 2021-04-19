package wsStockMarket;

import java.util.ArrayList;

public class Stock implements Subject {
	String tipo; // Nombre del stock
	StockMarket mercado_acciones;
	ArrayList<Observer> observadores;
	double precio;

	public Stock(String tipo, double precio_inicial, StockMarket mercado_acciones) {
		observadores = new ArrayList<>();
		this.mercado_acciones = mercado_acciones;
		this.precio = precio_inicial;
		this.tipo = tipo;

	}

	public void registroObservadores(Observer o) {
		observadores.add(o);
	}

	public String notificarObservdores(Observer comerciante, String tipo_operacion, Double precio) {
		String transaccionlog="";
		if (comerciante instanceof Trader) {
			for (Observer observer : observadores) {
				transaccionlog += observer.getName() + ":The latest trade is Trader:"+ comerciante.getName()+" "
						+tipo_operacion +" $"+precio+ " Stock: "+ this.tipo+"\n";
			}
		}
		return transaccionlog.substring(0,transaccionlog.length()- 1);
	}
}
