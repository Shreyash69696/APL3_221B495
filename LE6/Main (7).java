public class Main {
    public static void main(String[] args){
        Offering offering =  new coffee();
        offering = new Rum(offering);
        offering = new Rum(offering);
        System.out.println(offering.getName()+ " "+offering.getPrice());
    }
}