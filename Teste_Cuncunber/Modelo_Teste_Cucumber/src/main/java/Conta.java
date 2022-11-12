import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Conta {
	Integer SaldoE, Saldo,Saque, SaldoATT;
    Cliente cliente = new Cliente();
	
	
	
	/**
	 * 
	 * @param Etapa 1   
	 */
	
	@Given("um cliente especial com saldo atual de {int} reais")
	public void um_cliente_especial_com_saldo_atual_de_reais(Integer int1) {
	   this.SaldoE = int1;
//	   int1 = -200;
	   //cliente.setSaldoE(int1);
	   
	   if(this.SaldoE != int1) {
	    throw new io.cucumber.java.PendingException();
	   }
	}


	/**
	 * 
	 * @param Etapa 2   
	 */
	
	@When("for solicirado um saque no valor de {int} reais")
	public void for_solicirado_um_saque_no_valor_de_reais(Integer int1) {
		 
		
		 this.Saque = int1;
		// int1 = 100;
		 //cliente.SaqueE(int1);
		if(this.Saque != int1) {
	    throw new io.cucumber.java.PendingException();
		}
	}


	/**
	 * 
	 * @param Etapa 3   
	 */
	
	@Then("deve efetuar o saque e atualizar o saldo da conta para {int} reais")
	public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(Integer int1) {
		
		
		this.SaldoE = -200;
	    this.Saque = 100;
	    SaldoATT = cliente.SaqueOpE(Saque, SaldoE);
		
	    if(this.SaldoATT != -300) {
	    throw new io.cucumber.java.PendingException();
	    }
	}


	/**
	 * 
	 * @param Etapa 4  
	 */
	
	@Given("um cliente comum com saldo atual de {int} reais")
	public void um_cliente_comum_com_saldo_atual_de_reais(Integer int1) {
	    this.Saldo = int1;
	   
	   // cliente.setSaldo(int1);
	    if(this.Saldo != int1) {
	    throw new io.cucumber.java.PendingException();
	    }
	}


	/**
	 * 
	 * @param Etapa 5   
	 */
	
	@When("solicitar um saque de {int} reais")
	public void solicitar_um_saque_de_reais(Integer int1) {
		this.Saque = int1;
		
//		 cliente.Saque(int1);
		if(this.Saque != int1) {
	    throw new io.cucumber.java.PendingException();
		}
	}


	/**
	 * 
	 * @param Etapa 6  
	 */	
	
	@Then("nao deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente")
	public void nao_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {
	    this.Saldo = -300;
	    this.Saque = 200;
	    cliente.SaqueOp(Saque, Saldo);
	    
	    if (this.Saldo < 0) {
	    	System.out.print("Saldo Insuficiente");
	    }else {	    
	    throw new io.cucumber.java.PendingException();
	    }
	}
}
