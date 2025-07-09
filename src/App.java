public class App {
    public class Operacoes{
    public static int somar(int a, int b){
        return a + b;
        }
    }
    public static void main(String[] args){
        int result = Operacoes.somar(15, 15);
        
        System.out.println(result);
    }
}
