package com.royalgolf.serviceimpl;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Service;

import com.royalgolf.beans.RegistrationBean;
import com.royalgolf.beans.Status;

@Service
public class RegistrationService {

	@PersistenceContext
	private EntityManager em;

	public Status registration(RegistrationBean registrationBean) {
		Status status = new Status();
		try {
			StoredProcedureQuery spq = em.createStoredProcedureQuery("dbo.sp_registration");
			spq.registerStoredProcedureParameter("RegNo", String.class, ParameterMode.IN);
			spq.registerStoredProcedureParameter("Name", String.class, ParameterMode.IN);
			spq.registerStoredProcedureParameter("BuildingNo", String.class, ParameterMode.IN);
			spq.registerStoredProcedureParameter("StreetLine1", String.class, ParameterMode.IN);
			spq.registerStoredProcedureParameter("StreetLine2", String.class, ParameterMode.IN);
			spq.registerStoredProcedureParameter("CityCode", String.class, ParameterMode.IN);
			spq.registerStoredProcedureParameter("StateCode", String.class, ParameterMode.IN);
			spq.registerStoredProcedureParameter("CtryCode", String.class, ParameterMode.IN);
			spq.registerStoredProcedureParameter("ZipCode", String.class, ParameterMode.IN);
			spq.registerStoredProcedureParameter("Tel1", String.class, ParameterMode.IN);
			spq.registerStoredProcedureParameter("Fax", String.class, ParameterMode.IN);
			spq.registerStoredProcedureParameter("Email", String.class, ParameterMode.IN);
			spq.registerStoredProcedureParameter("Type", String.class, ParameterMode.IN);
			spq.registerStoredProcedureParameter("Founded", String.class, ParameterMode.IN);
			spq.registerStoredProcedureParameter("NoOfEmployees", String.class, ParameterMode.IN);
			spq.registerStoredProcedureParameter("Website", String.class, ParameterMode.IN);
			spq.registerStoredProcedureParameter("AboutUs", String.class, ParameterMode.IN);
			spq.registerStoredProcedureParameter("Contactperson_Name", String.class, ParameterMode.IN);
			spq.registerStoredProcedureParameter("Contactperson_Position", String.class, ParameterMode.IN);
			spq.registerStoredProcedureParameter("Contactperson_PhneNo", String.class, ParameterMode.IN);
			spq.registerStoredProcedureParameter("Contactperson_FaxNo", String.class, ParameterMode.IN);
			spq.registerStoredProcedureParameter("Contactperson_MobileNo", String.class, ParameterMode.IN);
			spq.registerStoredProcedureParameter("Contactperson_Email", String.class, ParameterMode.IN);
			spq.registerStoredProcedureParameter("Contactperson_designation", String.class, ParameterMode.IN);
			spq.registerStoredProcedureParameter("approve", String.class, ParameterMode.IN);

			spq.setParameter("RegNo", registrationBean.getRegNo());
			spq.setParameter("Name", registrationBean.getName());
			spq.setParameter("BuildingNo", registrationBean.getBuildingNo());
			spq.setParameter("StreetLine1", registrationBean.getStreetLine1());
			spq.setParameter("StreetLine2", registrationBean.getStreetLine2());
			spq.setParameter("CityCode", registrationBean.getCityCode());
			spq.setParameter("StateCode", registrationBean.getStateCode());
			spq.setParameter("CtryCode", registrationBean.getCtryCode());
			spq.setParameter("ZipCode", registrationBean.getZipCode());
			spq.setParameter("Tel1", registrationBean.getTel1());
			spq.setParameter("Fax", registrationBean.getFax());
			spq.setParameter("Email", registrationBean.getEmail());
			spq.setParameter("Type", registrationBean.getType());
			spq.setParameter("Founded", registrationBean.getFounded());
			spq.setParameter("NoOfEmployees", registrationBean.getNoOfEmployees());
			spq.setParameter("Website", registrationBean.getWebsite());
			spq.setParameter("AboutUs", registrationBean.getAboutUs());
			spq.setParameter("Contactperson_Name", registrationBean.getContacterson_Name());
			spq.setParameter("Contactperson_Position", registrationBean.getContactperson_designation());
			spq.setParameter("Contactperson_PhneNo", registrationBean.getContactperson_MobileNo());
			spq.setParameter("Contactperson_FaxNo", registrationBean.getContactperson_FaxNo());
			spq.setParameter("Contactperson_MobileNo", registrationBean.getContactperson_MobileNo());
			spq.setParameter("Contactperson_Email", registrationBean.getContactperson_Email());
			spq.setParameter("Contactperson_designation", registrationBean.getContactperson_designation());
			spq.setParameter("approve", registrationBean.getApprove());
			boolean execute = spq.execute();
			if (!execute) {
				status.setSuccess_code("200");
			} else {
				status.setError_code("500");
			}

		} catch (Exception e) {
			status.setError_code("500");
			System.out.println(e);
		}
		return status;

	}

}
