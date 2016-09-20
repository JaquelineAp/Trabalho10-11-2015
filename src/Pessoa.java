import java.util.Scanner;


public class Pessoa {

	protected String nome,login,email,senha;
	protected int telefone;
	protected Endereco end;
	
	public Pessoa()
	{
		Scanner get = new Scanner(System.in);
		System.out.println("\nCadastro de Clientes");
		System.out.println();
		System.out.print("Nome >> ");
		nome = get.nextLine();
		System.out.println("Endereço ");
		end = new Endereco();
		System.out.print("Telefone >> ");
		telefone = get.nextInt();
		System.out.print("E-mail >> ");
		email = get.next();
		System.out.print("Login >> ");
		login = get.next();
		System.out.print("Senha >> ");
		senha = get.next();
		
	}
	public void imprimir()
	{
		
		System.out.println();
		System.out.println("Nome "+nome);
		System.out.println("Endereço");
		end.imprimir();
		System.out.println("Telefone "+telefone);
		System.out.println("E-mail "+email);
		System.out.println("Login "+login);
		System.out.println("Senha "+senha);
		
	}
	public String getsenha()
	{
		return senha;
	}
	
	public String getlogin()
	{
		return login;
	}
}
