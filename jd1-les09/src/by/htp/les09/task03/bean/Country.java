package by.htp.les09.task03.bean;

import java.util.ArrayList;
import java.util.List;

public class Country {
	private List<Region> country;
	private String name;

	public Country() {
		country = new ArrayList<Region>();
	}

	public Country(String name) {
		country = new ArrayList<Region>();
		this.name = name;
	}

	public List<Region> getCountry() {
		return country;
	}

	public void setCountry(List<Region> country) {
		this.country = country;
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
		result = prime * result + ((country == null) ? 0 : country.hashCode());
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
		Country other = (Country) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
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
		return "Country [country=" + country + ", name=" + name + "]";
	}

	public void addRegion(Region newRegion) {
		country.add(newRegion);
	}

}
