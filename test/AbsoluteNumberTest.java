import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AbsoluteNumberTest {
    /* Tinh tuyet doi
    0->0
    1->1
    -1->1
     */
    @Test
    void testFindAbsolute_0() {
        // gia trị
        int number = 0; // đầu vào
        int expected = 0; // mong muốn
        int actual = AbsoluteNumber.findAbsolute(number);
        // giá trị thực tế. muốn lấy giá trị thực tế thì phải gọi phương thức đó

        // so sánh gí trị thực tế vào mong muốn
        assertEquals(expected, actual);
    }

    @Test
    void testFindAbsolute_1() {
        // gia trị
        int number = 1; // đầu vào
        int expected = 1; // mong muốn
        int actual = AbsoluteNumber.findAbsolute(number);
        // giá trị thực tế. muốn lấy giá trị thực tế thì phải gọi phương thức đó

        // so sánh gí trị thực tế vào mong muốn
        assertEquals(expected, actual);
    }

    @Test
    void testFindAbsolute_2() {
        // gia trị
        int number = -1; // đầu vào
        int expected = 1; // mong muốn
        int actual = AbsoluteNumber.findAbsolute(number);
        // giá trị thực tế. muốn lấy giá trị thực tế thì phải gọi phương thức đó

        // so sánh gí trị thực tế vào mong muốn
        assertEquals(expected, actual);
    }
}