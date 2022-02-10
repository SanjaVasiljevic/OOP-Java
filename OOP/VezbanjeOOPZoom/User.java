package VezbanjeOOPZoom;

public class User {
    private String fullName;
    private String licence;

    public User(){
        this.licence="basic";
    }
    public User(String fullName){
        this.fullName=fullName;
        this.licence="basic";
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLicence() {
        return licence;
    }
    public void subscribe (int amount){
        switch (amount){
            case 100:
                this.licence="pro";
                break;
            case 150:
                this.licence="premium";
                break;
        }
    }
    public void unsubscribe (){
        this.licence="basic";
    }
    public int callDuration (){
        if(this.licence.equals("basic")){
            return 40;
        }else if (this.licence.equals("pro")){
            return 240;
        }else {
            return 1440;
        }
    }
    public void print(){
        System.out.println(this.fullName);
    }


}
