package entities;

public class FuncionariosChefia extends Funcionarios {
	
		  @Override
		    public double getBonus() {
		        return (salario * 0.05);
	}

}
