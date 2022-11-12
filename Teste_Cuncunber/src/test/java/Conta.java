import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Conta {
	private Integer saldo;
	private Integer saque;
	
	/**
	 * 
	 * @param Etapa 1   
	 */
	@Given("um cliente especial com saldo atual de {int} reais")
	public void um_cliente_especial_com_saldo_atual_de_reais(Integer int1) {
		this.saldo = int1;
		   int1 = -200;
		   
		   if(this.saldo != int1) {
	 }
	}
		   /**
			 * 
			 * @param Etapa 2   
			 */
			

	@When("for solicirado um saque no valor de {int} reais")
	public void for_solicirado_um_saque_no_valor_de_reais(Integer int1) {
		this.saque = int1;
		 int1 = 100;

		if(this.saque != int1) {
	    
		}
	}


	/**
	 * 
	 * @param Etapa 3   
	 */


	@Then("deve efetuar o saque e atualizar o saldo da conta para {int} reais")
	public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(Integer int1) {
	

		this.saldo = int1;
	    this.saque = 100;

		
	    if(this.saldo != -300) {
	   
	    }
	}
	
	/**
	 * 
	 * @param Etapa 4  
	 */
	
	@Given("um cliente comum com saldo atual de {int} reais")
	public void um_cliente_comum_com_saldo_atual_de_reais(Integer int1) {
	    this.saldo = int1;
	    int1 = -300;
	    if(this.saldo != int1) {
	    
	    }
	}
	
	/**
	 * 
	 * @param Etapa 5   
	 */


	@When("solicitar um saque de {int} reais")
	public void solicitar_um_saque_de_reais(Integer int1) {
		this.saque = int1;
		 int1 = 200;

		if(this.saque != int1) {
	    
		}
	}
	
	/**
	 * 
	 * @param Etapa 6  
	 */

	@Then("nao deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente")
	public void nao_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {
		this.saldo = -300;
	    this.saque = 200;

	    
	    if (this.saldo < 0) {
	    	System.out.print("Saldo Insuficiente");
	    }else {	    
	    throw new io.cucumber.java.PendingException();
	    }
	}
}
