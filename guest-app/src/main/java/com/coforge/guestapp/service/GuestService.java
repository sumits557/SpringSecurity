package com.coforge.guestapp.service;

import com.coforge.guestapp.domain.Guest;
import com.coforge.guestapp.domain.GuestModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Sumit S.
 */
@Service
public class GuestService {
    private static final String GUESTS = "/guests";
    private static final String SLASH = "/";

    @Value("${atlanta.guest.service.url}")
    private String guestServiceUrl;

    private final RestTemplate restTemplate = new RestTemplate();

    public List<Guest> getAllGuests(){
        String url = guestServiceUrl + GUESTS;
        HttpEntity<String> request = new HttpEntity<>(null, null);
        return this.restTemplate.exchange(url, HttpMethod.GET, request, new ParameterizedTypeReference<List<Guest>>() { }).getBody();
    }

    public Guest addGuest(GuestModel guestModel){
        String url = guestServiceUrl + GUESTS;
        HttpEntity<GuestModel> request = new HttpEntity<>(guestModel, null);
        return this.restTemplate.exchange(url, HttpMethod.POST, request, Guest.class).getBody();
    }

    public Guest getGuest(long id) {
        String url = guestServiceUrl + GUESTS + SLASH + id;
        HttpEntity<String> request = new HttpEntity<>(null, null);
        return this.restTemplate.exchange(url, HttpMethod.GET, request, Guest.class).getBody();
    }

    public Guest updateGuest(long id, GuestModel guestModel) {
        System.out.println(guestModel);
        String url = guestServiceUrl + GUESTS + SLASH + id;
        HttpEntity<GuestModel> request = new HttpEntity<>(guestModel, null);
        return this.restTemplate.exchange(url, HttpMethod.PUT, request, Guest.class).getBody();
    }
}
