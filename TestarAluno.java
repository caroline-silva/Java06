public class TestarAluno {

	public static void main(String[] args) {
		Aluno a01 = new Aluno();
		Aluno a02 = new Aluno();
		
		a01.setNome("Carol");
		a01.setMatricula(12309);
		a01.setNota1(7);
		a01.setNota2(8);
		a01.setNotaReavaliacao(0);
		
		a02.setNome("Brenda");
		a02.setMatricula(34509);
		a02.setNota1(9);
		a02.setNota2(1);
		a02.setNotaReavaliacao(9);
		
		System.out.println(a01);
		System.out.println("Media: " +a01.calcularMedia());
		
		System.out.println(a02);
		System.out.println("Media: " +a02.calcularMedia());

	}
}

