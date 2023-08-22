package entities;

public class FuncionariosChefia extends Funcionarios {
	
	@Override
	public void salarioBrutoFinal() {
		if(cargo == "chefe") {
		salarioFinal = salario + (salario * 0.05);
		}
	}

}
