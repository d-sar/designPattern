import controllers.Client;
import proxy.ProxyCache;
import proxy.SecuredProxy;
import service.IService;
import service.IServiceImpl;

import java.security.Provider;
import java.security.Security;

public class Test {
    public static void main(String[] args) {

        IService service = new IServiceImpl();
        Client client= new Client();
        client.setService(service);
        System.out.println("RES="+client.perform(23));
        System.out.println("RES="+client.perform(23));

        System.out.println("---------------------ProxyCache-----------------");
        IService cache = new ProxyCache();
        client.setService(cache);
        System.out.println("RES="+client.perform(23));
        System.out.println("RES="+client.perform(23));

        System.out.println("---------------------Security Proxy-----------------");
        IService service1= new IServiceImpl();
        var securedProxy = new SecuredProxy();
        securedProxy.setPassword("1234");
        securedProxy.setService(service1);
        client.setService(securedProxy);
        System.out.println("RES="+client.perform(23));
        System.out.println("RES="+client.perform(23));

        System.out.println("---------------------Security la cache-----------------");
        IService cache2 = new ProxyCache();
        securedProxy.setPassword("1234");
        securedProxy.setService(cache2);
        client.setService(securedProxy);
        System.out.println("RES="+client.perform(23));
        System.out.println("RES="+client.perform(23));

    }
}
