package dao;

import static org.junit.Assert.*;

import org.junit.Test;

import entity.Dvd;

public class DvdDaoTest {

	@Test
	public void testInsertDvd() {
		Dvd dvd = new Dvd();
		dvd.setDvdName("少林寺");
		dvd.setDvdPrice(25.4);
		dvd.setDvdStatus(1);
		dvd.setDvdType(2);
		dvd.setDvdRentPrice(0.4);
		System.out.println(dvd.toString());
		DvdDao dDao = new DvdDao();
		boolean flag = dDao.insertDvd(dvd);
		System.out.println(flag);
	}

}
