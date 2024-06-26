package Secao13_EnumeracaoComposicao;

import java.util.Date;

import Secao13_EnumeracaoComposicao.entities.Order;
import Secao13_EnumeracaoComposicao.entities.enums.OrderStatus;

public class Enumerações {
	public static void main(String[] args) {

		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
	/*Convertendo String para enum*/
		Order order2 = new Order(1080, new Date(), OrderStatus.valueOf("PROCESSING"));
		
		System.out.println(order);
		System.out.println(order2);
	}
}
