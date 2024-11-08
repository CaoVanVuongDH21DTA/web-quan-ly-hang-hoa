package Entity;

public class Article {

    private int article;

    private String articleName;

    private String level2Name;

    private String tuKhoa;

    private String level4Name;

    private String mcName;

    private int idLevel1;

    private String level1Name;

    // Getter and Setter methods

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public String getLevel2Name() {
        return level2Name;
    }

    public void setLevel2Name(String level2Name) {
        this.level2Name = level2Name;
    }

    public String getTuKhoa() {
        return tuKhoa;
    }

    public void setTuKhoa(String tuKhoa) {
        this.tuKhoa = tuKhoa;
    }

    public String getLevel4Name() {
        return level4Name;
    }

    public void setLevel4Name(String level4Name) {
        this.level4Name = level4Name;
    }

    public String getMcName() {
        return mcName;
    }

    public void setMcName(String mcName) {
        this.mcName = mcName;
    }

    public int getIdLevel1() {
        return idLevel1;
    }

    public void setIdLevel1(int idLevel1) {
        this.idLevel1 = idLevel1;
    }

    public String getLevel1Name() {
        return level1Name;
    }

    public void setLevel1Name(String level1Name) {
        this.level1Name = level1Name;
    }

	@Override
	public String toString() {
		return "Article [article=" + article + ", articleName=" + articleName + ", level2Name=" + level2Name
				+ ", tuKhoa=" + tuKhoa + ", level4Name=" + level4Name + ", mcName=" + mcName + ", idLevel1=" + idLevel1
				+ ", level1Name=" + level1Name + "]";
	}
    
    
}
