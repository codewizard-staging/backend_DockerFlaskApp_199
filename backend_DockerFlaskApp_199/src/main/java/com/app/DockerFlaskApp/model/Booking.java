package com.app.DockerFlaskApp.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.app.DockerFlaskApp.model.RoadsideAssistance;
import com.app.DockerFlaskApp.model.Verfication;
import com.app.DockerFlaskApp.model.Payment;
import com.app.DockerFlaskApp.model.ServiceCrew;
import com.app.DockerFlaskApp.model.Insurance;
import com.app.DockerFlaskApp.model.ExtendBooking;
import com.app.DockerFlaskApp.model.Booking;
import com.app.DockerFlaskApp.model.RentalCompany;
import com.app.DockerFlaskApp.model.ReturnBikeInspection;
import com.app.DockerFlaskApp.model.Customer;
import com.app.DockerFlaskApp.model.Bike;
import com.app.DockerFlaskApp.model.ReturnRentedBike;
import com.app.DockerFlaskApp.enums.IDTypes;
import com.app.DockerFlaskApp.converter.IDTypesConverter;
import com.app.DockerFlaskApp.converter.DurationConverter;
import com.app.DockerFlaskApp.converter.UUIDToByteConverter;
import com.app.DockerFlaskApp.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Booking")
@Table(name = "\"Booking\"", schema =  "\"dockerflaskapp\"")
@Data
                        
public class Booking {
	public Booking () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"BookingID\"", nullable = true )
  private Integer bookingID;
	  
  @Column(name = "\"DateOfBooking\"", nullable = true )
  @Temporal(value = TemporalType.DATE)
  private Date dateOfBooking;  
  
	  
  @Column(name = "\"FromDate\"", nullable = true )
  @Temporal(value = TemporalType.DATE)
  private Date fromDate;  
  
	  
  @Column(name = "\"ToDate\"", nullable = true )
  @Temporal(value = TemporalType.DATE)
  private Date toDate;  
  
	  
  @Column(name = "\"BikeAvailability\"", nullable = true )
  private Boolean bikeAvailability;
  
	  
  @Column(name = "\"TokenAmount\"", nullable = true )
  private Integer tokenAmount;
  
	  
  @Column(name = "\"Amtpaidmode\"", nullable = true )
  private Boolean amtpaidmode;
  
  
  
  
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "\"BookingBike\"", referencedColumnName = "\"BikeID\"", insertable = false, updatable = false)
	private Bike bike;
	
	@Column(name = "\"BookingBike\"")
	private Integer bookingBike;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "\"BookingVerfication\"", referencedColumnName = "\"VerificationID\"", insertable = false, updatable = false)
	private Verfication verfication;
	
	@Column(name = "\"BookingVerfication\"")
	private Integer bookingVerfication;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "\"BookingPayment\"", referencedColumnName = "\"PaymentID\"", insertable = false, updatable = false)
	private Payment payment;
	
	@Column(name = "\"BookingPayment\"")
	private Integer bookingPayment;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "\"BookingAssitance\"", referencedColumnName = "\"CustomerID\"", insertable = false, updatable = false)
	private RoadsideAssistance assitance;
	
	@Column(name = "\"BookingAssitance\"")
	private Integer bookingAssitance;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "\"BookingInsurance\"", referencedColumnName = "\"InsuranceID\"", insertable = false, updatable = false)
	private Insurance insurance;
	
	@Column(name = "\"BookingInsurance\"")
	private Integer bookingInsurance;
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Booking [" 
  + "BookingID= " + bookingID  + ", " 
  + "DateOfBooking= " + dateOfBooking  + ", " 
  + "FromDate= " + fromDate  + ", " 
  + "ToDate= " + toDate  + ", " 
  + "BikeAvailability= " + bikeAvailability  + ", " 
  + "TokenAmount= " + tokenAmount  + ", " 
  + "Amtpaidmode= " + amtpaidmode 
 + "]";
	}
	
}