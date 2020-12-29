package com.coforge.guestservices;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Sumit S.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class GuestNotFoundException extends RuntimeException {
    public GuestNotFoundException(String s) {
        super(s);
    }
}
