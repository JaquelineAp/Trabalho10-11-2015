import java.util.Scanner;


public class CarrinhoDeCompras {

	public static void main(String[] args) {
		String login,senha,tipo,nome,aux;
		int op=0,ops=0,i,pesquisa,carrinho=0,j,quant=0;
		int codigo,quantf = 0,quantj=0,quantp=0,teste=0;
		float total=0;
		String produto,busca;
		Fisica clientef[]= new Fisica[3];
		Juridica clientej[]= new Juridica[3];
		Produto merc[]= new Produto[10];
		String Compra[] = new String[12];
		Scanner get = new Scanner(System.in);
		
		//LOGIN PARA ACESSO AO SISTEMA
		do{
			
		System.out.println("\n\nInforme LOGIN e SENHA para o acesso");
		System.out.print("\nLOGIN: ");
		login = get.next();
		System.out.print("SENHA: ");
		senha = get.next();
		
		//TESTE PARA ACESSAR O MODO ADMINISTRADOR NO SISTEMA	
		if(login.equals("admin")  && senha.equals("senha_admin") )
		{
			
			do{
				System.out.println("\nModo Administrador");
				System.out.println("\n1. Cliente");
				System.out.println("2. Produto");
				System.out.println("\n3. Sair");
				
				System.out.print("Opção >> ");
				op = get.nextInt();
				
				switch(op)
				{
				case 1:
					do{
						System.out.println("\n\nCliente");
						System.out.println("\n1. Cadastrar Cliente");
						System.out.println("2. Listar");
						System.out.println("3. Pesquisar");
						System.out.println("4. Voltar ao menu principal");
						System.out.print("Opção >> ");
						ops = get.nextInt();
						
						switch(ops)
						{
						case 1:
							
							System.out.println("Fisica ou Juridica (F ou J)");
							tipo = get.next().toUpperCase();
							
							if(tipo.equals("F"))
							{
								clientef[quantf++] = new Fisica();
								
							}
							else
								if(tipo.equals("J"))
								{
								 clientej[quantj++] = new Juridica();
								}
								else
									
									System.out.print("Informe o caracter correspondente");
									
								break;
						case 2:
							
							System.out.println();
							for(i=0;i<quantf;i++)
							{
								System.out.print("Pessoa Fisica");
								clientef[i].imprimir();
							}
							
							for(i=0;i<quantj;i++)
							{
								System.out.print("\nPessoa Juridica");
								clientej[i].imprimir();
							}
								
							
							break;
						case 3:
								System.out.println("Informe o CPF ou CNPJ");
								pesquisa = get.nextInt();
							
									for(i=0;i<quantf;i++)
									{
										if(clientef[i].getcpf() == pesquisa)
										{
											clientef[i].imprimir();
										}
										else 
											for(i=0;i<quantj;i++)
										{
								
											if(clientej[i].getcnpj() == pesquisa)
											{
											clientej[i].imprimir();
											
											}
											else
												System.out.print("Cliente não cadastrado");				
										}
									}
						}
						
					}while(ops!=4);
					break;
					
					
				case 2:
					do{
						System.out.println("\n\nProdutos");
						System.out.println("\n\n1. Cadastrar Produto");
						System.out.println("2. Listar");
						System.out.println("3. Pesquisar");
						System.out.println("4. Voltar ao menu principal");
						System.out.print("Opção >> ");
						ops = get.nextInt();
					
					
					
					switch(ops)
					{
					case 1:
							merc[quantp++] = new Produto();
							break;
					case 2:
							for(i=0;i<quantp;i++)
							{
								merc[i].imprimir();
							}
								break;
					case 3:
							System.out.println("Pesquisar por código ou nome (C ou N)");
							busca = get.next().toUpperCase();
							if(busca.equals("C"))
							{
								System.out.print("Informe o código ");
								produto = get.next();
								for(i=0;i<quantp;i++)
								{
									if(merc[i].getcodigo().equalsIgnoreCase(produto))
									{
										merc[i].imprimir();
									}
								}
							}
							else
								if(busca.equals("N"))
								{
									
									System.out.print("Informe o Nome ");
									produto = get.next();
									for(i=0;i<quantp;i++)
									{
										if(merc[i].getnome().equalsIgnoreCase(produto))
										{
											merc[i].imprimir();
											
										}
									
										else
											if(op=='N' && (!busca.equals("N")) || op=='C' && (!busca.equals("C")) )
											System.out.print("Produto não cadastrado");
									}
								}
							break;
					}
					}while(ops!=4);
					break;
				}
				
			}while(op!=3);
		}
		//TESTE PARA ACESSAR MODO CLIENTE FISICO NO SISTEMA
			for(i=0;i<quantf;i++)
			{
				
				
				if(login.equals(clientef[i].getlogin()) && senha.equals(clientef[i].getsenha()) )
				{
					do{
						System.out.println("\n\nCliente Fisico");
						System.out.println("\n\n1. Incluir produtos");
						System.out.println("2. Ver produtos");
						System.out.println("3. Fechar compra");
						System.out.println("4. Sair");
						
						System.out.print("Opção >> ");
						op = get.nextInt();
						
						switch(op)
						{
						case 1:	
		
								System.out.println("Informe nome do produto");
								nome = get.next();
								System.out.println("Informe a quantidade");
								quant = get.nextInt();
								
									for(i=0;i<quantp;i++)
									{
											if(nome.equals(merc[i].getnome()))	
											{
												if(merc[i].getBaixaEstoque()>0)
												{
												Compra[carrinho++] = merc[i].getnome();
												total += merc[i].getvalordavenda();
												 
												}
												else
												{
													System.out.print("Produto indisponivel");
												}
												break;
											}
									}
									if (i==quantp)
									{
										System.out.print("Produto não cadastrado");
									}
							break;
							
						case 2:
							System.out.print("\nCarrinho:");
							System.out.println();
							System.out.print("Produto | Quantidade | Preço Un R$: " );
								for(i=0;i<carrinho;i++)
								{
									System.out.println();
									System.out.print( Compra[i]+ "        " +quant+ "          "+merc[i].getvalordavenda()); 
								}	 
							System.out.print("\n\nValor total R$ > "+(quant*merc[i].getvalordavenda()));
								break;
						case 3:
								for(i=0;i<carrinho;i++)
								{
									quant-=merc[i].setBaixaEstoque();
								}
								System.out.print("Nome:" +clientef[i].nome +  "\nTotal R$ > "+(quant*merc[i].getvalordavenda()));
								carrinho= 0;
								total = 0;
								break;
						}
						
					}while(op!=4);
				}
				else
					//TESTE PARA ACESSAR MODO CLIENTE JURIDICO
					for(i=0;i<quantj;i++)
					{
						if(login.equals(clientej[i].getlogin())  && senha.equals(clientej[i].getsenha()))
						{
							do{
								System.out.println("\n\nCliente Fisico");
								System.out.println("\n\n1. Incluir produtos");
								System.out.println("2. Ver produtos");
								System.out.println("3. Fechar compra");
								System.out.println("4. Sair");
								
								System.out.print("Opção >> ");
								op = get.nextInt();
								
								switch(op)
								{
								case 1:	
				
										System.out.println("Informe nome do produto");
										nome = get.next();
										System.out.println("Informe a quantidade");
										quant = get.nextInt();
										
											for(i=0;i<quantp;i++)
											{
													if(nome.equals(merc[i].getnome()))	
													{
														if(merc[i].getBaixaEstoque()>0)
														{
														Compra[carrinho++] = merc[i].getnome();
														total += merc[i].getvalordavenda();
														 
														}
														else
														{
															System.out.print("Produto indisponivel");
														}
														break;
													}
											}
											if (i==quantp)
											{
												System.out.print("Produto não cadastrado");
											}
									break;
									
								case 2:
									System.out.print("\nCarrinho:");
									System.out.println();
									System.out.print("Produto | Quantidade | Preço Un R$: " );
										for(i=0;i<carrinho;i++)
										{
											System.out.println();
											System.out.print( Compra[i]+ "        " +quant+ "          "+merc[i].getvalordavenda()); 
										}	 
									System.out.print("\n\nValor total R$ > "+(quant*merc[i].getvalordavenda()));
										break;
								case 3:
										for(i=0;i<carrinho;i++)
										{
											quant-=merc[i].setBaixaEstoque();
										}
										System.out.print("Nome:" +clientef[i].nome +  "\nTotal R$ > "+(quant*merc[i].getvalordavenda()));
										carrinho= 0;
										total = 0;
										break;
								}
								
							}while(op!=4);
						}
					}
			}
			
		}while(op!=5);
	}

}
