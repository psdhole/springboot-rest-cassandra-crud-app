package com.isom.service;

import com.datastax.driver.core.utils.UUIDs;
import com.isom.service.dao.IFODao;
import com.isom.service.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class ISOMApplication implements CommandLineRunner {

    @Autowired
    private IFODao foRepository;

    public static void main(String[] args) {
        SpringApplication.run(ISOMApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Add first entry to the DB.
        List<ItemLine> itemLine = new ArrayList<>();
        List<ServiceType> serviceType = new ArrayList<>();
        List<PossibleSolution> PossibleSolution = new ArrayList<>();
        List<UnavailableLine> unavailableLineList = new ArrayList<>();
        List<DeliveryLine> deliveryLineList = new ArrayList<>();
        List<PickupPoint> pickupPointList = new ArrayList<>();
        List<DeliveryAssociation> deliveryAssociationList = new ArrayList<>();
        List<PossibleDeliveryLine> possibleDeliveryLineList = new ArrayList<>();

        itemLine.add(new ItemLine(11L, 1L, "test", 1L, 2L, "test", 1D, "test", 2D, "test", 3L, "Test"));
        deliveryAssociationList.add(new DeliveryAssociation(5L, 9L));
        possibleDeliveryLineList.add(new PossibleDeliveryLine("4321", deliveryAssociationList));
        pickupPointList.add(new PickupPoint("adressLine1", "addressLine2", "addressLine3", "addressLine4", "city", "country", 12D, "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test"));
        deliveryLineList.add(new DeliveryLine("test", "test", "test", "test", pickupPointList));
        unavailableLineList.add(new UnavailableLine(11L, 22L, "UnavailableLine", "UnavailableReason"));
        PossibleSolution.add(new PossibleSolution("1234", "service", unavailableLineList, deliveryLineList, new EarliestShipDate("19-05-2020")));
        serviceType.add(new ServiceType("123", PossibleSolution, possibleDeliveryLineList));

        this.foRepository.save(new ISOMFulfilment(UUIDs.timeBased(), 100D, "Xyz", new BusinessUnit("STO", 856L), new ShipToAddress("Sweden", "name@email.com", "AB321"), itemLine, serviceType));

    }
}
