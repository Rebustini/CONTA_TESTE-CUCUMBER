
public class Cliente {

private	int Saldo, Saque, SaldoE;



public int getSaldoE() {
	return SaldoE;
}

public void setSaldoE(int saldoE) {
	SaldoE = saldoE;
}

public int getSaldo() {
	return Saldo;
}

public void setSaldo(int saldo) {
	Saldo = saldo;
}
 
public int Saque(int Saque) {
	this.Saldo = this.Saldo - Saque;
	return Saque;
}

public int SaqueE(int Saque) {
	this.SaldoE = this.SaldoE - Saque;
	return Saque;
}

public int SaqueOp(int Saque,int SaldoE) {
	this.Saldo = this.Saldo - Saque;
	return SaldoE;
}

public int SaqueOpE(int Saque,int SaldoE) {
	Integer a = SaldoE - Saque;
	return a;
}	 
	
}
