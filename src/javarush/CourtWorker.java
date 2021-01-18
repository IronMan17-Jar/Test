package javarush;


import java.util.HashSet;
import java.util.Set;

public class CourtWorker {
    public String name;
    public int age;
    public String institution;
    public int salary;

    public CourtWorker(String name, int age, String institution, int salary) {
        this.name = name;
        this.age = age;
        this.institution = institution;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getInstitution(){
        return institution;
    }
    public void setInstitution(String institution){
        this.institution = institution;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    public static void main(String[] args) {
        Set<CourtWorker> set = new HashSet<>();

            CourtWorker assistantJudge1 = new CourtWorker("Danil", 29, "UrGU", 20000);
            CourtWorker assistantJudge2 = new CourtWorker("Ruslan", 35, "SiBGU", 19000);
            CourtWorker assistantJudge3 = new CourtWorker("Roman", 24, "ChelGU", 19000);
            CourtWorker secretary1 = new CourtWorker("Inna", 22, "BGU", 17000);
            CourtWorker secretary2 = new CourtWorker("Olga", 28, "SiBGU", 16500);
            CourtWorker secretary3 = new CourtWorker("Irina", 35, "ChelGU", 17500);
            CourtWorker judge1 = new CourtWorker("Ivan", 36, "SiBGU", 70000);
            CourtWorker judge2 = new CourtWorker("Egor", 40, "SiBGU", 75000);
            CourtWorker judge3 = new CourtWorker("Sergei", 44, "SiBGU", 85000);
            CourtWorker administrator = new CourtWorker("Petr", 50, "SPTU", 16000);
            set.add(assistantJudge1);
            set.add(assistantJudge2);
            set.add(assistantJudge3);
            set.add(secretary1);
            set.add(secretary2);
            set.add(secretary3);
            set.add(judge1);
            set.add(judge2);
            set.add(judge3);
            set.add(administrator);

            for(CourtWorker text : set) {
                System.out.println("Имя - " + text.getName()+", "+"Возраст - "+ text.getAge()+", "+"Университет - "+text.getInstitution()+", "+"Заработная плата - "+text.getSalary());
            }

    }
}
