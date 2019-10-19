package eu.mauzi.term.odata;

import javax.persistence.Persistence;

import org.apache.olingo.odata2.api.processor.ODataSingleProcessor;
import org.apache.olingo.odata2.jpa.processor.api.ODataJPAContext;
import org.apache.olingo.odata2.jpa.processor.api.ODataJPAServiceFactory;
import org.apache.olingo.odata2.jpa.processor.api.exception.ODataJPARuntimeException;

public class CustomODataJPAServiceFactory extends ODataJPAServiceFactory
{
	private static final String PUNIT_NAME = "TermOData";
	private static final String JPA_EDM_MAPPING_MODEL = "JPAEDMMappingModel.xml";

	@Override
	public ODataJPAContext initializeODataJPAContext() throws ODataJPARuntimeException
	{
		ODataJPAContext context = getODataJPAContext();

		context.setEntityManagerFactory(Persistence.createEntityManagerFactory(PUNIT_NAME));
		context.setPersistenceUnitName(PUNIT_NAME);
		context.setJPAEdmMappingModel(JPA_EDM_MAPPING_MODEL);

		return context;
	}

	@Override
	public ODataSingleProcessor createCustomODataProcessor(ODataJPAContext oDataJPAContext)
	{
		return new CustomODataJPAProcessor(oDataJPAContext);
	}
}
