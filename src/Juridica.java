import java.util.Scanner;


public class Juridica extends Pessoa {

	protected int cnpj;
	
	public Juridica()
	{
		super();
		Scanner get = new Scanner(System.in);
		System.out.print("Informe o CNPJ >> ");
		cnpj = get.nextInt();
		
	}
	public void imprimir()
	{
		super.imprimir();
		System.out.println("CPF >> " +cnpj);
	}
	public int getcnpj()
	{
		return cnpj;
	}
}
