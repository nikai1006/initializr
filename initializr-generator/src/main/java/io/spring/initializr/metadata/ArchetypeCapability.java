package io.spring.initializr.metadata;

import java.util.ArrayList;
import java.util.List;

/**
 * initializr io.spring.initializr.metadata
 *
 * @author: nikai
 * @Description:
 * @Date: Create in 22:34 2018/6/24
 * @Modified By:
 */
public class ArchetypeCapability extends ServiceCapability<List<Archetype>> implements Defaultable<Archetype> {
    private final List<Archetype> content = new ArrayList<>();

    public ArchetypeCapability() {
        super("archetype", ServiceCapabilityType.ACTION, "Project Archetype", "project archetype(eg. mybatis or JPA...)");
    }

    @Override
    public List<Archetype> getContent() {
        return this.content;
    }

    /**
     * Return the {@link Archetype} with the specified id or {@code null} if no such type
     * exists.
     *
     * @param id the ID to find
     * @return the Archetype or {@code null}
     */
    public Archetype get(String id) {
        return this.content.stream()
                .filter((it) -> id.equals(it.getId()))
                .findFirst().orElse(null);
    }

    @Override
    public Archetype getDefault() {
        return this.content.stream().filter(DefaultMetadataElement::isDefault).findFirst()
                .orElse(null);
    }

    @Override
    public void merge(List<Archetype> otherContent) {
        otherContent.forEach((it) -> {
            if (get(it.getId()) == null) {
                this.content.add(it);
            }
        });
    }
}
