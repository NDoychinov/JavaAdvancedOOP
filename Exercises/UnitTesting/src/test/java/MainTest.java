import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Niki on 31.7.2016 г..
 */
public class MainTest {
    @Mock
    List<String> listMocked;

    @Test
    public void main() throws Exception {
        listMocked = new ArrayList<String>();
        listMocked.add("hi");
        Mockito.verify(listMocked).add("hi");
    }


}