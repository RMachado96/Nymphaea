# Farmacia

To do:

	Organização:
    - Separar todas as classes por packages (da maneira mais apropriada);
    - Criar regras de normalização de codigo para melhor organização das classes escritas por nós;

Classes:

    Itens:
      - Método para adicionar um novo tipo de item. (Done)
      - Método para adicionar stock de itm. (Done)
      - Método para mudar o valor de item. (Done)
      - Método para retirar dado stock de item. (Done)
      - Método para listagem; (Done)
      - Método para listagem de stock com possibilidade de utilização de filtros;(Done)
			
    Pessoal:
      - Método para adicionar empregados. (Done)
      - Método para listar empregados.
      - Método para mudar informação de empregados. (WIP)
      - Método para promover dado empregado. (Done)
      - Criar nova variavel para dar track se o empregado se encontra ativo (ou despedido);
      - Criação de histórico de empregados.
			
    Contabilidade:
      - Método para guardar lucros, despesas, networth;(Done)
      - Método para listagem de gastos e lucros;
      - (Possivelmente) Estatisticas relacionadas com o método anterior.
			
    Recursos:
      - No idea what this is.
      - Verificar espaço de armazém(?)
      - Verificar vagas e posições a preencher
      
			
    I/O:
      - Métodos para ler e guardar informação escrita em ficheiros CSV. Possivelmente o mais generica possivel, assim utilizamos só uma para todas as classes;(Done)
      - Passar I/O para class format;(Done)
			
    Interfaces:
      - FIX THE FUCKING TAB SYSTEM. (Done)
      - Interface especifica para cada class.
      - Criar as interfaces de cada class em ficheiros separados, tal como a frame. Criar as listas para guardar cada tipo de objecto na propria interface correspondente.


Para o final do trabalho:
  - Escrita do codigo em formato UML;
  - Javadoc para todos os métodos/classes;
  - Relatório;


Other information:

     Informação de objectos:
		 
        Item: Nome do item
              Descrição
              Valor
              Quantidade
             
        
        Empregado: DOB
                   Nome
                   Idade
                   Rank
                   Salario

        Valor de Salario base: 600(?) Yes
    
      
  
