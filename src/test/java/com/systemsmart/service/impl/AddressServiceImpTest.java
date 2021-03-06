package com.systemsmart.service.impl;

//216279631 Mzileni Inga

import com.systemsmart.entity.Address;
import com.systemsmart.factory.AddressFactory;
import com.systemsmart.service.AddressService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

import static org.junit.Assert.*;

public class AddressServiceImpTest {

    @Autowired
    private static AddressService service ;
    private static com.systemsmart.entity.Address address = AddressFactory.createAddress("012345", "2591", "Msenge", "Phlippi", "Cape Town", "7785");


    @Test
    public void d_getAll() {
        Set<Address> addresses = service.getAll();
        assertEquals(1, addresses.size());
        System.out.println("Address : " + addresses);
    }

    @Test
    public void a_create() {
        Address created =  service.create(address);
        Assert.assertEquals(address.getAddressId(), created.getAddressId());
        System.out.println("Created: " + created);
    }

    @Test
    public void b_read() {
        Address read =  service.read(address.toString());
        System.out.println("Read: " + read);
    }

    @Test
    public void c_update() {
        Address updated = new Address.Builder().copy(address).build();
        updated =  service.update(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    public void f_delete() {
        boolean deleted = service.delete(address.toString());
        Assert.assertTrue(deleted);

    }

}