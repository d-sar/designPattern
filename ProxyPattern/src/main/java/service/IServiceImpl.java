package service;

public class IServiceImpl implements IService {
    @Override
    public double compute(int t) {
        System.out.println("IService.compute....");
        return Math.cos(t * Math.PI / 180);
    }
}
