package VezbanjeOOPZoom;

public class ZoomCall {
    private String url;
    private String password;
    private User host;
    private User guest;

    public ZoomCall (String url, String password, User host){
        this.url=url;
        this.password=password;
        this.host=host;
    }
    public ZoomCall (String url, String password, User host, User guest){
        this.url=url;
        this.password=password;
        this.host=host;
        this.guest=guest;
    }
    public void start(){
        System.out.println("Zoom call: "+this.url+"\r\n"+
                "Password:"+this.password+"\r\n"+
                "Host: "+ this.host.getFullName()+"\r\n"+
                "Guest: "+this.guest.getFullName()+"\r\n"+
                "Max duration call:"+ this.host.callDuration()+ "min");
    }

    public String getUrl() {
        return url;
    }

    public String getPassword() {
        return password;
    }

    public User getHost() {
        return host;
    }

    public User getGuest() {
        return guest;
    }
    public void setGuest(User guest){
        this.guest=guest;
    }
}
