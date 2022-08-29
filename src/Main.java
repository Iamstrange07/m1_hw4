public class Main {
    public static void main(String[] args) {
        School[] friends=teachers();
        for(School school:friends){
            System.out.println(school.getClass().getSimpleName()+" :");
            System.out.println("Class :"+school.classy);
            System.out.println("Frequency of students :"+school.quantity);

            
        }



    }
    private static School[] teachers(){
        SinanMahabat aza=new SinanMahabat("9D",24);
        AbdulazizNargiza bayas=new AbdulazizNargiza("9E",23);
        MrJohnKenesh yusuf=new MrJohnKenesh("9C",28);
        AlmazErlan adilet=new AlmazErlan("9B",31);
        Mirbek temirbek=new Mirbek("9A",13);
        School[] school={aza,bayas,yusuf,adilet,temirbek};
        return school;

    }
}