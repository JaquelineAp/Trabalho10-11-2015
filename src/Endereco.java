import java.util.Scanner;


public class Endereco {

	public String rua, nro, cidade, uf, cep,bairro;
	
	public Endereco()
	{
		Scanner get = new Scanner(System.in);
		System.out.print("Rua >> ");
		rua = get.nextLine();
		System.out.print("Bairro >> ");
		bairro = get.nextLine();
		System.out.print("Número >> ");
		nro = get.nextLine();
		System.out.print("CEP >> ");
		cep = get.nextLine();
		System.out.print("Cidade >> ");
		cidade = get.nextLine();
		System.out.print("Estado >> ");
		uf = get.nextLine();
		
	}
	
	public void imprimir()
	{
		System.out.println("Endereço >> "+rua+"\nNumero >> "+nro+ "\nCEP >> "+cep+"\nCidade >> "+cidade+"\n UF >> "+uf+"Bairro >> "+bairro);
		
	}
}
