/*package com.royalgolf.serviceimpl;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Service;

import com.royalgolf.beans.Status;
import com.royalgolf.request.UserRegistrationRequest;

@Service
public class RegistrationService {

	@PersistenceContext
	private EntityManager em;

	public Status registration(UserRegistrationRequest registerRequest) {
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

			spq.setParameter("RegNo", registerRequest.getRegNo());
			spq.setParameter("Name", registerRequest.getName());
			spq.setParameter("BuildingNo", registerRequest.getBuildingNo());
			spq.setParameter("StreetLine1", registerRequest.getStreetLine1());
			spq.setParameter("StreetLine2", registerRequest.getStreetLine2());
			spq.setParameter("CityCode", registerRequest.getCityCode());
			spq.setParameter("StateCode", registerRequest.getStateCode());
			spq.setParameter("CtryCode", registerRequest.getCtryCode());
			spq.setParameter("ZipCode", registerRequest.getZipCode());
			spq.setParameter("Tel1", registerRequest.getTel1());
			spq.setParameter("Fax", registerRequest.getFax());
			spq.setParameter("Email", registerRequest.getEmail());
			spq.setParameter("Type", registerRequest.getType());
			spq.setParameter("Founded", registerRequest.getFounded());
			spq.setParameter("NoOfEmployees", registerRequest.getNoOfEmployees());
			spq.setParameter("Website", registerRequest.getWebsite());
			spq.setParameter("AboutUs", registerRequest.getAboutUs());
			spq.setParameter("Contactperson_Name", registerRequest.getContacterson_Name());
			spq.setParameter("Contactperson_Position", registerRequest.getContactperson_designation());
			spq.setParameter("Contactperson_PhneNo", registerRequest.getContactperson_MobileNo());
			spq.setParameter("Contactperson_FaxNo", registerRequest.getContactperson_FaxNo());
			spq.setParameter("Contactperson_MobileNo", registerRequest.getContactperson_MobileNo());
			spq.setParameter("Contactperson_Email", registerRequest.getContactperson_Email());
			spq.setParameter("Contactperson_designation", registerRequest.getContactperson_designation());
			spq.setParameter("approve", registerRequest.getApprove());
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
*/