package by.htp.les09.task03.bean;

import java.util.ArrayList;
import java.util.List;

public class Region {
	private List<District> region;
	private String name;

	public Region() {
		region = new ArrayList<District>();
	}

	public Region(String name) {
		region = new ArrayList<District>();
		this.name = name;
	}

	public List<District> getRegion() {
		return region;
	}

	public void setRegion(List<District> region) {
		this.region = region;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Region [region=" + region + ", name=" + name + "]";
	}

	public void addDistrict(District newDistrict) {
		region.add(newDistrict);
	}

}
