
public class Main
{
	public static void main(String args[])
	{
		int tamanho = 1000000;
		
		Medicao medicao = new Medicao(tamanho);
		
		long t0 = System.currentTimeMillis();
		
		for(int i = 0; i < 100; i++)
			medicao.linear();
		
		long t1 = System.currentTimeMillis();
		
		long tempoProcessamento = (t1 - t0) / 100;
		
		System.out.println("Tempo linear: " + tempoProcessamento);
		
		t0 = System.currentTimeMillis();
		
		medicao.quadratico();
		
		t1 = System.currentTimeMillis();
		
		tempoProcessamento = (t1 - t0) / 100;
		
		System.out.println("Tempo quadratico: " + tempoProcessamento);
		
		t0 = System.currentTimeMillis();
		
		medicao.cubico();
		
		t1 = System.currentTimeMillis();
		
		tempoProcessamento = (t1 - t0) / 100;
		
		System.out.println("Tempo cubico: " + tempoProcessamento);
	}
}