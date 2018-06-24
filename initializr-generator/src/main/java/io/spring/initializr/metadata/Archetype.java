package io.spring.initializr.metadata;

/**
 * initializr io.spring.initializr.metadata
 *
 * @author: nikai
 * @Description:
 * @Date: Create in 22:05 2018/6/24
 * @Modified By:
 */
public class Archetype extends DefaultMetadataElement implements Describable {

    private String description;
    /**
     *
     */
    private String groupId;
    /**
     *
     */
    private String artifactId;
    /**
     *
     */
    private String version;

    /**
     *
     */
    private String style;


    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "Archetype{" +
                "description='" + description + '\'' +
                ", groupId='" + groupId + '\'' +
                ", artifactId='" + artifactId + '\'' +
                ", version='" + version + '\'' +
                ", style='" + style + '\'' +
                '}';
    }
}
