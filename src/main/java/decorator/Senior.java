package decorator;

public class Senior extends DevDecorator{
    public Senior(Developer developer) {
        super(developer);
    }
    public String codeRewiew(){
        return "Make code";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + codeRewiew();
    }
}
