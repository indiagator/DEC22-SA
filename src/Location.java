public class Location
{
    String restroId;
    int latx;
    int lony;

    public void setRestroId(String restroId) {
        this.restroId = restroId;
    }

    public void setLatx(int latx) {
        this.latx = latx;
    }

    public void setLony(int lony) {
        this.lony = lony;
    }

    public String getRestroId() {
        return restroId;
    }

    public int getLatx() {
        return latx;
    }

    public int getLony() {
        return lony;
    }

    @Override
    public String toString()
    {
        return "Location{" +
                "restroId='" + restroId + '\'' +
                ", latx=" + latx +
                ", lony=" + lony +
                '}';
    }
}
