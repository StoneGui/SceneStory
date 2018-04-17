package gui.dong.scenestory.bean;

/**
 * @author 梁桂栋
 * @version 1.0
 * @date 2018/4/8  13:54.
 * e-mail 760625325@qq.com
 * GitHub: https://github.com/donlan
 * description: gui.dong.scenestory.bean
 */
public class Character implements IStoryElement{
    private String name;
    private String imgUrl;
    private int resId = -1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    @Override
    public boolean isScene() {
        return false;
    }

    @Override
    public int resId() {
        return resId;
    }

    @Override
    public String url() {
        return imgUrl;
    }
}
