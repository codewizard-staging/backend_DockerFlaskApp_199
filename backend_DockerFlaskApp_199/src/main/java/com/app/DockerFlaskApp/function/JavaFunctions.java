package com.app.DockerFlaskApp.function;

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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.DockerFlaskApp.repository.VerficationRepository;
import com.app.DockerFlaskApp.repository.PaymentRepository;
import com.app.DockerFlaskApp.repository.CustomerRepository;
import com.app.DockerFlaskApp.repository.InsuranceRepository;
import com.app.DockerFlaskApp.repository.ServiceCrewRepository;
import com.app.DockerFlaskApp.repository.ReturnRentedBikeRepository;
import com.app.DockerFlaskApp.repository.BookingRepository;
import com.app.DockerFlaskApp.repository.RoadsideAssistanceRepository;
import com.app.DockerFlaskApp.repository.ExtendBookingRepository;
import com.app.DockerFlaskApp.repository.RentalCompanyRepository;
import com.app.DockerFlaskApp.repository.ReturnBikeInspectionRepository;
import com.app.DockerFlaskApp.repository.BikeRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
