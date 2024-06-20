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

@Entity(name = "Verfication")
@Table(name = "\"Verfication\"", schema =  "\"dockerflaskapp\"")
@Data
                        
public class Verfication {
	public Verfication () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"VerificationID\"", nullable = true )
  private Integer verificationID;
	  
  @Column(name = "\"IDType\"", nullable = true)
  @Enumerated(value = EnumType.ORDINAL)
  @Convert(converter = IDTypesConverter.class)
  private IDTypes iDType;
  
	  
  @Column(name = "\"LicenseNumber\"", nullable = true )
  private Long licenseNumber;
  
	  
  @Column(name = "\"DeliveryFrom\"", nullable = true )
  private Boolean deliveryFrom;
  
	  
  @Column(name = "\"IsVerificationDone\"", nullable = true )
  private Boolean isVerificationDone;
  
	  
  @Column(name = "\"DateOfVerification\"", nullable = true )
  @Temporal(value = TemporalType.DATE)
  private Date dateOfVerification;  
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Verfication [" 
  + "VerificationID= " + verificationID  + ", " 
  + "IDType= " + iDType  + ", " 
  + "LicenseNumber= " + licenseNumber  + ", " 
  + "DeliveryFrom= " + deliveryFrom  + ", " 
  + "IsVerificationDone= " + isVerificationDone  + ", " 
  + "DateOfVerification= " + dateOfVerification 
 + "]";
	}
	
}