package proxy;

import service.IService;
import service.IServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class ProxyCache implements IService {
    private    IServiceImpl service = new IServiceImpl();
    private Map<Integer,Double> cache = new HashMap<Integer,Double>();
    @Override
    public double compute(int t) {
        if(!cache.containsKey(t)){
            double result = service.compute(t);
             cache.put(t,result);
             return result;
        }else{
            return cache.get(t);
        }
    }
}
