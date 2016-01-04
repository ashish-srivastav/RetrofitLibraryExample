package androidwarriors.retrofit20example.pojo;

import com.google.gson.annotations.Expose;

/**
 * Created by kundan on 8/8/2015.
 */
public class Weather {


    @Expose
    private int CorporateId;

    public String getCorporateName() {
        return CorporateName;
    }

    public void setCorporateName(String corporateName) {
        CorporateName = corporateName;
    }

    public int getCorporateId() {
        return CorporateId;
    }

    public void setCorporateId(int corporateId) {
        CorporateId = corporateId;
    }

    @Expose
    private String CorporateName;
    @Expose
    private String description;
    @Expose
    private String icon;

    /**
     *
     * @return
     * The id
     */
 /*   public Integer getId() {
        return id;
    }

    *//**
     *
     * @param id
     * The id
     *//*
    public void setId(Integer id) {
        this.id = id;
    }

    *//**
     *
     * @return
     * The main
     *//*
    public String getMain() {
        return main;
    }
*/
    /**
     *
     * @param main
     * The main
     */
    /*public void setMain(String main) {
        this.main = main;
    }*/

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     *
     * @param icon
     * The icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }
}
