package com.systemsmart.service.impl;
//216279631 Mzileni Inga
import com.systemsmart.entity.Address;
import com.systemsmart.repository.AddressRepository;
import com.systemsmart.repository.impl.AddressRepositoryImpl;
import com.systemsmart.service.AddressService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class AddressServiceImp implements AddressService {
    private AddressRepository repository;
    private static AddressService service = null;

    private AddressServiceImp() {
       this.repository = AddressRepositoryImpl.getAddressRepository();
    }

    public static AddressService getService() {
        if (service == null) service = new AddressServiceImp();
        return service;
    }

    @Override
    public Set<Address> getAddressStreet() {
        Set<Address> address = getAll();
        Set<Address> street = new HashSet<>();
        for (Address addresses : address) {
            if (addresses.getStreet() == "9520 Msenge Street") {
                street.add(addresses);
            }
        }
        return street;
    }

    @Override
    public Set<Address> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Address create(Address t) {
        return this.repository.create((Address) t);
    }

    @Override
    public Address read(String o) {
        return this.repository.read((String) o);

    }

    @Override
    public Address update(Address t) {
        return this.repository.update((Address) t);
    }

    @Override
    public boolean delete(String o) {

        return this.repository.delete((String) o);

    }
}