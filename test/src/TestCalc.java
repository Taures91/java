public class TestCalc {
    @Test
    public void testCalc () throws Exception{
        Calculator calculator = new Calculator();
        int result = calculator.sum(3,4 );
        if (result !=7){
            System.out.println("error!");
        }
    }
}
