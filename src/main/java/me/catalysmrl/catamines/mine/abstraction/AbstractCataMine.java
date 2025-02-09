package me.catalysmrl.catamines.mine.abstraction;

import me.catalysmrl.catamines.CataMines;
import me.catalysmrl.catamines.mine.components.region.CataMineRegion;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCataMine implements CataMine {

    protected String name;
    protected String displayName;
    protected List<CataMineRegion> regions;

    public AbstractCataMine(String name) {
        this.name = name;
        this.displayName = "default";
        regions = new ArrayList<>();
    }

    @Override
    public void tick() {

    }

    @Override
    public void reset() {
        CataMines.getInstance().getMineManager().resetRegion(getRegions().get(0));
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        if ("*".equals(name)) throw new IllegalArgumentException();
        this.name = name;
    }

    @Override
    public String getDisplayName() {
        return "default".equals(displayName) ? name : displayName;
    }

    @Override
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public List<CataMineRegion> getRegions() {
        return regions;
    }
}
