package treinoParaProvaPoo;

public class Calculadora {
	private Integer number1;
	private Integer number2;
	
	public Calculadora() {
		
	}
	public Calculadora(Integer number1, Integer number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public Integer getNumber1() {
		return number1;
	}
	
	public void setNumber1(Integer number1) {
		this.number1 = number1;
	}
	
	public Integer getNumber2() {
		return number2;
	}
	public void setNumber2(Integer number2) {
		this.number2 = number2;
	}
	
	public Integer soma() {
		return this.number1 + this.number2;
	}
	
	public Integer subtra() {
		return this.number1 - this.number2;
	}
	
	public Integer divi() {
		return this.number1 / this.number2;
	}
	
	public Integer multi() {
		return this.number1 * this.number2;
	}
}
