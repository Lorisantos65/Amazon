package amazon;

public class AdicionarCarrinhoTeste {

	public static void main(String[] args) {
	

		IniciarTeste teste = new IniciarTeste();
		MetodosDeTeste metodos = new MetodosDeTeste();
		ElementoWeb elementos = new ElementoWeb();
		
		teste.abrirBrowser("Chrome" , "https://www.amazon.com.br");
		metodos.digitar(elementos.campoDigitar, "iphone");

		
		
	}

}
