//package Jogo1;
//
//import br.senai.sc.rpg.model.entities.armas.*;
//import br.senai.sc.rpg.model.entities.personagens.*;
//import br.senai.sc.rpg.model.entities.usuarios.Pessoa;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//
//	static Scanner sc = new Scanner(System.in);
//	static ArrayList<Personagem> personagens = new ArrayList<>();
//	static ArrayList<Arma> armas = new ArrayList<>();
//	static ArrayList<Escudo> escudos = new ArrayList<>();
//	static ArrayList<Pessoa> usuarios = new ArrayList<>();
//	static Personagem personagem;
//	static Pessoa user;
//
//	public static void main(String[] args) {
//		cadastrarArmas();
//		Mestre mestre = new Mestre(1, "123");
//		usuarios.add(mestre);
//		menu();
//	}
//
//	public static void menu() {
//		System.out.println("----- Entrar ------");
//		System.out.print("Código: ");
//		int codigo = sc.nextInt();
//		System.out.print("Senha: ");
//		String senha = sc.next();
//
//		if (verificacaoUsuario(codigo, senha)) {
//			menuPrincipal();
//		}
//	}
//
//	public static void menuPrincipal() {
//
//		System.out.println(user.opcoesMenu());
//		int opcao = sc.nextInt();
//
//		switch (opcao) {
//		case 1:
//			if (user instanceof Jogador) {
//				Personagem personagem = cadastroPersonagem();
//				novaArma(personagem);
//				personagens.add(personagem);
//				System.out.println("Personagem Cadastrado!");
//			} else {
//				menuArmas();
//			}
//			break;
//		case 2:
//			if (user instanceof Jogador) {
//				for (int i = 0; i < personagens.size(); i++) {
//					System.out.println(personagens.get(i).toString());
//				}
//				System.out.print("Nome do personagem: ");
//				String nome = sc.next();
//				selecionarPersonagem(nome);
//			} else {
//
//			}
//			break;
//		case 0:
//			user = null;
//			menu();
//		}
//		menuPrincipal();
//	}
//
//	public static void menuArmas() {
//
//		System.out.println("----- Armas ----- \n0 - Voltar \n1 - Listar \n2 - Cadastrar Armas \n3 - Cadastrar Escudos");
//		int opcao = sc.nextInt();
//
//		switch (opcao) {
//		case 0:
//			menuPrincipal();
//			break;
//		case 1:
//			for (int i = 0; i < armas.size(); i++) {
//				System.out.println(armas.get(i).toString());
//			}
//			for (int i = 0; i < escudos.size(); i++) {
//				System.out.println(escudos.get(i).toString());
//			}
//			break;
//		case 2:
//			Arma arma = cadastroArma();
//			armas.add(arma);
//			System.out.println("Arma Cadastrada!");
//			break;
//		case 3:
//			Escudo escudo = cadastroEscudo();
//			escudos.add(escudo);
//			System.out.println("Escudo Cadastrado!");
//		}
//		menuArmas();
//	}
//
//	public static void menuJogo() {
//		System.out.println("----- Jogo -----");
//	}
//
//	public static Arma cadastroArma() {
//
//		System.out.println("Tipo da Arma: \n1 - Espada \n2 - Adaga \n3 - Cajado");
//		int tipoArma = sc.nextInt();
//
//		System.out.print("Código: ");
//		int codigo = sc.nextInt();
//		System.out.print("Dano Mínimo: ");
//		double danoMinimo = sc.nextDouble();
//		System.out.print("Dano Míximo: ");
//		double danoMaximo = sc.nextDouble();
//		System.out.print("Valor: ");
//		double valor = sc.nextDouble();
//
//		switch (tipoArma) {
//		case 1:
//			return new Espada(danoMinimo, danoMaximo, valor, codigo);
//		case 2:
//			return new Adaga(danoMinimo, danoMaximo, valor, codigo);
//		case 3:
//			return new Cajado(danoMinimo, danoMaximo, valor, codigo);
//		}
//
//		return null;
//	}
//
//	public static Escudo cadastroEscudo() {
//
//		System.out.print("Código: ");
//		int codigo = sc.nextInt();
//		System.out.print("Defesa: ");
//		int defesa = sc.nextInt();
//		return new Escudo(defesa, codigo);
//	}
//
//	public static void novaArma(Personagem personagem) {
//
//		System.out.println("Escolha uma das Armas a seguir: ");
//		System.out.println(personagem.listarArmas());
//		int opcao = sc.nextInt();
//		personagem.atribuirArma(opcao);
//
//	}
//
//	public static Personagem cadastroPersonagem() {
//
//		System.out.println("----- Novo Personagem -----\n1 - Guerreiro \n2 - Ladino \n3 - Mago \n4 - Paladino");
//		int classe = sc.nextInt();
//
//		System.out.print("Nome: ");
//		String nome = sc.next();
//		System.out.print("Vida (Máx 20): ");
//		double vida = sc.nextDouble();
//		System.out.print("Dano: (Máx 10): ");
//		double dano = sc.nextDouble();
//		System.out.print("Mana: (Máx 20): ");
//		double mana = sc.nextDouble();
//
//		System.out.println("Determinar Status: (Escolher números de 0 à 18, sem repetição)");
//		System.out.print("Força: ");
//		int forca = sc.nextInt();
//		System.out.print("Destreza: ");
//		int destreza = sc.nextInt();
//		System.out.print("Constituição: ");
//		int constituicao = sc.nextInt();
//		System.out.print("Carisma: ");
//		int carisma = sc.nextInt();
//		System.out.print("Sabedoria: ");
//		int sabedoria = sc.nextInt();
//		System.out.print("Inteligência: ");
//		int inteligencia = sc.nextInt();
//
//		if (vida > 20) {
//			vida = 20;
//		}
//		if (dano > 10) {
//			dano = 10;
//		}
//		if (mana > 20) {
//			mana = 20;
//		}
//
//		Personagem personagemCadastrado = null;
//		switch (classe) {
//		case 1:
//			personagemCadastrado = new Guerreiro(nome, vida, dano, mana, sabedoria, inteligencia, destreza, forca,
//					constituicao, carisma, 1);
//			break;
//		case 2:
//			personagemCadastrado = new Ladino(nome, vida, dano, mana, sabedoria, inteligencia, destreza, forca,
//					constituicao, carisma, 1);
//			break;
//		case 3:
//			personagemCadastrado = new Mago(nome, vida, dano, mana, sabedoria, inteligencia, destreza, forca,
//					constituicao, carisma, 1);
//			break;
//		case 4:
//			personagemCadastrado = new Paladino(nome, vida, dano, mana, sabedoria, inteligencia, destreza, forca,
//					constituicao, carisma, 1);
//			break;
//		}
//
//		if (!verificacaoStatus(personagemCadastrado)) {
//			System.out.println("Status com Erro!");
//			cadastroPersonagem();
//		}
//
//		return personagemCadastrado;
//	}
//
//	public static boolean verificacaoStatus(Personagem p) {
//
//		if (p.getCarisma() != p.getConstituicao() && p.getCarisma() != p.getSabedoria()
//				&& p.getCarisma() != p.getForca() && p.getForca() != p.getInteligencia()
//				&& p.getInteligencia() != p.getDestreza()) {
//			return true;
//		}
//		return false;
//	}
//
//	public static void selecionarPersonagem(String nome) {
//
//		for (int i = 0; i < personagens.size(); i++) {
//			if (personagens.get(i).getNome().equals(nome)) {
//				personagem = personagens.get(i);
//			}
//		}
//	}
//
//	public static boolean verificacaoUsuario(int codigo, String senha) {
//
//		for (int i = 0; i < usuarios.size(); i++) {
//			if (usuarios.get(i).getCodigo() == codigo && usuarios.get(i).getSenha().equals(senha)) {
//				user = usuarios.get(i);
//				return true;
//			}
//		}
//		return false;
//	}
//
//	public static void cadastrarArmas() {
//
//		Espada espada = new Espada(1, 8, 20, 1);
//		armas.add(espada);
//		Espada espada2 = new Espada(3, 8, 25, 2);
//		armas.add(espada2);
//		Espada espada3 = new Espada(1, 10, 50, 3);
//		armas.add(espada3);
//		Espada espada4 = new Espada(4, 10, 60, 4);
//		armas.add(espada4);
//
//		Adaga adaga = new Adaga(1, 4, 10, 5);
//		armas.add(adaga);
//		Adaga adaga2 = new Adaga(1, 6, 15, 6);
//		armas.add(adaga2);
//		Adaga adaga3 = new Adaga(2, 6, 25, 7);
//		armas.add(adaga3);
//		Adaga adaga4 = new Adaga(1, 8, 30, 8);
//		armas.add(adaga4);
//
//		Cajado cajado = new Cajado(1, 1, 50, 9);
//		armas.add(cajado);
//		Cajado cajado2 = new Cajado(2, 3, 70, 10);
//		armas.add(cajado2);
//		Cajado cajado3 = new Cajado(1, 5, 100, 11);
//		armas.add(cajado3);
//		Cajado cajado4 = new Cajado(1, 8, 150, 12);
//		armas.add(cajado4);
//
//		Escudo escudo = new Escudo(2, 1);
//		escudos.add(escudo);
//		Escudo escudo2 = new Escudo(6, 2);
//		escudos.add(escudo2);
//		Escudo escudo3 = new Escudo(8, 3);
//		escudos.add(escudo3);
//		Escudo escudo4 = new Escudo(10, 4);
//		escudos.add(escudo4);
//	}
//}
