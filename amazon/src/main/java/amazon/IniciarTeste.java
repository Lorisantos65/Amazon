package amazon;

public class IniciarTeste {

	public void abrirBrowser (String navegador , String site ) {
		
		if (navegador.equalsIgnoreCase("chorme")) {
			System.out.println( site + "aberto ccom sucesso no " + navegador);
		}else if (navegador.equalsIgnoreCase(" Firefox")) {
			System.out.println( site + "aberto ccom sucesso no " + navegador);
		}else {
			System.out.println("navegador inválido digite chorme ou firefox ");
		}
		
	}
	
	public void fecharBrowser () {
		System.out.println("browser fechado com sucesso");
	}
}
