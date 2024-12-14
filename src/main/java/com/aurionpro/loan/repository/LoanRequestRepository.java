package com.aurionpro.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurionpro.loan.entity.LoanRequest;

public interface LoanRequestRepository extends JpaRepository<LoanRequest, Integer>{

}
