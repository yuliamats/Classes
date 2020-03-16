package by.htp.les09.task03.bean;

import java.util.ArrayList;
import java.util.List;

public class District {
	private List<Town> district;
	private String name;

	public District() {
		district = new ArrayList<Town>();
	}

	public District(String name) {
		district = new ArrayList<Town>();
		this.name = name;
	}

	public List<Town> getDistrict() {
		return district;
	}

	public void setDistrict(List<Town> district) {
		this.district = district;
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
		result = prime * result + ((district == null) ? 0 : district.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		District other = (District) obj;
		if (district == null) {
			if (other.district != null)
				return false;
		} else if (!district.equals(other.district))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "District [district=" + district + ", name=" + name + "]";
	}

	public void addTown(Town newTown) {
		district.add(newTown);
	}
}
