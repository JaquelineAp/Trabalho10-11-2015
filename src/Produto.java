import java.util.Scanner;


public class Produto {

	private String codigo,nome,marca,dataF,dataV;
	private float valordavenda;
	private int quant;
	
	public Produto()
	{
		Scanner get = new Scanner(System.in);
		System.out.println("Cadastro de Produtos");
		System.out.println();
		System.out.print("Codigo >> ");
		codigo = get.nextLine();
		System.out.print("Nome >> ");
		nome = get.nextLine();
		System.out.print("Marca >> ");
		marca = get.nextLine();
		System.out.print("Data de fabricação >> ");
		dataF = get.nextLine();
		System.out.print("Data de validade >> ");
		dataV = get.nextLine();
		System.out.print("valor da venda >> ");
		valordavenda = get.nextFloat();
		System.out.print("Quantidade no estoque >> ");
		quant = get.nextInt();
		
	}
	
	public float setBaixaEstoque()
	{
		return quant;
	}
	
	public float getBaixaEstoque()
	{
		return quant;
	}
	
	public void imprimir()
	{
		System.out.println("\n\nLista de Produtos");
		System.out.println();
		System.out.println("Codigo "+codigo);
		System.out.println("Nome "+nome);
		System.out.println("Marca "+marca);
		System.out.println("Data de fabricação "+dataF);
		System.out.println("Data de validade "+dataV);
		System.out.println("valor do produto "+valordavenda);
		System.out.println("Quantidade no estoque "+quant);
		
	}
	public String getcodigo()
	{
		return codigo;
	}
	public String getnome()
	{
		return nome;
	}
	
	public String setnome()
	{
		return nome;
	}
	
	public float getvalordavenda()
	{
		return valordavenda;
	}
	
	public float setvalordavenda()
	{
		return valordavenda--;
	}
	
	
}
