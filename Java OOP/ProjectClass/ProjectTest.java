public class ProjectTest{
public static void main(String[] args){
    Project first =new Project();
    first.setName("anything");
    System.out.println(first.getName());
    Project secand =new Project("anas");
    secand.setDesc("annnnnnn aaaaa ssss");
    System.out.println(secand.getDesc());
    Project third = new Project("gggdsdsfssdf", "To any thing!");
	System.out.println(third.elevatorPitch());

}



}

