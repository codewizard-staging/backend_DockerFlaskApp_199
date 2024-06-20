package com.app.DockerFlaskApp.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

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

@Entity(name = "CustomerBookings")
@Table(schema = "\"dockerflaskapp\"", name = "\"CustomerBookings\"")
@Data
public class CustomerBookings{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"CustomerID\"")
	private Integer customerID;

    
    @Column(name = "\"BookingID\"")
    private Integer bookingID;
 
}