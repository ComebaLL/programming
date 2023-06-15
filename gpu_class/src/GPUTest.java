   /** тест класса GPU */
/** @author Kuvykin Nikita */
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class GPUTest {

    @Test
    void set_price() {
        GPU g = new GPU();
        double s = g.set_price(100);
        assert s == 100;
    }


    @Test
    void set_GPU() {
        GPU g = new GPU();
        String s = g.set_GPU("1660");
        assert s == 100;
    }

    @org.junit.jupiter.api.Test
    void set_producer() {
        GPU g = new GPU();
        String s = g.set_producer("nvidia");
        assert s = "nvidia";
    }
    @org.junit.jupiter.api.Test
    void set_memorySize() {
        GPU g = new GPU();
        double s = g.set_memorySize(4);
        assert s == 4;
    }

    @org.junit.jupiter.api.Test
    void set_memoryType() {
        GPU g = new GPU();
        String s = g.set_memoryType("gddr5");
        assert s ==  "gdddr5";
    }


    @org.junit.jupiter.api.Test
    void set_connectionType() {
        GPU g = new GPU();
        String s = g.set_connectionType("hdmi");
        assert s == "hdmi";
    }


    @org.junit.jupiter.api.Test
    void to_string() {
        GPU g = new GPU();
        double s0 = g.set_price(1);
        String s1 = g.set_GPU("1660");
        String s2 = g.set_producer("nvidia");
        double s3 = g.set_memorySize(100);
        String s4 = g.set_memoryType("gdrr5");
        String s5 = g.set_connectionType("hdmi");
        String s = g.to_string();
        assert s == s2 + " producer " + s0 + " rub " + s1 + " GPU " + s3 + " byte" + s4 + " memory type " + s5 + "connection type";


    }

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void testSet_price() {
    }


    @org.junit.jupiter.api.Test
    void testSet_GPU() {
    }

    @org.junit.jupiter.api.Test
    void testSet_producer() {
    }


    @org.junit.jupiter.api.Test
    void testSet_memorySize() {
    }


    @org.junit.jupiter.api.Test
    void testSet_memoryType() {
    }


    @org.junit.jupiter.api.Test
    void testSet_connectionType() {
    }


    @org.junit.jupiter.api.Test
    void testTo_string() {
    }

    @org.junit.jupiter.api.Test
    void testWrite_in_file() {
    }
}