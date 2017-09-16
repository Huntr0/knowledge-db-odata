package eu.mauzi.term.odata;

import org.apache.olingo.odata2.jpa.processor.api.ODataJPAContext;
import org.apache.olingo.odata2.jpa.processor.api.ODataJPADefaultProcessor;

public class CustomODataJPAProcessor extends ODataJPADefaultProcessor
{
	public CustomODataJPAProcessor(ODataJPAContext oDataJPAContext)
	{
		super(oDataJPAContext);
	}
}
