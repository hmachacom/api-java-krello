package org.sofka.mykrello.model.service;

import java.util.List;

import org.sofka.mykrello.model.domain.LogDomain;
import org.sofka.mykrello.model.service.interfaces.LogServiceInterface;
import org.springframework.stereotype.Service;

@Service
public class LogService implements LogServiceInterface {

    /* (non-Javadoc)
     * @see org.sofka.mykrello.model.service.interfaces.LogServiceInterface#findById(java.lang.Integer)
     */
    @Override
    public List<LogDomain> findById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.sofka.mykrello.model.service.interfaces.LogServiceInterface#create(org.sofka.mykrello.model.domain.LogDomain)
     */
    @Override
    public LogDomain create(LogDomain log) {
        // TODO Auto-generated method stub
        return null;
    }
}
