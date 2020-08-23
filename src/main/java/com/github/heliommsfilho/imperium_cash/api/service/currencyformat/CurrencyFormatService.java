package com.github.heliommsfilho.imperium_cash.api.service.currencyformat;

import com.github.heliommsfilho.imperium_cash.api.model.CurrencyFormat;
import com.github.heliommsfilho.imperium_cash.api.repository.currencyformat.CurrencyFormatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyFormatService {

    public final CurrencyFormatRepository currencyFormatRepository;

    @Autowired
    public CurrencyFormatService(CurrencyFormatRepository currencyFormatRepository) {
        this.currencyFormatRepository = currencyFormatRepository;
    }

    public List<CurrencyFormat> getAll() {
        return currencyFormatRepository.findAll();
    }
}
