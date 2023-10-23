import proxy.BanqueService;
import proxy.BanqueWS;

public class Client {
    public static void main(String[] args) {
        BanqueService service=new BanqueWS().getBanqueServicePort();
        System.out.println(service.convertion(123));
    }
}
