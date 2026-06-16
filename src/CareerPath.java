public class CareerPath {
    private String pathName;
    private String description;

    public CareerPath(String pathName , String description){
        this.pathName = pathName;
        this.description = description;
    }

    public String getPathName(){
        return pathName;
    }

    public String getDescription(){
        return description;
    }
}
