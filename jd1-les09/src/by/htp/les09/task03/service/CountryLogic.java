package by.htp.les09.task03.service;

import java.util.ArrayList;
import java.util.List;

import by.htp.les09.task03.bean.Country;
import by.htp.les09.task03.bean.District;
import by.htp.les09.task03.bean.Region;
import by.htp.les09.task03.bean.Status;
import by.htp.les09.task03.bean.Town;

public class CountryLogic {
	public Town findCapital(Country country) {
		for (Region region : country.getCountry()) {
			for (District district : region.getRegion()) {
				for (Town town : district.getDistrict()) {
					if (town.getStatus() == Status.CAPITAL) {
						return town;
					}
				}
			}
		}
		return null;
	}

	public int calcNumOfRegion(Country country) {
		int count = 0;
		for (Region region : country.getCountry()) {
			count++;
		}
		return count;
	}

	public double calcTotalSquare(Country country) {
		double totalSquare = 0;
		for (Region region : country.getCountry()) {
			for (District district : region.getRegion()) {
				for (Town town : district.getDistrict()) {
					totalSquare = totalSquare + town.getSquare();
				}
			}
		}
		return totalSquare;
	}

	public List findCapitalCity(Country country) {
		List<Town> result = new ArrayList<Town>();
		for (Region region : country.getCountry()) {
			for (District district : region.getRegion()) {
				for (Town town : district.getDistrict()) {
					if (town.getStatus() == Status.CAPITALCITY) {
						result.add(town);
					}
				}
			}
		}
		return result;
	}

}
