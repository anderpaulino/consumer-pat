package br.com.alelo.consumer.consumerpat.entity;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Consumer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	String name;
	int documentNumber;
	Date birthDate;

	// contacts
	int mobilePhoneNumber;
	int residencePhoneNumber;
	int phoneNumber;
	String email;

	// Address
	String street;
	int number;
	String city;
	String country;
	int portalCode;

	// cards
	int foodCardNumber;
	double foodCardBalance;

	int fuelCardNumber;
	double fuelCardBalance;

	int drugstoreNumber;
	double drugstoreCardBalance;

	public Consumer() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(int documentNumber) {
		this.documentNumber = documentNumber;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getMobilePhoneNumber() {
		return mobilePhoneNumber;
	}

	public void setMobilePhoneNumber(int mobilePhoneNumber) {
		this.mobilePhoneNumber = mobilePhoneNumber;
	}

	public int getResidencePhoneNumber() {
		return residencePhoneNumber;
	}

	public void setResidencePhoneNumber(int residencePhoneNumber) {
		this.residencePhoneNumber = residencePhoneNumber;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPortalCode() {
		return portalCode;
	}

	public void setPortalCode(int portalCode) {
		this.portalCode = portalCode;
	}

	public int getFoodCardNumber() {
		return foodCardNumber;
	}

	public void setFoodCardNumber(int foodCardNumber) {
		this.foodCardNumber = foodCardNumber;
	}

	public double getFoodCardBalance() {
		return foodCardBalance;
	}

	public void setFoodCardBalance(double foodCardBalance) {
		this.foodCardBalance = foodCardBalance;
	}

	public int getFuelCardNumber() {
		return fuelCardNumber;
	}

	public void setFuelCardNumber(int fuelCardNumber) {
		this.fuelCardNumber = fuelCardNumber;
	}

	public double getFuelCardBalance() {
		return fuelCardBalance;
	}

	public void setFuelCardBalance(double fuelCardBalance) {
		this.fuelCardBalance = fuelCardBalance;
	}

	public int getDrugstoreNumber() {
		return drugstoreNumber;
	}

	public void setDrugstoreNumber(int drugstoreNumber) {
		this.drugstoreNumber = drugstoreNumber;
	}

	public double getDrugstoreCardBalance() {
		return drugstoreCardBalance;
	}

	public void setDrugstoreCardBalance(double drugstoreCardBalance) {
		this.drugstoreCardBalance = drugstoreCardBalance;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Consumer consumer = (Consumer) o;
		return documentNumber == consumer.documentNumber && mobilePhoneNumber == consumer.mobilePhoneNumber
				&& residencePhoneNumber == consumer.residencePhoneNumber && phoneNumber == consumer.phoneNumber
				&& number == consumer.number && portalCode == consumer.portalCode
				&& foodCardNumber == consumer.foodCardNumber
				&& Double.compare(consumer.foodCardBalance, foodCardBalance) == 0
				&& fuelCardNumber == consumer.fuelCardNumber
				&& Double.compare(consumer.fuelCardBalance, fuelCardBalance) == 0
				&& drugstoreNumber == consumer.drugstoreNumber
				&& Double.compare(consumer.drugstoreCardBalance, drugstoreCardBalance) == 0
				&& Objects.equals(id, consumer.id) && Objects.equals(name, consumer.name)
				&& Objects.equals(birthDate, consumer.birthDate) && Objects.equals(email, consumer.email)
				&& Objects.equals(street, consumer.street) && Objects.equals(city, consumer.city)
				&& Objects.equals(country, consumer.country);
	}

}
