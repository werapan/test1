import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OXTest {
    @Test
    void shouldCreateOXObjectCorrectly() {
        OX ox = new OX();
        // " 012\n0---\n1---\n2---\n"
        assertEquals(" 012\n0---\n1---\n2---\n",ox.getTableString());
        assertEquals("X", ox.getCurrentPlayer());
        assertEquals(0, ox.getCountO());
        assertEquals(0, ox.getCountX());
        assertEquals(0, ox.getCountDraw());
    }

    @Test
    void put() {
        OX ox = new OX();

        ox.put(1,1);
        assertEquals(" 012\n0---\n1-X-\n2---\n",ox.getTableString());

        ox.put(0,0);
        assertEquals(" 012\n0X--\n1-X-\n2---\n",ox.getTableString());

        ox.put(2,1);
        assertEquals(" 012\n0X--\n1-XX\n2---\n",ox.getTableString());

        ox.switchPlayer(); // O
        ox.put(0,2);
        assertEquals(" 012\n0X--\n1-XX\n2O--\n",ox.getTableString());

        assertFalse(ox.put(0, 2));

        //assertEquals(false, ox.put(0,3));

    }

    @Test
    void switchPlayer() {
        OX ox = new OX();
        ox.switchPlayer();
        assertEquals("O", ox.getCurrentPlayer());
        ox.switchPlayer();
        assertEquals("X", ox.getCurrentPlayer());
    }

    @Test
    void checkWin1() {
        OX ox = new OX();
        ox.put(0,0);
        ox.put(0,1);
        ox.put(0,2);
        assertEquals(" 012\n0X--\n1X--\n2X--\n",ox.getTableString());
        assertTrue(ox.checkWin(0, 0));
        assertTrue(ox.checkWin(0, 1));
        assertTrue(ox.checkWin(0, 2));
    }


    @Test
    void checkWin2() {
        OX ox = new OX();
        ox.put(0,0);
        ox.put(0,1);

        assertEquals(" 012\n0X--\n1X--\n2---\n",ox.getTableString());
        assertFalse(ox.checkWin(0, 0));
        assertFalse(ox.checkWin(0, 1));
    }

    @Test
    void checkWin3() {
        OX ox = new OX();
        ox.put(1,0);
        ox.put(1,1);
        ox.put(1,2);
        assertEquals(" 012\n0-X-\n1-X-\n2-X-\n",ox.getTableString());
        assertTrue(ox.checkWin(1, 0));
        assertTrue(ox.checkWin(1, 1));
        assertTrue(ox.checkWin(1, 2));
    }


    @Test
    void checkWin4() {
        OX ox = new OX();
        ox.put(0,0);
        ox.put(1,0);
        ox.put(2,0);
        assertEquals(" 012\n0XXX\n1---\n2---\n",ox.getTableString());
        assertTrue(ox.checkWin(0, 0));
        assertTrue(ox.checkWin(1, 0));
        assertTrue(ox.checkWin(2, 0));
    }

    @Test
    void checkWin5() {
        OX ox = new OX();
        ox.put(0,0);
        ox.put(1,1);
        ox.put(2,2);
        assertEquals(" 012\n0X--\n1-X-\n2--X\n",ox.getTableString());
        assertTrue(ox.checkWin(0, 0));
        assertTrue(ox.checkWin(1, 1));
        assertTrue(ox.checkWin(2, 2));
    }

    @Test
    void checkWin6() {
        OX ox = new OX();
        ox.put(0,0);
        ox.put(1,1);
        ox.put(2,2);
        assertEquals(" 012\n0X--\n1-X-\n2--X\n",ox.getTableString());
        assertTrue(ox.checkWin(0, 0));
        assertTrue(ox.checkWin(1, 1));
        assertTrue(ox.checkWin(2, 2));
    }

    @Test
    void checkWin7() {
        OX ox = new OX();
        ox.put(0,0);
        ox.put(1,1);
        ox.put(2,2);
        assertEquals(" 012\n0X--\n1-X-\n2--X\n",ox.getTableString());
        assertTrue(ox.checkWin(0, 0));
        assertTrue(ox.checkWin(1, 1));
        assertTrue(ox.checkWin(2, 2));
    }
    @Test
    void checkWin8() {
        OX ox = new OX();
        ox.put(0,0);
        ox.put(1,1);
        ox.put(2,2);
        assertEquals(" 012\n0X--\n1-X-\n2--X\n",ox.getTableString());
        assertTrue(ox.checkWin(0, 0));
        assertTrue(ox.checkWin(1, 1));
        assertTrue(ox.checkWin(2, 2));
    }
}