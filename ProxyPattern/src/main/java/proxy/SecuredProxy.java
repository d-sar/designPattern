package proxy;

import service.IService;

public class SecuredProxy implements IService {
    private IService service;
    private String password;
    @Override
    public double compute(int t) {
        if(password == "1234"){
            return service.compute(t);
        }else {
            throw new RuntimeException("Not authorized");
        }
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setService(IService service) {
        this.service = service;
    }
}
