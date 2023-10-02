package structure;

import org.junit.jupiter.api.Test;
import structure.adapter.Adaptee;
import structure.adapter.Adapter;

public class AdapterTest {
    @Test
    void testAdapter()
    {
        Adapter adapter = new Adapter(new Adaptee());
        adapter.dc20v();
    }
}
