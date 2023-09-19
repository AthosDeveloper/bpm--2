import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Logic {
    private List<Integer> listaNumeros;
    private List<Integer> total;
    private Scanner scanner;
public Logic(){
    listaNumeros = new ArrayList<>();
    total = new ArrayList<>();
    scanner = new Scanner(System.in);
}
public   void ordenarImparesEPares(){

    System.out.println("informe a quantidade de números que você deseja inserir:");
    var linha = scanner.nextInt();
    for (int i = 0; i < linha; i ++){
        System.out.println("informe o o valor a ser inserido:");
        var valor = scanner.nextInt();
        listaNumeros.add(valor);
    }
    var pares = listaNumeros.stream()
            .filter(l -> l %2 == 0).sorted().collect(Collectors.toList());
    var impares = listaNumeros.stream().filter(l -> l%2 == 1).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    total.addAll(pares);
    total.addAll(impares);
    total.forEach(System.out::println);
}
    public  void converterTempo() {
        System.out.println("informe o tempo em mileSegundos:");
        Long seconds = scanner.nextLong();

        Long miles = seconds * 1000;

        Date date = new Date(miles);
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
        System.out.println("a data convertida é de: " + df.format(date));
    }
   public void sequencia(){
       System.out.println("informe o número:");
       int n = scanner.nextInt();
       System.out.println("Número Fibo = " + fibonacci(n));
   }
   static  Integer fibonacci(int n){
    if (n < 2){
        return  n;
    } else
  return  fibonacci(n - 1) + fibonacci(n - 2);
   }
    }

