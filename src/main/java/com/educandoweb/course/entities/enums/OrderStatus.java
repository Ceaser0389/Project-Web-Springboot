package com.educandoweb.course.entities.enums;

public enum OrderStatus {

	/* o enum por padrão atribui um valor p constant, entretanto vc pode criar uma numeração
	  nomeando, ai vc declara o atributo, faz um construtor privado e por fim um metodo get 
	  para retornar o valor
	  
	  metodo static para converter um valor numerico p um tipo enumerado
	*/
	
	
	WAINTING_PAYMENT (1),
	PAID(2) ,
	SHIPPED (3),
	DELIVERED(4),
	CANCELED(5);
	
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("invalid OrderStatus code");
	}
	
	
}
