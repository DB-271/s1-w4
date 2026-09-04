public class SolarPanelSystemMain {
    public static void main(String[] args) {
        SolarPanelSystem s = new SolarPanelSystem(0,50);
        s.powerUse(50,2);
        s.sunShinning(300,8);
        System.out.println(s.getTotalUsage());
        System.out.println(s.getBatteryLifeHours());
        System.out.println(s.getCurrentCharge());
        s.powerUse(25,4);
        s.sunShinning(150,4);
        System.out.println(s.getTotalUsage());
        System.out.println(s.getBatteryLifeHours());
        System.out.println(s.getCurrentCharge());
    }
}