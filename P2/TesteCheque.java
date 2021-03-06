import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteCheque
{
    private Cheque cheque = new Cheque();

    @Test
    public void teste123456()
    {
        cheque.setValor(123456);
        assertEquals("cento e vinte e três mil e quatrocentos e cinquenta e seis reais",
            cheque.getValorPorExtenso());
    }

    @Test
    public void teste654321()
    {
        cheque.setValor(654321);
        assertEquals("seiscentos e cinquenta e quatro mil e trezentos e vinte e um reais",
            cheque.getValorPorExtenso());
    }
}