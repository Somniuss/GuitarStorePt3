package com.somniuss.guitarstore.logic.impl;

import com.somniuss.guitarstore.dao.DaoProvider;
import com.somniuss.guitarstore.dao.GuitarStoreDao;
import com.somniuss.guitarstore.dao.DaoException;
import com.somniuss.guitarstore.entity.MusicalInstrument;
import com.somniuss.guitarstore.logic.GuitarstoreLogic;

import java.util.List;

public class GuitarstoreLogicImpl implements GuitarstoreLogic {

	private final GuitarStoreDao guitarStoreDao = DaoProvider.getInstance().getGuitarStoreDao();

	@Override
	public void addInstrument(MusicalInstrument instrument) {
		try {
			guitarStoreDao.addInstrument(instrument);
		} catch (DaoException e) {

			System.err.println("Error adding instrument: " + e.getMessage());
		}
	}

	@Override
	public MusicalInstrument findInstrumentById(int id) {
		try {
			return guitarStoreDao.findInstrumentById(id);
		} catch (DaoException e) {

			System.err.println("Error finding instrument by ID: " + e.getMessage());
			return null;
		}
	}

	@Override
	public List<MusicalInstrument> findInstrumentsByType(String type) {
		try {
			return guitarStoreDao.findInstrumentsByType(type);
		} catch (DaoException e) {

			System.err.println("Error finding instruments by type: " + e.getMessage());
			return List.of();
		}
	}

	@Override
	public List<MusicalInstrument> findInstrumentsByBrand(String brand) {
		try {
			return guitarStoreDao.findInstrumentsByBrand(brand);
		} catch (DaoException e) {

			System.err.println("Error finding instruments by brand: " + e.getMessage());
			return List.of();
		}
	}

	@Override
	public List<MusicalInstrument> sortInstrumentsByPrice(boolean ascending) {
		try {
			return guitarStoreDao.sortInstrumentsByPrice(ascending);
		} catch (DaoException e) {

			System.err.println("Error sorting instruments by price: " + e.getMessage());
			return List.of();
		}
	}

	@Override
	public List<MusicalInstrument> filterInstrumentsByPrice(double maxPrice) {
		try {
			return guitarStoreDao.filterInstrumentsByPrice(maxPrice);
		} catch (DaoException e) {

			System.err.println("Error filtering instruments by price: " + e.getMessage());
			return List.of();
		}
	}

	@Override
	public void updateInstrument(MusicalInstrument instrument) {
		try {
			guitarStoreDao.updateInstrument(instrument);
		} catch (DaoException e) {

			System.err.println("Error updating instrument: " + e.getMessage());
		}
	}

	@Override
	public boolean deleteInstrumentById(int id) {
		try {
			return guitarStoreDao.deleteInstrumentById(id);
		} catch (DaoException e) {

			System.err.println("Error deleting instrument by ID: " + e.getMessage());
			return false;
		}
	}
}
