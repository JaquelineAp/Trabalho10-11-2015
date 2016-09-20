import java.util.Scanner;


public class Fisica extends Pessoa {

	protected int cpf;
	
	public Fisica()
	{
		super();
		Scanner get = new Scanner(System.in);
		System.out.print("Informe o CPF >> ");
		cpf = get.nextInt();
		
	}
	public void imprimir()
	{
		super.imprimir();
		System.out.println("CPF >> " +cpf);
	}
	public int getcpf()
	{
		return cpf;
	}
}
