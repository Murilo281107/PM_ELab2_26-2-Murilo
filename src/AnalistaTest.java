import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class AnalistaTest {
    @Test
    public void registrarPagamentoRecebidoCorretamente(){
        Analista analista = new Analista("Marcelo", "767.676.767.67");
        double pagamento = analista.registrarPagamento();
        assertEquals(analista.ultimoSalario, pagamento, 0.2);
    }
    @Test
    public void addHorasExtras(){
        Analista analista = new Analista("João", "676.767.676.76");
        double qtdHoras = 25;
        double horasExtras = analista.addHorasExtras(qtdHoras);
        assertEquals(horasExtras, qtdHoras, 0.1);
    }

}
